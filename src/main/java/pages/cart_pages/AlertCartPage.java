package pages.cart_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AlertCartPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'alert')]")
    private WebElement cartAlert;

    @FindBy(xpath = "//div[contains(text(),'Success: You have modified your shopping cart!')]")
    private WebElement successfulModifyAlert;
    @FindBy(xpath = "//div[contains(text(),' Warning: Please enter a coupon code!')]")
    private WebElement notEnteredCouponWarning;
    @FindBy(xpath = "//div[contains(text(),' Warning: Coupon is either invalid, expired or reached its usage limit!'")
    private WebElement invalidCouponWarning;
    @FindBy(xpath = "//div[contains(text(),' Success: Your coupon discount has been applied! ")
    private WebElement validCouponAlert;
    @FindBy(xpath = "//div[contains(text(),' Warning: No Shipping options are available. Please '")
    private WebElement noShippingOptionsWarning;
    @FindBy(xpath = "//div[contains(text(),' Warning: Gift Certificate is either invalid or the balance has been used up!'")
    private WebElement invalidGiftCertificateWarning;
    @FindBy(xpath = "//div[contains(text(),' Success: Your gift certificate discount has been applied!'")
    private WebElement validGiftCertificateAlert;

    public String getCartAlert() {
        return cartAlert.getText();
    }

    public String getSuccessfulModifyAlert() {
        return successfulModifyAlert.getText();
    }

    public String getNotEnteredCouponWarning() {
        return notEnteredCouponWarning.getText();
    }

    public String getInvalidCouponWarning() {
        return invalidCouponWarning.getText();
    }

    public String getValidCouponAlert() {
        return validCouponAlert.getText();
    }

    public String getNoShippingOptionsWarning() {
        return noShippingOptionsWarning.getText();
    }

    public String getInvalidGiftCertificateWarning() {
        return invalidGiftCertificateWarning.getText();
    }

    public String getValidGiftCertificateAlert() {
        return validGiftCertificateAlert.getText();
    }

}