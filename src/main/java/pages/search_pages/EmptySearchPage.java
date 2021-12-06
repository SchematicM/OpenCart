package pages.search_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class EmptySearchPage extends BasePage {

    @FindBy(xpath = ".//*[text() = 'There is no product that matches the search criteria.']")
    WebElement emptySearchPageTitle;

    public WebElement getEmptySearchPageTitle() {
        return emptySearchPageTitle;
    }
}