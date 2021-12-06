package pages.cart_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class SmallCartPage extends BasePage {
    @FindBy(xpath = "//span[@id='cart-total']")
    private WebElement smallCartPageButton;

    @FindBy(xpath = "//div[@id='cart']//i[@class='fa fa-times']")
    private List<WebElement> removeProductButtons;

    @FindBy(xpath = "//div[@id='cart']//td[@class='text-left']/a")
    private List<WebElement> productButtons;

    @FindBy(xpath = "  //div[@id='cart']//td[@class='text-center']/a")
    private List<WebElement> productImageButtons;

    @FindBy(xpath = "//div[@id='cart']//i[@class='fa fa-shopping-cart']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//div[@id='cart']//i[@class='fa fa-share']")
    private WebElement checkoutButton;


    public WebElement getSmallCartPageButton() {
        return smallCartPageButton;
    }
    public WebElement getRemoveProductButtons(int value) {
        return removeProductButtons.get(value);
    }

    public WebElement getProductButtons(int value) {
        return productButtons.get(value);
    }

    public WebElement getProductImageButtons(int value) {
        return productImageButtons.get(value);
    }
    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
}
