package pages.register_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RegisterPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//div[@class = 'text-danger']")
    private WebElement unsuccessfulPasswordMatch;

    @FindBy(name = "agree")
    private WebElement policy;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getSubscribeRadioButton(int value) {
        return driver.findElement(By.xpath("//*[@type = 'radio' and @value = '" + value + "']"));
    }


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

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public String getUnsuccessfulPasswordMatch() { return unsuccessfulPasswordMatch.getText(); }

    public WebElement getPolicy() {return policy;}

    public WebElement getContinueButton() {return continueButton;}
}