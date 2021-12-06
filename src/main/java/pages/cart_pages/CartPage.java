package pages.cart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(xpath = ".//table[@class='table table-bordered']//td[@class='text-left']/a")
    private List<WebElement> cartProductsButtons;

    @FindBy(xpath = ".//input[contains(@name,'quantity')]")
    private List<WebElement> quantityInput;

    @FindBy(xpath = ".//button[@data-original-title = 'Update']")
    private List<WebElement> updateButtons;

    @FindBy(xpath = ".//button[@data-original-title = 'Remove']")
    private List<WebElement> removeButtons;


    @FindBy(xpath = ".//a[@href = '#collapse-coupon']")
    private WebElement useCouponCodeButton;
    @FindBy(xpath = ".//input[@name = 'coupon']")
    private WebElement couponCodeInput;
    @FindBy(xpath = ".//input[@value = 'Apply Coupon']")
    private WebElement applyCouponCodeButton;
    @FindBy(xpath = "//*[@id='checkout-cart']/div[@class='alert alert-success alert-dismissible']")
    private WebElement validCouponAlert;


    @FindBy(xpath = ".//a[@href = '#collapse-shipping']")
    private WebElement EstimateShippingAndTaxesButton;
    @FindBy(xpath = ".//select[@name = 'country_id']")
    private WebElement countryInput;
    @FindBy(xpath = ".//select[@name = 'country_id']//option")
    private List<WebElement> countrySelectionButtons;
    @FindBy(xpath = ".//select[@name = 'zone_id']")
    private WebElement zoneIdInput;
    @FindBy(xpath = ".//select[@id = 'input-zone']/option")
    private List<WebElement> zoneIdSelectionButtons;
    @FindBy(xpath = ".//input[@name = 'postcode']")
    private WebElement postcodeInput;
    @FindBy(xpath = ".//button[@id = 'button-quote']")
    private WebElement getQuotesButton;


    @FindBy(xpath = ".//a[@href = '#collapse-voucher']")
    private WebElement UseGiftCertificateButton;
    @FindBy(xpath = ".//input[@id = 'input-voucher']")
    private WebElement UseGiftCertificateInput;
    @FindBy(xpath = ".//input[@id = 'button-voucher']")
    private WebElement applyGiftCertificateButton;


    @FindBy(xpath = ".//a[@class = 'btn btn-default']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = ".//a[@class = 'btn btn-primary']")
    private WebElement CheckoutButton;

    @FindBy(xpath = "//div[@id='content']//*[text()='Your shopping cart is empty!']")
    private WebElement emptyCartAlert;

    public List<WebElement> getQuantityInput() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[contains(@name,'quantity')]/..")));
        return quantityInput;
    }

    public List<WebElement> getUpdateButtons() {
        return updateButtons;
    }

    public List<WebElement> getRemoveButtons() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//div[@class='input-group btn-block']")));
        return removeButtons;
    }

    public WebElement getUseCouponCodeButton() {
        return useCouponCodeButton;
    }

    public WebElement getCouponCodeInput() {
        wait.until(ExpectedConditions.visibilityOf(couponCodeInput));
        return couponCodeInput;
    }

    public WebElement getApplyCouponCodeButton() {
        return applyCouponCodeButton;
    }

    public WebElement getValidCouponAlert() {
        wait.until(ExpectedConditions.visibilityOf(validCouponAlert));
        return validCouponAlert;
    }

    public WebElement getEstimateShippingAndTaxesButton() {
        return EstimateShippingAndTaxesButton;
    }

    public WebElement getCountryInput() {
        return countryInput;
    }

    public Select getCountrySelectionButtons() {
        return new Select(driver.findElement(By.xpath("//select[@name = 'country_id']")));
    }

    public Select getZoneIdInput() {
        return new Select(zoneIdInput);
    }

    public WebElement getPostcodeInput() {
        return postcodeInput;
    }

    public WebElement getUseGiftCertificateButton() {
        return UseGiftCertificateButton;
    }

    public WebElement getUseGiftCertificateInput() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//input[@id = 'input-voucher']/..")));
        return UseGiftCertificateInput;
    }

    public WebElement getApplyGiftCertificateButton() {
        return applyGiftCertificateButton;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public WebElement getCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(CheckoutButton));
        return CheckoutButton;
    }

    public WebElement getEmptyCartAlert() {
        wait.until(ExpectedConditions.visibilityOf(CheckoutButton));
        return emptyCartAlert;
    }

}