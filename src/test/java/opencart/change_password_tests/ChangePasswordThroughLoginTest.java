package opencart.change_password_tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class ChangePasswordThroughLoginTest extends BaseTest {

    @BeforeClass
    public void loginMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify changing password after user login - positive case")
    @Test
    public void successfulChangePasswordThroughLoginPositiveTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnChangePasswordButton()
                .getChangePasswordPageBL()
                .successfulChangePassword().verifyChangePassword();

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify changing password after user login - negative case")
    @Test
    public void unsuccessfulChangePasswordThroughLoginNegativeTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnChangePasswordButton()
                .getChangePasswordPageBL()
                .unsuccessfulChangePassword().verifyChangePasswordsNotMatch();

    }
}
