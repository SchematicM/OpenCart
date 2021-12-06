package pages.checkout_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class SuccessOrderPage extends BasePage {

    @FindBy(xpath = ".//*[contains(text(),'Thanks for shopping with us online!')]")
    private WebElement SuccessTitle;

    public WebElement getSuccessTitle() {
        wait.until(ExpectedConditions.visibilityOf(SuccessTitle));
        return SuccessTitle;
    }
}