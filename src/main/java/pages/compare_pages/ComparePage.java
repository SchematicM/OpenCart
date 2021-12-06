package pages.compare_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ComparePage extends BasePage {

    @FindBy(xpath = ".//a[contains(@href, 'product_id')]/strong")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[contains(@value, 'Add to Cart')]")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = ".//a[contains(@href, 'remove')]")
    private List<WebElement> removeButtons;

    public List<WebElement> getProducts() {
        return products;
    }

    public List<WebElement> getAddToCartButtons() {
        return addToCartButtons;
    }

    public List<WebElement> getRemoveButtons() {
        return removeButtons;
    }
}