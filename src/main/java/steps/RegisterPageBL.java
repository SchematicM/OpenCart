package steps;


import datamodel.RegisterModel;
import org.testng.Assert;
import pages.register_pages.RegisterPage;
import pages.register_pages.SuccessRegisterPage;
import repository.RegisterModelRepository;
import util.DriverUtils;


public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessRegisterPage successRegisterPage;

    public RegisterPageBL() {
        registerPage = new RegisterPage();
    }

    public RegisterPageBL registerNewValidPerson() {
        RegisterModel registerModel = RegisterModelRepository.getValidRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputCorrectPassword(registerModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();

        successRegisterPage = new SuccessRegisterPage();
        return this;
    }

    public RegisterPageBL registerNewInvalidPerson() {
        RegisterModel registerModel = RegisterModelRepository.getInValidRegisterModel();
        inputFirstName(registerModel.getFirstName());
        inputLastName(registerModel.getLastName());
        inputEmail(registerModel.getEmail());
        inputTelephone(registerModel.getTelephone());
        inputIncorrectPassword(registerModel.getPassword());
        inputIncorrectPasswordConfirm(registerModel.getPasswordConfirm());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();
        return this;
    }

    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputCorrectPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void inputIncorrectPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
    }

    private void inputIncorrectPasswordConfirm(String passwordConfirm) {
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void chooseSubscribe(int value) {
        new DriverUtils().clickOnElementJS(registerPage.getSubscribeRadioButton(value));
    }

    private void clickPolicyCheckbox() {
        new DriverUtils().clickOnElementJS(registerPage.getPolicy());
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public void verifyUserRegistration() {
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successRegisterPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

    public void verifyPasswordsNotMatch() {
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertTrue(registerPage.getUnsuccessfulPasswordMatch().contains(expectedMessage),"Password and Password confirm are the same");
    }

}