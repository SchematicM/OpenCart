package opencart.edit_information_tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.EditAccountInformationPageBL;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class EditAccountThroughRegistrationTest extends BaseTest {

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
    @Description("Verify changing of all account information after registration")
    @Test
    public void changeAllAccountThroughRegistrationTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .editAllAccount();
        editAccountInformationPageBL.verifyEditAccount();
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Verify changing of account first name after registration")
    @Test
    public void changeUserFirstNameThroughRegistrationTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserFirstName();
        editAccountInformationPageBL.verifyEditAccount();
    }

}
