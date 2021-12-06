package pages.checkout_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.util.List;

public class CheckoutPageLoginedFirstTime extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Step 2: Billing Details ')]")
    private WebElement billingDetailsButton;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@name='company']")
    private WebElement companyInput;
    @FindBy(xpath = "//input[@name='address_1']")
    private WebElement address1Input;
    @FindBy(xpath = "//input[@name='address_2']")
    private WebElement address2Input;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityInput;
    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement postcodeInput;

    @FindBy(xpath = "//select[@id='input-payment-country']")
    private WebElement countryInputButton;
    @FindBy(xpath = "//select[@id='input-payment-country']/option")
    private List<WebElement> countryInputButtons;

    @FindBy(xpath = "//select[@id='input-payment-zone']")
    private WebElement regionInputButton;
    @FindBy(xpath = "//select[@id='input-payment-zone']/option")
    private List<WebElement> regionInputButtons;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    private WebElement billingDetailsContinueButton;

    @FindBy(xpath = "//a[contains(text(),'Step 3: Delivery Details ')]")
    private WebElement deliveryDetailsButton;
    @FindBy(xpath = "//label/input[@value='existing'][@name='shipping_address']")
    private WebElement AddressRadioButton;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    private WebElement deliveryDetailsContinueButton;

    @FindBy(xpath = "//a[contains(text(),'Step 4: Delivery Method ')]")
    private WebElement deliveryMethodButton;
    @FindBy(xpath = "//input[@name='shipping_method']")
    private WebElement deliveryMethodRadioButton;
    @FindBy(xpath = "//div[@id='collapse-shipping-method']//textarea")
    private WebElement deliveryMethodComment;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    private WebElement deliveryMethodContinueButton;

    @FindBy(xpath = "//a[contains(text(),'Step 5: Payment Method ')]")
    private WebElement paymentMethodButton;
    @FindBy(xpath = "//input[@name='payment_method']")
    private WebElement paymentMethodRadioButton;
    @FindBy(xpath = "//div[@id='collapse-payment-method']//textarea")
    private WebElement paymentMethodComment;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement agreementCheckbox;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    private WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//a[contains(text(),'Step 6: Confirm Order ')]")
    private WebElement confirmOrderStepButton;
    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrderButton;




    public WebElement getBillingDetailsButton() {
        return billingDetailsButton;
    }

    public WebElement getFirstNameInput() {
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getCompanyInput() {
        return companyInput;
    }

    public WebElement getAddress1Input() {
        return address1Input;
    }

    public WebElement getAddress2Input() {
        return address2Input;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getPostcodeInput() {
        return postcodeInput;
    }

    public WebElement getCountryInputButton() {
        return countryInputButton;
    }

    public WebElement getCountryInputButtons(int value) {
        return countryInputButtons.get(value);
    }

    public WebElement getRegionInputButton() {
        return regionInputButton;
    }

    public WebElement getRegionInputButtons(int value) {
        return regionInputButtons.get(value);
    }

    public WebElement getBillingDetailsContinueButton() {
        return billingDetailsContinueButton;
    }

    public WebElement getDeliveryDetailsButton() {
        return deliveryDetailsButton;
    }

    public WebElement getAddressRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(AddressRadioButton));
        return AddressRadioButton;
    }

    public WebElement getDeliveryDetailsContinueButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryDetailsContinueButton));
        return deliveryDetailsContinueButton;
    }

    public WebElement getDeliveryMethodButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryMethodButton));
        return deliveryMethodButton;
    }

    public WebElement getDeliveryMethodRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(deliveryMethodRadioButton));
        return deliveryMethodRadioButton;
    }

    public WebElement getDeliveryMethodComment() {
        return deliveryMethodComment;
    }

    public WebElement getDeliveryMethodContinueButton() {
        return deliveryMethodContinueButton;
    }

    public WebElement getPaymentMethodButton() {
        return paymentMethodButton;
    }

    public WebElement getPaymentMethodRadioButton() {
        wait.until(ExpectedConditions.visibilityOf(paymentMethodRadioButton));
        return paymentMethodRadioButton;
    }

    public WebElement getPaymentMethodComment() {
        return paymentMethodComment;
    }

    public WebElement getAgreementCheckbox() {
        return agreementCheckbox;
    }

    public WebElement getPaymentMethodContinueButton() {
        return paymentMethodContinueButton;
    }

    public WebElement getConfirmOrderButton() {
        wait.until(ExpectedConditions.visibilityOf(confirmOrderButton));
        return confirmOrderButton;
    }
}