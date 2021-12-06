package pages.log_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Continue']")
    private WebElement continueCreateAccountButton;

    @FindBy(name = "email")
    private WebElement emailAddressInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[@class = 'form-group']/a")
    private WebElement forgottenPassword;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
    private WebElement unsuccessfulLoginAlert; //new

    public WebElement getContinueCreateAccountButton() {return continueCreateAccountButton;}

    public WebElement getEmailInput() {
        return emailAddressInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getForgottenPassword() {
        return forgottenPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getUnsuccessfulLoginAlert() {
        return unsuccessfulLoginAlert;
    }



}
