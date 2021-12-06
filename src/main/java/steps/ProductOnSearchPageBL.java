package steps;

import pages.ProductOnSearchPage;
import pages.containers.ProductContainer;
import steps.product_page_steps.ProductPageBL;


public class ProductOnSearchPageBL {

    public ProductOnSearchPage productOnSearchPage;

    public ProductOnSearchPageBL() {
        productOnSearchPage = new ProductOnSearchPage();
    }

    private ProductContainer productMethod(String productName) {
        return productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    public ProductOnSearchPageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }


    public ProductOnSearchPageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
        return this;
    }


    public ProductOnSearchPageBL getProductPrice(String productName) {
        productMethod(productName).getPrice();
        return this;
    }

    public ProductOnSearchPageBL getProductNewPrice(String productName) {
        productMethod(productName).getNewPrice();
        return this;
    }

    public ProductOnSearchPageBL getProductOldPrice(String productName) {
        productMethod(productName).getOldPrice();
        return this;
    }

    public ProductOnSearchPageBL getProductExTax(String productName) {
        productMethod(productName).getExTax();
        return this;
    }


    public ProductOnSearchPageBL addProductToCart(String productName) {
        productMethod(productName).getAddToCartButton().click();
        return this;
    }


    public ProductOnSearchPageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public ProductOnSearchPageBL compareProduct(String productName) {
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