package steps.log_steps;

import datamodel.LoginModel;
import driver.DriverRepository;
import org.testng.Assert;
import pages.log_pages.LoginPage;
import repository.LoginModelRepository;
import steps.MyAccountPageBL;
import steps.RegisterPageBL;

public class LoginPageBL {

    private LoginPage loginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginTestUser() {
        LoginModel loginModel = LoginModelRepository.getValidTestUserModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    public LoginPageBL loginValidUser() {
       LoginModel loginModel = LoginModelRepository.getValidLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    public LoginPageBL loginInvalidUser() {
        LoginModel loginModel = LoginModelRepository.getInvalidLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    public LoginPageBL loginUserOne() {
        LoginModel loginModel = LoginModelRepository.getUserOne();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }


    public RegisterPageBL continueButtonForCreatingNewAccount() {
        loginPage.getContinueCreateAccountButton().click();
        return new RegisterPageBL();
    }


    public ForgottenPasswordPageBL forgottenPasswordButton() {
        loginPage.getForgottenPassword().click();
        return new ForgottenPasswordPageBL();
    }

    private MyAccountPageBL clickOnLoginButton() {
        loginPage.getLoginButton().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL successfulLoginCheck() {
        String expected = "http://localhost/opencart/upload/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual,"Links do not match");
        return new MyAccountPageBL();
    }

    public LoginPageBL unsuccessfulLoginCheck() {
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = loginPage.getUnsuccessfulLoginAlert().getText();
        Assert.assertEquals(expected, actual,"Alert is absent");
        return this;
    }

    public MyAccountPageBL getMyAccountPageBL() {
        return new MyAccountPageBL();
    }

}
