package opencart.change_password_tests;


import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.ChangePasswordPageBL;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class ChangePasswordThroughRegistrationTest extends BaseTest {

    @BeforeClass
    public void registrationMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify changing password after user registration - positive case")
    @Test
    public void successfulChangePasswordThroughRegistrationPositiveTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().successfulChangePassword();
        changePasswordPageBL.verifyChangePassword();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify changing password after user registration - negative case")
    @Test
    public void unsuccessfulChangePasswordThroughRegistrationNegativeTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().unsuccessfulChangePassword();
        changePasswordPageBL.verifyChangePasswordsNotMatch();
    }
}
