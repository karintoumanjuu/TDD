import xunit


class TestCaseTest(xunit.TestCase):
    def testRunning(self):
        test = xunit.WasRun("testMethod")
        assert (not test.wasRun)
        test.run()
        assert (test.wasRun)
        

if __name__ == '__main__':
    TestCaseTest("testRunning").run()