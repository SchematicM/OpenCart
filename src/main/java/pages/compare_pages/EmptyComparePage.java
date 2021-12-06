package pages.compare_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EmptyComparePage extends BasePage {

    @FindBy(xpath = ".//*[text() = 'Continue']")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }
}