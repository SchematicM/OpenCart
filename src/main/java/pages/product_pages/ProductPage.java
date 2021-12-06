package pages.product_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'btn-group']//button[contains(@onclick,'wishlist')]")
    private WebElement addToWishListButton;

    @FindBy(xpath = "//div[@class = 'btn-group']//button[contains(@onclick,'compare')]")
    private WebElement compareThisProductButton;

    @FindBy(xpath = "//a[contains(@href,'product/manufacturer/')]")
    private WebElement brandButton;

    @FindBy(xpath = "//a[text() = 'Search']")
    private WebElement backToSearchPageButton;

    @FindBy(xpath = "//img[@title='Your Store']")
    private WebElement backToHomePageButton;

    @FindBy(xpath = "//input[@name = 'quantity']")
    private WebElement inputQuantity;

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Select']/../select")
    private WebElement selectButton;

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Size']/../select")
    private WebElement sizeButton;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD']")
    private WebElement inputDeliveryDate;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successTitle;

    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement selectAlert;

    @FindBy(xpath = "//div[contains(@class,'alert')]//a[contains(@href,'checkout/cart')]")
    private WebElement shoppingCartButtonInAlert;

    @FindBy(xpath = "//div[contains(@class,'alert')]/a[text()='product comparison']")
    private WebElement productComparisonButtonInAlert;

    @FindBy(xpath = "//div[contains(@class,'alert')]//a[contains(@href,'product')]")
    private WebElement productNameInAlert;

    @FindBy(xpath = "//*[contains(@class,'col-xs')]")
    private List<WebElement> products;

    public WebElement getAddToWishListButton() {
        return addToWishListButton;
    }

    public WebElement getCompareProductButton() {
        wait.until(ExpectedConditions.visibilityOf(compareThisProductButton));
        return compareThisProductButton;
    }

    public WebElement getBrandButton() {
        return brandButton;
    }

    public WebElement getBackToSearchPageButton() {
        return backToSearchPageButton;
    }

    public WebElement getBackToHomePageButton() {
        return backToHomePageButton;
    }

    public WebElement getInputQuantity() {
        wait.until(ExpectedConditions.visibilityOf(inputQuantity));
        return inputQuantity;
    }

    public WebElement getSelectButton() {
        wait.until(ExpectedConditions.visibilityOf(selectButton));
        return selectButton;
    }

    public WebElement chooseSelectOption(String value) {
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]/option[contains(text(), '" + value + "')]"));
    }

    public WebElement getSizeButton() {
        wait.until(ExpectedConditions.visibilityOf(selectButton));
        return sizeButton;
    }

    public WebElement chooseSizeOption(int value) {   //value is always 13 or 14
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]//option[@value = '" + value + "']"));
    }

    public WebElement getInputDeliveryDate() {
        wait.until(ExpectedConditions.visibilityOf(inputDeliveryDate));
        return inputDeliveryDate;
    }

    public WebElement getAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton;
    }

    public WebElement getSuccessTitle() {
        wait.until(ExpectedConditions.visibilityOf(successTitle));
        return successTitle;
    }

    public WebElement getSelectAlert() {
        wait.until(ExpectedConditions.visibilityOf(selectAlert));
        return selectAlert;
    }

    public WebElement getShoppingCartButtonInAlert() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButtonInAlert));
        return shoppingCartButtonInAlert;
    }

    public WebElement getProductComparisonButtonInAlert() {
        wait.until(ExpectedConditions.visibilityOf(productComparisonButtonInAlert));
        return productComparisonButtonInAlert;
    }

    public WebElement getProductNameInAlert() {
        wait.until(ExpectedConditions.visibilityOf(productNameInAlert));
        return productNameInAlert;
    }

    public List<ProductContainer> getProducts() {

        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }

}
