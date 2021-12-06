package opencart.stories.using_product_page_stories;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageAsGuestTest extends BaseTest {

    @BeforeClass
    public void registrationMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify making order with 1 product from product page after user registration")
    @Test
    public void makeOrderWithOneProductAsGuestUserTest() {
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLoginedFirstTimeBL checkoutPageLoginedFirstTimeBL = new CheckoutPageLoginedFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.getMenuPageBL().clickOnDesktopsMenuButton()
                .clickOnSeeAllDesktopsMenuButton()
                .getDesktopsPageBL()
                .clickOnProductTitle("HP LP3065")
                .getProductPageBL()
                .orderProductWithDeliveryField();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkoutPageLoginedFirstTimeBL
                .checkoutBillingDetails(1, 1)
                .acceptMassageOk();
        checkoutPageLoginedFirstTimeBL.clickOnConfirmOrderButton();
        checkoutPageLoginedFirstTimeBL.successCheckout();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify ordering product with select field from product page after user registration")
    @Test
    public void makeOrderWithOneProductAsGuestUserNegativeTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.clickOnProductTitle("Canon EOS 5D")
                .getProductPageBL()
                .orderProductWithSelectField()
                .verifySelectAlert();
    }

}
