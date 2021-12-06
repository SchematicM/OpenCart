package opencart.stories.usingCoupons;

import lombok.SneakyThrows;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.cart_steps.CartPageBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.BASE_URL;

public class OrderOneProductWithCouponTest extends BaseTest {
    @BeforeClass
    public void prerequisites() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginTestUser()
                .successfulLoginCheck();
        homePageBL.getProductPageBL().addProductIntoCart();
    }

    @Test
    public void MakeOrderWithOneProductAsLoginedUserWithCouponTest() {
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
        cartPageBL.inputCouponToOrder();
        cartPageBL.clickOnCheckoutButton();
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getCheckoutPageLoginedNotFirstTimeBL()
                .completeCheckout();
    }
}