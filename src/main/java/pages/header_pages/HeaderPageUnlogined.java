package pages.header_pages;

import enums.Currencys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HeaderPageUnlogined extends BasePage {


    @FindBy(xpath =".//*[@id='form-currency']")
    private WebElement currencyButton;

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href,'account/login')]")
    private WebElement loginButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-share']")
    private WebElement checkoutButton;

    @FindBy(xpath = ".//nav//i[@class='fa fa-shopping-cart']")
    private WebElement cartButton;

    public HeaderPageUnlogined() { }

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        wait.until(ExpectedConditions.visibilityOf(registerButton));
        return registerButton;
    }

    public WebElement getLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return loginButton;
    }


    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getCartButton() {
        wait.until(ExpectedConditions.visibilityOf(cartButton));
        return cartButton;
    }

    public WebElement getCurrencyButton() {
        wait.until(ExpectedConditions.visibilityOf(currencyButton));
        return currencyButton;
    }

    public WebElement getCommonCurrencyButton(String val)
    {
        String pass = String.format(".//*[@name = '%s']",val);
        return driver.findElement(By.xpath(pass));
    }
}
