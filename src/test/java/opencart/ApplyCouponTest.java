package opencart;

import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.cart_steps.CartPageBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.BASE_URL;

public class ApplyCouponTest extends BaseTest {
    @BeforeClass
    public HomePageBL loginUser() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginTestUser()
                .successfulLoginCheck();
        return homePageBL;
    }

    @Test
    public void applyCouponTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getProductPageBL().addProductIntoCart();
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
        cartPageBL.inputCouponToOrder();
        cartPageBL.successApplyCoupon();
    }
} 