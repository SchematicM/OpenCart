package pages.adminUtils;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class AdminLoginPage extends BasePage {
    @FindBy(name = "username")
    private WebElement inputUsername;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//span[@class = 'help-block']")
    private WebElement forgottenPassword;

    @FindBy(xpath = "//i[@class = 'fa fa-key']")
    private WebElement loginButton;
}