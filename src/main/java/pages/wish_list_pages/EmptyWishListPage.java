package pages.wish_list_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EmptyWishListPage extends BasePage {

    @FindBy(xpath = ".//*[@id = 'content']/p")
    WebElement emptyWishListTitle;

    @FindBy(className = "pull-right")
    WebElement continueButton;

    public WebElement getEmptyWishListTitle() {
        return emptyWishListTitle;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}