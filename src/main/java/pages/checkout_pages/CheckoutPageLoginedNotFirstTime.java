package pages.checkout_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class CheckoutPageLoginedNotFirstTime extends BasePage {

    @FindBy(xpath = "//input[@value='existing'][@name='payment_address']")
    private WebElement existingBillingDetailsRadioButton;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    private WebElement billingDetailsContinueButton;

    @FindBy(xpath = "//label/input[@value='existing'][@name='shipping_address']")
    private WebElement AddressRadioButton;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    private WebElement deliveryDetailsContinueButton;

    @FindBy(xpath = "//input[@name='shipping_method']")
    private WebElement deliveryMethodRadioButton;
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//textarea")
    private WebElement deliveryMethodComment;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    private WebElement deliveryMethodContinueButton;

    @FindBy(xpath = "//input[@name='payment_method']")
    private WebElement paymentMethodRadioButton;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea")
    private WebElement paymentMethodComment;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement agreementCheckbox;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    private WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrderButton;

    public WebElement getExistingBillingDetailsRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(existingBillingDetailsRadioButton));
        return existingBillingDetailsRadioButton;
    }

    public WebElement getBillingDetailsContinueButton() {
        return billingDetailsContinueButton;
    }

    public WebElement getAddressRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(AddressRadioButton));
        return AddressRadioButton;
    }
    public WebElement getDeliveryDetailsContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryDetailsContinueButton));
        return deliveryDetailsContinueButton;
    }

    public WebElement getDeliveryMethodRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryMethodRadioButton));
        return deliveryMethodRadioButton;
    }

    public WebElement getDeliveryMethodComment() {
        wait.until(ExpectedConditions.visibilityOf(deliveryMethodComment));
        return deliveryMethodComment;
    }

    public WebElement getDeliveryMethodContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryMethodContinueButton));
        return deliveryMethodContinueButton;
    }

    public WebElement getPaymentMethodRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(paymentMethodRadioButton));
        return paymentMethodRadioButton;
    }

    public WebElement getPaymentMethodComment() {
        //wait.until(ExpectedConditions.visibilityOf(paymentMethodComment));
        return paymentMethodComment;
    }

    public WebElement getAgreementCheckbox() {
        wait.until(ExpectedConditions.visibilityOf(agreementCheckbox));
        return agreementCheckbox;
    }

    public WebElement getPaymentMethodContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(paymentMethodContinueButton));
        return paymentMethodContinueButton;
    }

    public WebElement getConfirmOrderButton() {
        wait.until(ExpectedConditions.visibilityOf(confirmOrderButton));
        return confirmOrderButton;
    }
}