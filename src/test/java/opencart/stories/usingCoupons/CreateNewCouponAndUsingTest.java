package opencart.stories.usingCoupons;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.adminUtils_steps.AdminCouponPageBL;
import steps.adminUtils_steps.AdminLoginPageBL;
import steps.adminUtils_steps.AdminMenuPanelBL;
import steps.cart_steps.CartPageBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.ADMIN_URL;
import static enums.URLs.BASE_URL;

public class CreateNewCouponAndUsingTest extends BaseTest {
    @BeforeClass
    public void loginAdminWithValidAdminTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginValidAdmin();
        adminLoginPageBL.successfulLoginCheck();
    }

    @Test
    public void AddingAndApplyingNewCouponTest() {
        AdminMenuPanelBL adminMenuPanelBL = new AdminMenuPanelBL();
        adminMenuPanelBL
                .clickOnMarketingDropdown()
                .clickOnCouponsButton()
                .clickOnAddCouponsButton();
        AdminCouponPageBL adminCouponPageBL = new AdminCouponPageBL();
        String code = adminCouponPageBL.fillCouponsDetailsForCode();
        adminCouponPageBL.clickOnSaveButton();
        adminCouponPageBL.successAddingCoupon();

        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginTestUser()
                .successfulLoginCheck();
        homePageBL.getProductPageBL().addProductIntoCart();
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
        cartPageBL.inputNewCouponToOrder(code);
        cartPageBL.successApplyCoupon();
    }
}