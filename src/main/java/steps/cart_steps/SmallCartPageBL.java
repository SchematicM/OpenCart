package steps.cart_steps;

import pages.cart_pages.SmallCartPage;

public class SmallCartPageBL {
    private SmallCartPage SmallCartPage;

    public SmallCartPageBL() {
        SmallCartPage = new SmallCartPage();
    }

    public SmallCartPageBL clickOnSmallCartPageButton() {
        SmallCartPage.getSmallCartPageButton().click();
        return this;
    }

    public SmallCartPageBL clickOnRemoveProductButtons(int value) {
        SmallCartPage.getRemoveProductButtons(value).click();
        return this;
    }

    public SmallCartPageBL clickOnProductButtons(int value) {
        SmallCartPage.getProductButtons(value).click();
        return this;
    }

    public SmallCartPageBL clickOnProductImageButtons(int value) {
        SmallCartPage.getProductImageButtons(value).click();
        return this;
    }

    public SmallCartPageBL clickOnViewCartButton() {
        SmallCartPage.getViewCartButton().click();
        return this;
    }

    public SmallCartPageBL clickOnCheckoutButton() {
        SmallCartPage.getCheckoutButton().click();
        return this;
    }
}