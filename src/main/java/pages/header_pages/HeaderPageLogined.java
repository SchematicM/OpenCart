package pages.header_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HeaderPageLogined extends BasePage {

    @FindBy(xpath =".//*[@id='form-currency']")
    private WebElement currencyButton;

    @FindBy(xpath ="//*[@name = 'EUR']")
    private WebElement euroButton;

    @FindBy(xpath ="//*[@name = 'GBP']")
    private WebElement poundsButton;

    @FindBy(xpath ="//*[@name = 'USD']")
    private WebElement dollarButton;

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'My Account']")
    private WebElement myAccountButtonDropdown;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Order History']")
    private WebElement orderHistoryButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Transactions']")
    private WebElement transactionsButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Downloads']")
    private WebElement downloadsButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Logout']")
    private WebElement logoutButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-share']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//nav//i[contains(@class,'cart')]")
    private WebElement cartButton;

    @FindBy(xpath = "//img[@title='Your Store']")
    private WebElement MainPageButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getMyAccountButtonDropdown() {
        return myAccountButtonDropdown;
    }

    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public WebElement getTransactionsButton() {
        return transactionsButton;
    }

    public WebElement getDownloadsButton() {
        return downloadsButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getCartButton() {
        // wait.until(ExpectedConditions.visibilityOf(cartButton));
        //wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav//i[@class='fa fa-share']")));
        return cartButton;
    }

    public WebElement getMainPageButton() {
        return MainPageButton;
    }

    public WebElement getCurrencyButton() {
        wait.until(ExpectedConditions.visibilityOf(currencyButton));
        return currencyButton;
    }
    public WebElement getEuroButton() { return euroButton; }

    public WebElement getPoundsButton() { return poundsButton; }

    public WebElement getDollarButton() { return dollarButton; }
}
