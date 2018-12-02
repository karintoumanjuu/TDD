import xunit


class TestCaseTest(xunit.TestCase):
    def testTemplateMethod(self):
        test = xunit.WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)

if __name__ == '__main__':
    TestCaseTest("testTemplateMethod").run()
