class TestCase:
    def __init__(self, name):
        self.name = name

    def run(self):
        result = TestResult()
        result.testStarted()
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
        return result

    def setUp(self):
        pass

    def tearDown(self):
        pass

class TestResult:
    def __init__(self):
        self.runCount = 0

    def testStarted(self):
        self.runCount += 1

    def summary(self):
        return "%d run, 0 failed" % self.runCount


class WasRun(TestCase):
    def testMethod(self):
        self.log += "testMethod "

    def setUp(self):
        self.log = "setUp "

    def tearDown(self):
        self.log += "tearDown "

    def testBrokenMethod(self):
        raise Exception