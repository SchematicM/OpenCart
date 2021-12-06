package steps;

import datamodel.ChangePasswordModel;
import org.testng.Assert;
import pages.change_password_pages.ChangePasswordPage;
import pages.change_password_pages.SuccessChangePasswordPage;
import repository.ChangePasswordModelRepository;

public class ChangePasswordPageBL {

    private final ChangePasswordPage changePasswordPage;
    private SuccessChangePasswordPage successChangePasswordPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL successfulChangePassword() {
        ChangePasswordModel changePasswordModel = ChangePasswordModelRepository.getValidChangePasswordModel();
        inputCorrectPassword(changePasswordModel.getPassword());
        clickOnContinueButton();

        successChangePasswordPage = new SuccessChangePasswordPage();
        return this;
    }

    public ChangePasswordPageBL unsuccessfulChangePassword() {
        ChangePasswordModel changePasswordModel = ChangePasswordModelRepository.getInValidChangePasswordModel();
        inputIncorrectPassword(changePasswordModel.getPassword());
        inputIncorrectPasswordConfirm(changePasswordModel.getPasswordConfirm());
        clickOnContinueButton();
        return this;
    }

    private void inputCorrectPassword(String password) {
        changePasswordPage.getPasswordInput().clear();
        changePasswordPage.getPasswordInput().sendKeys(password);
        changePasswordPage.getPasswordConfirmInput().clear();
        changePasswordPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void inputIncorrectPassword(String password) {
        changePasswordPage.getPasswordInput().clear();
        changePasswordPage.getPasswordInput().sendKeys(password);
    }

    private void inputIncorrectPasswordConfirm(String passwordConfirm) {
        changePasswordPage.getPasswordConfirmInput().clear();
        changePasswordPage.getPasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void clickOnContinueButton() {
        changePasswordPage.getContinueButton().click();
    }

    public void verifyChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(successChangePasswordPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page alert");
    }

    public void verifyChangePasswordsNotMatch() {
        String expectedMessage = "Password confirmation does not match password!";
        Assert.assertTrue(changePasswordPage.getUnsuccessfulChangePasswordMatch().contains(expectedMessage), "Password and Password confirm are the same");
    }

}

