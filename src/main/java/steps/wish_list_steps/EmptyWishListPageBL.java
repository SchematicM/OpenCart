package steps.wish_list_steps;

import pages.wish_list_pages.EmptyWishListPage;

public class EmptyWishListPageBL {

    private EmptyWishListPage emptyWishListPage;

    public EmptyWishListPageBL() {
        emptyWishListPage = new EmptyWishListPage();
    }

    public EmptyWishListPageBL getEmptyWishListTitleText() {
        emptyWishListPage.getEmptyWishListTitle().getText();
        return this;
    }

    public EmptyWishListPageBL clickOnContinueButton() {
        emptyWishListPage.getContinueButton().click();
        return this;
    }
}