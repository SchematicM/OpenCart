package pages.search_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class FilledSearchPage extends BasePage {

    @FindBy(id = "input-sort")
    WebElement sortBySelect;

    @FindBy(xpath = ".//*[@id = 'input-sort']/option")
    List<WebElement> sortByOptions;

    @FindBy(id = "input-limit")
    WebElement productLimitSelect;

    @FindBy(xpath = ".//*[@id = 'input-limit']/option")
    List<WebElement> productLimitOptions;

    @FindBy(id = "compare-total")
    WebElement comparePageButton;

    @FindBy(id = "list-view")
    WebElement listViewButton;

    @FindBy(id = "grid-view")
    WebElement gridViewButton;

    public WebElement getSortBySelect() {
        return sortBySelect;
    }

    public List<WebElement> getSortByOptions() {
        return sortByOptions;
    }

    public WebElement getProductLimitSelect() {
        return productLimitSelect;
    }

    public List<WebElement> getProductLimitOptions() {
        return productLimitOptions;
    }

    public WebElement getComparePageButton() {
        return comparePageButton;
    }

    public WebElement getListViewButton() {
        return listViewButton;
    }

    public WebElement getGridViewButton() {
        return gridViewButton;
    }
}