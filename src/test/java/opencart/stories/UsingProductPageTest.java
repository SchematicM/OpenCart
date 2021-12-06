package opencart.stories;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.RegisterPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageTest extends BaseTest {

    @BeforeClass
    public void orderMethod(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
    }

    @Test
    public void MakeOrderWithOneProductAsLoginedUserTest() {
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
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
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        checkotPageLoginedNotFirstTimeBL
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Test
    public void MakeOrderWithTwoProductsAsLoginedUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        checkotPageLoginedNotFirstTimeBL
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }


    @Test
    public void MakeOrderWithThreeProductsAsLoginedUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct()
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
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        checkotPageLoginedNotFirstTimeBL
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Test
    public void MakeOrderWithOneProductAsGuestUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLoginedFirstTimeBL checkotPageLoginedFirstTimeBL = new CheckoutPageLoginedFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        RegisterPageBL registerPageBL = homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.clickOnProductTitle("Canon EOS 5D")
                .getProductPageBL()
                .orderProductWithSelectField();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedFirstTimeBL
                .checkoutBillingDetails(1,1);
        checkotPageLoginedFirstTimeBL
                .acceptMassageOk();
        checkotPageLoginedFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedFirstTimeBL.successCheckout();
    }


}
