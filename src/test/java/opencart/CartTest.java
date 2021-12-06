package opencart;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CartTest extends BaseTest{


    @Test
    public void CartTest() throws InterruptedException {
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
        HomePageBL.getHeaderPageUnloginedBL().clickOnCartPageButton();
        Thread.sleep(2000);
        HomePageBL.getCartPageBl().cartProducts(1,4,3);
    }
    @Test
    public void AddToCart1Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
    }
    @Test
    public void AddToCart2Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
    }
    @Test
    public void AddToCart3Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
    }
}