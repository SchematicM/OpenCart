package pages.product_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AppleCinemaPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'btn-group']//button[contains(@onclick,'wishlist')]")
    private WebElement addToWishListButton;

    @FindBy(xpath = "//div[@class = 'btn-group']//button[contains(@onclick,'compare')]")
    private WebElement compareProductButton;

    @FindBy(xpath = "//a[contains(@href,'product/manufacturer/')]")
    private WebElement brandButton;


    @FindBy(xpath = "//input[contains(@placeholder, 'Text')]")
    private WebElement inputText;

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Select']/../select")
    private WebElement selectButton;

    @FindBy(xpath = "//label[@class='control-label' and text() = 'Textarea']/../textarea")
    private WebElement inputTextarea;

    @FindBy(xpath = "//button[contains(@id,'button-upload')]")
    private WebElement uploadFileButton;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD']")
    private WebElement inputDate;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='HH:mm']")
    private WebElement inputTime;

    @FindBy(xpath = "//input[@class='form-control' and @data-date-format='YYYY-MM-DD HH:mm']")
    private WebElement inputDateAndTime;

    @FindBy(id = "input-quantity")
    private WebElement inputQuantity;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successTitle;


    public WebElement getAddToWishListButton() {
        return addToWishListButton;
    }

    public WebElement getCompareProductButton() {
        return compareProductButton;
    }

    public WebElement getBrandButton() {
        return brandButton;
    }

    public WebElement getRadioButton(int value) {  //value is always 5, 6 or 7
        return driver.findElement(By.xpath("//label//input[@type = 'radio' and @value = '" + value + "']"));
    }

    public WebElement getCheckbox(int value) {     //value is always 8, 9, 10 or 11
        return driver.findElement(By.xpath("//label//input[@type = 'checkbox' and @value = '" + value + "']"));
    }

    public WebElement getInputText() {
        wait.until(ExpectedConditions.visibilityOf(inputText));
        return inputText;
    }

    public WebElement getSelectButton() {
        wait.until(ExpectedConditions.visibilityOf(selectButton));
        return selectButton;
    }

    public WebElement chooseSelectOption(int value) {   //value is always 4,3,2 or 1
        return driver.findElement(By.xpath("//select[contains(@id, 'input-option')]//option[@value = '" + value + "']"));
    }

    public WebElement getInputTextArea() {
        wait.until(ExpectedConditions.visibilityOf(inputTextarea));
        return inputTextarea;
    }

    public WebElement getUploadFileButton() {
        wait.until(ExpectedConditions.visibilityOf(uploadFileButton));
        return uploadFileButton;
    }

    public WebElement getInputDate() {
        wait.until(ExpectedConditions.visibilityOf(inputDate));
        return inputDate;
    }

    public WebElement getInputTime() {
        wait.until(ExpectedConditions.visibilityOf(inputTime));
        return inputTime;
    }

    public WebElement getInputDateAndTime() {
        wait.until(ExpectedConditions.visibilityOf(inputDateAndTime));
        return inputDateAndTime;
    }

    public WebElement getInputQuantity() {
        wait.until(ExpectedConditions.visibilityOf(inputQuantity));
        return inputQuantity;
    }

    public WebElement getAddToCartButton() {
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        return addToCartButton;
    }

    public WebElement getSuccessTitle() {
        wait.until(ExpectedConditions.visibilityOf(successTitle));
        return successTitle;
    }
}
