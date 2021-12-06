package pages.edit_account_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EditAccountInformationPage extends BasePage {

    @FindBy(name = "firstname")
    private WebElement firstNameInput;

    @FindBy(name = "lastname")
    private WebElement lastNameInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

}
