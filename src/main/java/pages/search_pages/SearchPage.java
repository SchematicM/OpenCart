package pages.search_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    WebElement searchInput;

    @FindBy(name = "category_id")
    WebElement categorySelect;

    @FindBy(xpath = ".//*[contains(@name, 'category_id')]/option")
    List<WebElement> categories;

    @FindBy(name = "sub_category")
    WebElement searchInSubcategoriesCheckbox;

    @FindBy(name = "description")
    WebElement searchInProductDescriptionCheckbox;

    @FindBy(id = "button-search")
    WebElement searchButton;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getCategorySelect() {
        return categorySelect;
    }

    public List<WebElement> getCategories() {
        return categories;
    }

    public WebElement getSearchInSubcategoriesCheckbox() {
        return searchInSubcategoriesCheckbox;
    }

    public WebElement getSearchInProductDescriptionCheckbox() {
        return searchInProductDescriptionCheckbox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

}