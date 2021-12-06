package pages.search_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SearchField extends BasePage {

    @FindBy(xpath = ".//*[@id = 'search']/*[@name = 'search']")
    private WebElement searchInput;

    @FindBy(xpath = ".//*[contains(@class, 'fa-search')]")
    private WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }
}