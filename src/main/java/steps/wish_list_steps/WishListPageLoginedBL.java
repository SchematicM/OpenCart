package steps.wish_list_steps;

import pages.containers.WishListContainer;
import pages.wish_list_pages.WishListPage;
import steps.MyAccountPageBL;
import steps.cart_steps.SmallCartPageBL;
import steps.header_steps.HeaderPageLoginedBL;
import steps.search_steps.SearchFieldBL;

public class WishListPageLoginedBL {

    private WishListPage wishListPage;

    public WishListPageLoginedBL() {
        wishListPage = new WishListPage();
    }

    public WishListPageLoginedBL clickOnProductImage(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        product.getImage().click();
        return this;
    }

    public String getProductTitle(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        return product.getTitle();
    }

    public WishListPageLoginedBL clickOnProductTitle(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        product.getTitleButton().click();
        return this;
    }

    public String getProductModel(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        return product.getModel();
    }

    public String getProductStockStatus(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        return product.getStockStatus();
    }

    public String getProductPrice(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        System.out.println(product.getPrice());
        return product.getPrice();
    }

    public WishListPageLoginedBL clickOnAddToCartButton(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        product.getAddToCartButton().click();
        return this;
    }

    public WishListPageLoginedBL clickOnRemoveButton(String productName) {
        WishListContainer product = wishListPage.getProducts()
                .stream()
                .filter(element -> element.getTitle().contains(productName))
                .findAny()
                .orElseThrow(NullPointerException::new);

        product.getRemoveButton().click();
        return this;
    }

    public MyAccountPageBL clickOnContinueButton() {
        wishListPage.getContinueButton().click();
        return new MyAccountPageBL();
    }

    public HeaderPageLoginedBL getHeaderPageLoginedBL() {
        return new HeaderPageLoginedBL();
    }

    public SearchFieldBL getSearchFieldBL() {
        return new SearchFieldBL();
    }

    public SmallCartPageBL getSmallCartPageBL() {
        return new SmallCartPageBL();
    }
}