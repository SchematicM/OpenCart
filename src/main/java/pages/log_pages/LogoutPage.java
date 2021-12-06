package pages.log_pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class LogoutPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Continue']")
    WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }
}