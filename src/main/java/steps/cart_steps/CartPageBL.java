package steps.cart_steps;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pages.cart_pages.AlertCartPage;
import pages.cart_pages.CartPage;
import datamodel.CartModel;
import repository.CartModelRepository;
import repository.CouponModelRepository;
import util.DriverUtils;


public class CartPageBL {
    private CartPage CartPage;

    public CartPageBL() {
        CartPage = new CartPage();
    }

    public CartPageBL cartProducts(int productNumber, int country, int zone) {
        CartModel cartModel = CartModelRepository.getCartModel();
        inputQuantity("4", productNumber);
        clickOnUpdateButtons(productNumber);
        clickOnUseCouponCodeButton();
        inputCoupon(cartModel.getCoupon());
        clickOnApplyCouponCodeButton();
        clickOnEstimateShippingAndTaxesButton();
        clickOnCountryInput();
        clickOnCountrySelectionButtons(country);
        clickOnZoneIdSelectionButtons(zone);
        inputPostCode(cartModel.getPostCode());
        clickOnUseGiftCertificateButton();
        inputGiftCertificate(cartModel.getGiftCertificate());
        clickOnApplyGiftCertificateButton();
        clickOnCheckoutButton();
        return this;
    }

    private void inputPostCode(String postCode) {
        CartPage.getPostcodeInput().click();
        CartPage.getPostcodeInput().clear();
        CartPage.getPostcodeInput().sendKeys(postCode);
    }

    private void inputGiftCertificate(String giftCertificate) {
        CartPage.getUseGiftCertificateInput().click();
        CartPage.getUseGiftCertificateInput().clear();
        CartPage.getUseGiftCertificateInput().sendKeys(giftCertificate);
    }

    public void inputQuantity(String quantityInput, int value) {
        CartPage.getQuantityInput().get(value).clear();
        CartPage.getQuantityInput().get(value).sendKeys(quantityInput);
    }

    public void inputCoupon(String Coupon) {
        CartPage.getCouponCodeInput().clear();
        CartPage.getCouponCodeInput().sendKeys(Coupon);
    }

    private void clickOnUpdateButtons(int value) {
        CartPage.getUpdateButtons().get(value).click();
    }

    private void clickOnRemoveButtons(int value) {
        new DriverUtils().clickOnElementJS(CartPage.getRemoveButtons().get(value));
    }

    public void clickOnUseCouponCodeButton() {
        CartPage.getUseCouponCodeButton().click();
    }

    public void clickOnApplyCouponCodeButton() {
        CartPage.getApplyCouponCodeButton().click();
    }

    public void clickOnEstimateShippingAndTaxesButton() {
        CartPage.getEstimateShippingAndTaxesButton().click();
    }

    public void clickOnCountryInput() {
        CartPage.getCountryInput().click();
    }

    private void clickOnCountrySelectionButtons(int value) {
        CartPage.getCountrySelectionButtons().selectByIndex(value);
    }

    private void clickOnZoneIdSelectionButtons(int value) {
        CartPage.getZoneIdInput().selectByIndex(value);
    }


    public void clickOnUseGiftCertificateButton() {
        new DriverUtils().clickOnElementJS(CartPage.getUseGiftCertificateButton());
    }

    public void clickOnApplyGiftCertificateButton() {
        CartPage.getApplyGiftCertificateButton().click();
    }


    public void clickOnCheckoutButton() {
        new DriverUtils().clickOnElementJS(CartPage.getCheckoutButton());
    }


    public void inputCouponToOrder() {
        this.clickOnUseCouponCodeButton();
        this.inputCoupon(CouponModelRepository.getValidCouponModel());
        this.clickOnApplyCouponCodeButton();
    }

    public void inputNewCouponToOrder(String code) {
        this.clickOnUseCouponCodeButton();
        this.inputCoupon(code);
        this.clickOnApplyCouponCodeButton();
    }

    public String getCartAlert() {
        return CartPage.getValidCouponAlert().getText();
    }

    public void successApplyCoupon() {
        Assert.assertTrue(CartPage.getValidCouponAlert().getText().contains("Your coupon discount has been applied!"), "Invalid or disable coupon");
    }

    public void cleanCart() {
        try {
            Assert.assertTrue(CartPage.getEmptyCartAlert().getText().contains("Your shopping cart is empty!"), "Cart is not empty");
        } catch (NoSuchElementException e) {
            for (int x = CartPage.getRemoveButtons().size(); 0 < x; x--) {
                clickOnRemoveButtons(0);
            }
        }
    }

}