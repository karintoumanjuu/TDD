import xunit


class TestCaseTest(xunit.TestCase):
    def setUp(self):
        self.test = xunit.WasRun("testMethod")

    def testRunning(self):
        self.test.run()
        assert (self.test.wasRun)
        
    def testSetUp(self):
        self.test.run()
        assert(self.test.wasSetUp)

if __name__ == '__main__':
    TestCaseTest("testRunning").run()
    TestCaseTest("testSetUp").run()
