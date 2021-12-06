package opencart.stories.using_product_page_stories;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageLoginedTest extends BaseTest {

    @BeforeClass
    public void loginMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify making order with 1 product from product page after user login")
    @Test
    public void makeOrderWithOneProductAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkoutPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkoutPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkoutPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkoutPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify making order with 2 products from product page after user login")
    @Test
    public void makeOrderWithTwoProductsAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkoutPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkoutPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkoutPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkoutPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify making order with 3 products from product page after user login")
    @Test
    public void makeOrderWithThreeProductsAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkoutPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("Apple Cinema 30" + "\"")
                .getAppleCinemaPageBL()
                .orderAppleCinema();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkoutPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkoutPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkoutPageLoginedNotFirstTimeBL.successCheckout();
    }

}
