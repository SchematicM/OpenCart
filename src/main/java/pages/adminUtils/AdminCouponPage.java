package pages.adminUtils;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

@Getter
public class AdminCouponPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder = 'Coupon Name']")
    private WebElement inputCouponName;

    @FindBy(xpath = "//input[@placeholder = 'Code']")
    private WebElement inputCouponCode;

    @FindBy(xpath = "//input[@placeholder = 'Discount']")
    private WebElement discount;

    @FindBy(xpath = "//input[@placeholder = 'Total Amount']")
    private WebElement totalAmount;

    @FindBy(xpath = "//button[@data-original-title = 'Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement successTitle;


}