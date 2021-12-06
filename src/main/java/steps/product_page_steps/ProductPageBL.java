package steps.product_page_steps;

import datamodel.ProductPageModel;
import org.testng.Assert;
import pages.containers.ProductContainer;
import pages.product_pages.ProductPage;
import repository.ProductPageModelRepository;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.ProductOnSearchPageBL;
import steps.header_steps.HeaderPageLoginedBL;
import util.DriverUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public HomePageBL getHomePageBL() {
        return new HomePageBL();
    }

    public HeaderPageLoginedBL getHeaderPageLoginedBL() {
        return new HeaderPageLoginedBL();
    }

    public ProductPageBL orderUsualProduct() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderUsualProductModel();
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithSelectField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithSelectFieldModel();
        chooseSelectDropdown(productPageModel.getSelect());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithSizeField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithSizeFieldModel();
        chooseSizeDropdown(productPageModel.getSize());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithDeliveryField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithDeliveryDateFieldModel();
        inputDeliveryDate(productPageModel.getDeliveryDate());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }


    public ProductPageBL addProductIntoCart() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        return myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
    }

    public void clickOnWishListButton() {
        productPage.getAddToWishListButton().click();
    }

    public ProductPageBL clickOnCompareProductButton() {
        productPage.getCompareProductButton().click();
        return this;
    }

    public void clickOnBrandButton() {
        productPage.getBrandButton().click();
    }

    public ProductPageBL clickOnBackToSearchPageButton() {
        productPage.getBackToSearchPageButton().click();
        return this;
    }

    public ProductPageBL clickOnBackToHomePageButton() {
        productPage.getBackToHomePageButton().click();
        return this;
    }

    public ProductOnSearchPageBL getProductOnSearchPageBL() {
        return new ProductOnSearchPageBL();
    }

    private void clickSelect() {
        productPage.getSelectButton().click();
    }

    private void chooseSelectDropdown(String value) {
        clickSelect();
        productPage.chooseSelectOption(value).click();
    }

    private void clickSize() {
        productPage.getSizeButton().click();
    }

    private void chooseSizeDropdown(int value) {
        clickSize();
        productPage.chooseSizeOption(value).click();
    }

    private void clickDeliveryDate() {
        productPage.getInputDeliveryDate().click();
    }

    private void clearDeliveryDate() {
        productPage.getInputDeliveryDate().clear();
    }

    private void inputDeliveryDate(LocalDate date) {
        clickDeliveryDate();
        clearDeliveryDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        productPage.getInputDeliveryDate().sendKeys(date.format(formatter));
    }


    private void clickInputQuantity() {
        productPage.getInputQuantity().click();
    }

    private void clearInputQuantity() {
        productPage.getInputQuantity().clear();
    }

    private void inputQuantity(String qty) {
        clickInputQuantity();
        clearInputQuantity();
        productPage.getInputQuantity().sendKeys(qty);
    }

    private void clickOnAddToCartButton() {
        productPage.getAddToCartButton().click();
    }


    public void clickOnShoppingCartButtonInAlert() {
        productPage.getShoppingCartButtonInAlert().click();
    }

    public void clickOnProductComparisonButtonInAlert() {
        productPage.getProductComparisonButtonInAlert().click();
    }

    public String getTextWithProductNameInAlert() {
        return productPage.getProductNameInAlert().getText();
    }

    public void verifyProductOrdering() {
        String expectedMessage = "Success: You have added " + getTextWithProductNameInAlert() + " to your shopping cart!";
        Assert.assertTrue(productPage.getSuccessTitle().getText().trim().contains(expectedMessage), "Your product was not added to shopping cart");
    }

    public void verifyProductCompare() {
        String expectedMessage = "Success: You have added " + getTextWithProductNameInAlert() + " to your product comparison!";
        Assert.assertTrue(productPage.getSuccessTitle().getText().trim().contains(expectedMessage), "Your product was not added to product comparison!");
    }

    public void verifySelectAlert() {
        String expectedMessage = "Select required!";
        Assert.assertEquals(productPage.getSelectAlert().getText(), expectedMessage, "Your select is correct!");
    }

    //Related Products Section


    private ProductContainer productMethod(String productName) {
        return productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    public ProductPageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }

    public ProductPageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
        return this;
    }

    public ProductPageBL getProductPrice(String productName) {
        productMethod(productName).getPrice();
        return this;
    }

    public ProductPageBL getProductNewPrice(String productName) {
        productMethod(productName).getNewPrice();
        return this;
    }

    public ProductPageBL getProductOldPrice(String productName) {
        productMethod(productName).getOldPrice();
        return this;
    }

    public ProductPageBL getProductExTax(String productName) {
        productMethod(productName).getExTax();
        return this;
    }


    public ProductPageBL addProductToCart(String productName) {
        productMethod(productName).getAddToCartButton().click();
        return this;
    }


    public ProductPageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public ProductPageBL compareProduct(String productName) {
        new DriverUtils().clickOnElementJS(productMethod(productName).getCompareButton());
        return this;
    }

}
