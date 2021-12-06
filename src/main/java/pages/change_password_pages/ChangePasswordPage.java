package pages.change_password_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ChangePasswordPage extends BasePage {

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//div[@class = 'text-danger']")
    private WebElement unsuccessfulChangePasswordMatch;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public String getUnsuccessfulChangePasswordMatch() {
        return unsuccessfulChangePasswordMatch.getText();
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

}
