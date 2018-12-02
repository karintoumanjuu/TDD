class TestCase:
    def __init__(self, name):
        self.name = name

    def run(self, result):
        result.testStarted()
        self.setUp()
        try:
            method = getattr(self, self.name)
            method()
        except:
            result.testFailed()
        self.tearDown()

    def setUp(self):
        pass

    def tearDown(self):
        pass

class TestResult:
    def __init__(self):
        self.runCount = 0
        self.errorCount = 0

    def testStarted(self):
        self.runCount += 1

    def testFailed(self):
        self.errorCount += 1

    def summary(self):
        return "%d run, %d failed" % (self.runCount, self.errorCount)


class WasRun(TestCase):
    def testMethod(self):
        self.log += "testMethod "

    def setUp(self):
        self.log = "setUp "

    def tearDown(self):
        self.log += "tearDown "

    def testBrokenMethod(self):
        raise Exception

class TestSuite:
    def __init__(self):
        self.tests = []

    def add(self, test):
        self.tests.append(test)

    def run(self, result):
        for test in self.tests:
            test.run(result)