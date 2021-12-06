package pages.adminUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AdminMenuPanel extends BasePage {
    @FindBy(xpath = "//*[@id='menu-marketing']/a/i")
    private WebElement marketingDropdownMenu;

    @FindBy(css = "a[href*= 'marketing/coupon']")
    private WebElement couponsMenuButton;

    @FindBy(xpath = "//a/i[@class = 'fa fa-plus']")
    private WebElement addCouponButton;

    public WebElement getMarketingDropdownMenu() {
        return marketingDropdownMenu;
    }

    public WebElement getCouponsMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(couponsMenuButton));
        return couponsMenuButton;
    }

    public WebElement getAddCouponButton() {
        wait.until(ExpectedConditions.visibilityOf(addCouponButton));
        return addCouponButton;
    }
}