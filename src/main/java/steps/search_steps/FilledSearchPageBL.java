package steps.search_steps;

import pages.search_pages.FilledSearchPage;
import steps.ComparePageBL;
import steps.ProductOnSearchPageBL;

public class FilledSearchPageBL {

    private FilledSearchPage filledSearchPage;

    public FilledSearchPageBL() {
        filledSearchPage = new FilledSearchPage();
    }

    public FilledSearchPageBL sortProducts(String sortBy) {
        filledSearchPage.getSortBySelect().click();

        filledSearchPage.getSortByOptions().stream()
                .filter(option -> option.getText().contains(sortBy))
                .findAny()
                .orElse(filledSearchPage.getProductLimitOptions().stream().findFirst().orElseThrow(NullPointerException::new))
                .click();

        filledSearchPage.getSortBySelect().click();
        return this;
    }

    public FilledSearchPageBL setProductLimit(String limitValue) {
        filledSearchPage.getProductLimitSelect().click();

        filledSearchPage.getProductLimitOptions().stream()
                .filter(limit -> limit.getText().contains(limitValue))
                .findAny()
                .orElse(filledSearchPage.getProductLimitOptions().stream().findFirst().orElseThrow(NullPointerException::new)).
                click();

        filledSearchPage.getProductLimitSelect().click();
        return this;
    }

    public ComparePageBL clickOnComparePageButton() {
        filledSearchPage.getComparePageButton().click();
        return new ComparePageBL();
    }

    public FilledSearchPageBL selectListView() {
        filledSearchPage.getListViewButton();
        return this;
    }

    public FilledSearchPageBL selectGridView() {
        filledSearchPage.getGridViewButton();
        return this;
    }

    public ProductOnSearchPageBL getProductOnSearchPageBL() {
        return new ProductOnSearchPageBL();
    }
}