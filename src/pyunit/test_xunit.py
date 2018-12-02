import xunit


class TestCaseTest(xunit.TestCase):
    def testTemplateMethod(self):
        test = xunit.WasRun("testMethod")
        test.run()
        assert ("setUp testMethod tearDown " == test.log)
        
    def testResult(self):
        test = xunit.WasRun("testMethod")
        result = test.run()
        assert ("1 run, 0 failed" == result.summary())
        
    def testFailedResult(self):
        test = xunit.WasRun("testBrokenMethod")
        result = test.run()
        assert ("1 run, 1 failed" == result.summary())

    def testFailedResultFormatting(self):
        result = xunit.TestResult()
        result.testStarted()
        result.testFailed()
        assert ("1 run, 1 failed" == result.summary())

if __name__ == '__main__':
    TestCaseTest("testTemplateMethod").run()
    TestCaseTest("testResult").run()
    TestCaseTest("testFailedResult").run()
    TestCaseTest("testFailedResultFormatting").run()



