package steps.search_steps;

import org.testng.Assert;
import pages.search_pages.EmptySearchPage;
import pages.search_pages.SearchPage;

public class SearchPageBL {

    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    private void inputSearchRequest(String request) {
        searchPage.getSearchInput().clear();
        searchPage.getSearchInput().sendKeys(request);
    }

    private void selectCategory(String categoryName) {

        searchPage.getCategorySelect().click();

        searchPage.getCategories().stream()
                .filter(category -> category.getText().contains(categoryName))
                .findAny()
                .orElse(searchPage.getCategories().stream().findFirst().orElseThrow(NullPointerException::new))
                .click();

        searchPage.getCategorySelect().click();
    }

    private void selectSearchInSubcategoriesCheckbox() {
        searchPage.getSearchInSubcategoriesCheckbox().click();
    }

    private void selectSearchInProductDescriptionCheckbox() {
        searchPage.getSearchInProductDescriptionCheckbox().click();
    }

    private void clickOnSearchButton() {
        searchPage.getSearchButton().click();
    }

    public void successfulProductSearching() {
        String productName = "Mac";
        inputSearchRequest(productName);
        clickOnSearchButton();
        Assert.assertTrue(new FilledSearchPageBL()
                .getProductOnSearchPageBL()
                .getProductTitle(productName)
                .contains(productName), "Search Page is empty!");

    }

    public void unsuccessfulProductSearching() {
        String productName = "1234";
        inputSearchRequest(productName);
        clickOnSearchButton();
        Assert.assertEquals(new EmptySearchPage().getEmptySearchPageTitle().getText(),
                "There is no product that matches the search criteria.",
                "Search Page isn't empty!");
    }

}