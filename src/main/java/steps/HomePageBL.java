package steps;

import driver.DriverRepository;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HomePage;
import pages.containers.ProductContainer;
import steps.cart_steps.CartPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.header_steps.HeaderPageLoginedBL;
import steps.header_steps.HeaderPageUnloginedBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.AppleCinemaPageBL;
import steps.product_page_steps.ProductPageBL;
import steps.search_steps.SearchFieldBL;
import util.DriverUtils;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

public class HomePageBL {

    public HomePage homePage;

    public HomePageBL() {
        homePage = new HomePage();
    }

    public HeaderPageUnloginedBL getHeaderPageUnloginedBL() {
        return new HeaderPageUnloginedBL();
    }

    public HeaderPageLoginedBL getHeaderPageLoginedBL() {
        return new HeaderPageLoginedBL();
    }

    public SearchFieldBL getSearchField() {
        return new SearchFieldBL();
    }

    public ComparePageBL getComparePageBL() {
        return new ComparePageBL();
    }

    public CartPageBL getCartPageBl() {
        return new CartPageBL();
    }

    public MenuPageBL getMenuPageBL(){return new MenuPageBL();}

    public CheckoutPageLoginedFirstTimeBL getCheckoutPageLoginedFirstTimeBL() {
        return new CheckoutPageLoginedFirstTimeBL();
    }

    public CheckoutPageLiginedNotFirstTimeBL getCheckoutPageLoginedNotFirstTimeBL() {
        return new CheckoutPageLiginedNotFirstTimeBL();
    }

    public AppleCinemaPageBL getAppleCinemaPageBL() {
        return new AppleCinemaPageBL();
    }

    public ProductPageBL getProductPageBL() {
        return new ProductPageBL();
    }


    private ProductContainer productMethod(String productName) {
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        return product;
    }

    public HomePageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }


    public HomePageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
        return this;
    }


    public HomePageBL getProductPrice(String productName) {
        productMethod(productName).getPrice();
        return this;
    }

    public HomePageBL getProductNewPrice(String productName) {
        productMethod(productName).getNewPrice();
        return this;
    }

    public HomePageBL getProductOldPrice(String productName) {
        productMethod(productName).getOldPrice();
        return this;
    }

    public HomePageBL getProductExTax(String productName) {
        productMethod(productName).getExTax();
        return this;
    }

    public HomePageBL addProductToCart(String productName) {
        new DriverUtils().clickOnElementJS(productMethod(productName).getAddToCartButton());
        return this;
    }


    public HomePageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public HomePageBL compareProduct(String productName) {
        productMethod(productName).getCompareButton().click();
        return this;
    }

    public boolean CurrencyIsChanged(String currencyCode) {
        AtomicBoolean ch = new AtomicBoolean(false);
        Collection<ProductContainer> collection = homePage.getProducts();
        collection.stream()
                .forEach(i -> {
                    ch.set(i.getPrice().contains(currencyCode));
                });
        return ch.get();
    }

    public HomePageBL successfulChangeCurrencyCheck(String currencyCode) {
        Assert.assertTrue(CurrencyIsChanged(currencyCode), "Currency is not changed!");
        return new HomePageBL();
    }

    public void successAddToCartAlert(String ProductName){
        WebDriverWait wait = new WebDriverWait(DriverRepository.DRIVERS.get(), 300);
        wait.until(ExpectedConditions.textToBePresentInElement(homePage.getSuccessAddToCartAlert(),ProductName));
        String expectedMessage1 = "Success: You have added ";
        String expectedMessage2 = " to your shopping cart!\n" + "×";
        Assert.assertEquals(homePage.getSuccessAddToCartAlert().getText(),expectedMessage1 + ProductName + expectedMessage2);
    }
}
