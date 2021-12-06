package pages.compare_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SuccessfulAddingToComparePageAlertPage extends BasePage {

    @FindBy(xpath = ".//*[text() = 'product comparison']")
    WebElement productComparisonButton;

    public WebElement getProductComparisonButton() {
        return productComparisonButton;
    }
}