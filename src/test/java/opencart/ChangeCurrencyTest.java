package opencart;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.HomePageBL;


import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"€"},{"$"},{"£"}};
    }

    @BeforeClass
    public void navigate()
    {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @Severity(SeverityLevel.NORMAL)
    @Test (dataProvider = "data-provider")
    public void successChangeCurrencyOnHomePageTest2(String val)
    {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnCommonCurrencyButton(val);
        homePageBL.successfulChangeCurrencyCheck(val);
    }
}