package opencart;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;

import static enums.URLs.BASE_URL;

public class SearchForProductTest extends BaseTest {

    @Test
    public void successfulSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getSearchField()
                .clickOnSearchButton()
                .successfulProductSearching();

    }

    @Test
    public void negativeSearch() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getSearchField()
                .clickOnSearchButton()
                .unsuccessfulProductSearching();

    }
}