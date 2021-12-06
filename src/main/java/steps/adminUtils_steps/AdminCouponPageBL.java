package steps.adminUtils_steps;

import datamodel.CouponModel;
import org.testng.Assert;
import pages.adminUtils.AdminCouponPage;
import repository.CouponModelRepository;

public class AdminCouponPageBL {
    private AdminCouponPage adminCouponPage;

    public AdminCouponPageBL() {
        adminCouponPage = new AdminCouponPage();
    }

    public AdminCouponPageBL fillCouponsDetails() {
        CouponModel couponModel = CouponModelRepository.getCuponModel();
        inputCouponName(couponModel.getCouponName());
        inputCouponCode(couponModel.getCouponCode());
        inputDiscount(couponModel.getDiscount());
        inputTotalAmount(couponModel.getTotalAmount());
        return this;
    }
    public String fillCouponsDetailsForCode() {
        CouponModel couponModel = CouponModelRepository.getCuponModel();
        inputCouponName(couponModel.getCouponName());
        inputCouponCode(couponModel.getCouponCode());
        inputDiscount(couponModel.getDiscount());
        inputTotalAmount(couponModel.getTotalAmount());
        return couponModel.getCouponCode();
    }

    public void clickOnSaveButton() {
        adminCouponPage.getSaveButton().click();
    }

    private void inputCouponName(String couponName) {
        adminCouponPage.getInputCouponName().click();
        adminCouponPage.getInputCouponName().clear();
        adminCouponPage.getInputCouponName().sendKeys(couponName);
    }

    private void inputCouponCode(String couponCode) {
        adminCouponPage.getInputCouponCode().click();
        adminCouponPage.getInputCouponCode().clear();
        adminCouponPage.getInputCouponCode().sendKeys(couponCode);
    }

    private void inputDiscount(String discount) {
        adminCouponPage.getDiscount().click();
        adminCouponPage.getDiscount().clear();
        adminCouponPage.getDiscount().sendKeys(discount);
    }

    private void inputTotalAmount(String totalAmount) {
        adminCouponPage.getTotalAmount().click();
        adminCouponPage.getTotalAmount().clear();
        adminCouponPage.getTotalAmount().sendKeys(totalAmount);
    }

    public void successAddingCoupon() {
        String expectedMessage = "Success: You have modified coupons!";
        Assert.assertTrue(adminCouponPage.getSuccessTitle().getText().contains(expectedMessage), "Coupon was not added!");
    }

}

