package opencart;

import driver.DriverRepository;
import listener.RetryAnalyser;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup(ITestContext iTestContext) {
        for (ITestNGMethod method : iTestContext.getAllTestMethods()) {
            method.setRetryAnalyzerClass(RetryAnalyser.class);
        }
        DriverRepository.downloadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }


   @AfterClass
    public void closeBrowser() {
        DriverRepository.closeBrowser();
   }
}