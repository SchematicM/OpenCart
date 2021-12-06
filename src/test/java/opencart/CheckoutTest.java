package opencart;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CheckoutTest extends BaseTest {
    @Test
    public void CheckoutFirstTimeTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        HomePageBL.addProductToCart("iPhone");
        Thread.sleep(2000);
        HomePageBL.addProductToCart("MacBook");
        Thread.sleep(2000);
        HomePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        Thread.sleep(2000);
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().checkoutBillingDetails(1, 1);
        Thread.sleep(10000);
        //mainPageBL.getCheckotPageLoginedNotFirstTimeBL().acceptMassage();
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().acceptMassageOk();
        Thread.sleep(5000);
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().clickOnConfirmOrderButton();
        Thread.sleep(2000);
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().successCheckout();
    }

    @Test
    public void CheckoutNotFirstTimeTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        HomePageBL.addProductToCart("iPhone");
        Thread.sleep(2000);
        HomePageBL.addProductToCart("MacBook");
        Thread.sleep(2000);
        HomePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        Thread.sleep(2000);
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().checkoutBillingDetails();
        Thread.sleep(5000);
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().acceptMassageOk();
        Thread.sleep(5000);
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().clickOnConfirmOrderButton();
        Thread.sleep(2000);
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().successCheckout();
    }
}