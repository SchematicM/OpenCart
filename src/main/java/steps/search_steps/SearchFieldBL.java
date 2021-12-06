package steps.search_steps;

import pages.search_pages.SearchField;
import steps.ProductOnSearchPageBL;
import steps.product_page_steps.ProductPageBL;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL findSearchRequest() {
        inputSearchRequest("mac");
        clickOnSearchButton();
        return this;
    }

    public ProductOnSearchPageBL getProductOnSearchPageBL() {return new ProductOnSearchPageBL();}


    public SearchFieldBL inputSearchRequest(String request) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(request);
        return this;
    }

    public SearchPageBL clickOnSearchButton() {
        searchField.getSearchButton().click();
        return new SearchPageBL();
    }
}