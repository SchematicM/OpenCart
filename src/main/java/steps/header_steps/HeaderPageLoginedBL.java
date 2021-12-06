package steps.header_steps;

import pages.header_pages.HeaderPageLogined;
import steps.cart_steps.CartPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;

public class HeaderPageLoginedBL {

    private HeaderPageLogined headerPageLogined;

    public HeaderPageLoginedBL() { headerPageLogined = new HeaderPageLogined();}

    public HeaderPageLoginedBL clickOnMyAccountButton() {
        headerPageLogined.getMyAccountButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnMyAccountButtonDropdown() {
        headerPageLogined.getMyAccountButtonDropdown().click();
        return this;
    }

    public CartPageBL clickOnCartButton() {
        headerPageLogined.getCartButton().click();
        return new CartPageBL();
    }

    public HeaderPageLoginedBL clickOnOrderHistory() {
        headerPageLogined.getOrderHistoryButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnTransactionsButton() {
        headerPageLogined.getTransactionsButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnDownloadsButton() {
        headerPageLogined.getDownloadsButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnLogoutButton() {
        headerPageLogined.getLogoutButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnCheckoutButton(){
        headerPageLogined.getCheckoutButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnMainPageButton(){
        headerPageLogined.getMainPageButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnCurrencyButton() {
        headerPageLogined.getCurrencyButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnEuroButton() {
        headerPageLogined.getEuroButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnPoundsButton(){
        headerPageLogined.getPoundsButton().click();
        return this;
    }
    public HeaderPageLoginedBL clickOnDollarButton(){
        headerPageLogined.getDollarButton().click();
        return this;
    }

    public CheckoutPageLoginedFirstTimeBL getCheckotPageLoginedFirstTimeBL(){return new CheckoutPageLoginedFirstTimeBL();}

    public CheckoutPageLiginedNotFirstTimeBL getCheckotPageLoginedNotFirstTimeBL(){return new CheckoutPageLiginedNotFirstTimeBL();}
}
