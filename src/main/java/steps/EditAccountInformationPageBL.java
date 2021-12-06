package steps;

import datamodel.EditAccountModel;
import org.testng.Assert;
import pages.edit_account_pages.EditAccountInformationPage;
import pages.edit_account_pages.SuccessEditAccountPage;
import repository.EditAccountModelRepository;

public class EditAccountInformationPageBL {

    private final EditAccountInformationPage editAccountInformationPage;
    private SuccessEditAccountPage successEditAccountPage;

    public EditAccountInformationPageBL() {
        editAccountInformationPage = new EditAccountInformationPage();
    }

    public EditAccountInformationPageBL editAllAccount() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }

    public EditAccountInformationPageBL changeUserFirstName() {
        EditAccountModel editAccountModel = EditAccountModelRepository.changeFirstNameModel();
        inputFirstName(editAccountModel.getFirstName());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }

    public EditAccountInformationPageBL changeUserLastName() {
        EditAccountModel editAccountModel = EditAccountModelRepository.changeLastNameModel();
        inputLastName(editAccountModel.getLastName());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }

    public EditAccountInformationPageBL changeUserEmail() {
        EditAccountModel editAccountModel = EditAccountModelRepository.changeEmailModel();
        inputEmail(editAccountModel.getEmail());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }

    public EditAccountInformationPageBL changeUserTelephone() {
        EditAccountModel editAccountModel = EditAccountModelRepository.changeTelephoneModel();
        inputTelephone(editAccountModel.getTelephone());
        clickOnContinueButton();

        successEditAccountPage = new SuccessEditAccountPage();
        return this;
    }


    private void inputFirstName(String firstName) {
        editAccountInformationPage.getFirstNameInput().clear();
        editAccountInformationPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editAccountInformationPage.getLastNameInput().clear();
        editAccountInformationPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editAccountInformationPage.getEmailInput().clear();
        editAccountInformationPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editAccountInformationPage.getTelephoneInput().clear();
        editAccountInformationPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnContinueButton() {
        editAccountInformationPage.getContinueButton().click();
    }


    public void verifyEditAccount() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(successEditAccountPage.getSuccessTitle().getText(), expectedMessage, "Incorrect alert");
    }

}
