package opencart;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;

import static enums.URLs.BASE_URL;

public class ProductPageTest extends BaseTest {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify making order with Apple Cinema from product page")
    @Test
    public void orderAppleCinemaUsingProductPageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("Apple Cinema 30" + "\"")
                .getAppleCinemaPageBL()
                .orderAppleCinema()
                .verifyOrderingAppleCinema();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify adding 1 product to comparison from product page")
    @Test
    public void addOneProductToCompareUsingProductPageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .verifyProductCompare();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify adding 2 products to comparison from product page")
    @Test
    public void addTwoProductsToCompareUsingProductPageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToHomePageButton();
        homePageBL.getSearchField()
                .findSearchRequest()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook Pro")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnProductComparisonButtonInAlert();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify adding 6 products to comparison from product page")
    @Test
    public void addSixProductsToCompareUsingProductPageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToHomePageButton();
        homePageBL.getSearchField()
                .findSearchRequest()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("iMac")
                .getProductPageBL().clickOnCompareProductButton()
                .compareProduct("Apple Cinema 30" + "\"")
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook Air")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook Pro")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnProductComparisonButtonInAlert();
    }
}
