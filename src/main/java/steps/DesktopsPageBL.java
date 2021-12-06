package steps;

import pages.DesktopsPage;
import pages.MenuPage;
import pages.containers.ProductContainer;
import steps.product_page_steps.ProductPageBL;

public class DesktopsPageBL {

    private DesktopsPage desktopsPage;

    public DesktopsPageBL() {
        desktopsPage = new DesktopsPage();
    }

    private ProductContainer productMethod(String productName) {
        ProductContainer product = desktopsPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        return product;
    }

    public DesktopsPageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }


    public DesktopsPageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
        return this;
    }


    public DesktopsPageBL getProductPrice(String productName) {
        productMethod(productName).getPrice();
        return this;
    }

    public DesktopsPageBL getProductNewPrice(String productName) {
        productMethod(productName).getNewPrice();
        return this;
    }

    public DesktopsPageBL getProductOldPrice(String productName) {
        productMethod(productName).getOldPrice();
        return this;
    }

    public DesktopsPageBL getProductExTax(String productName) {
        productMethod(productName).getExTax();
        return this;
    }


    public DesktopsPageBL addProductToCart(String productName) {
        productMethod(productName).getAddToCartButton().click();
        return this;
    }


    public DesktopsPageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public DesktopsPageBL compareProduct(String productName) {
        productMethod(productName).getCompareButton().click();
        return this;
    }

    public String getProductTitle(String productName) {
        return productMethod(productName).getTitle();
    }

    public ProductPageBL getProductPageBL() {
        return new ProductPageBL();
    }

}
