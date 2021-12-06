package steps.checkout_steps;

import datamodel.CheckoutModel;
import org.testng.Assert;
import pages.checkout_pages.AcceptAlertMasageOnCheckoutPage;
import pages.checkout_pages.CheckoutPageLoginedNotFirstTime;
import pages.checkout_pages.SuccessOrderPage;
import repository.CheckoutRepository;

public class CheckoutPageLiginedNotFirstTimeBL {

    private CheckoutPageLoginedNotFirstTime checkoutPageLoginedNotFirstTime;

    public CheckoutPageLiginedNotFirstTimeBL() {
        checkoutPageLoginedNotFirstTime = new CheckoutPageLoginedNotFirstTime();
    }

    public CheckoutPageLiginedNotFirstTimeBL checkoutBillingDetails() {
        CheckoutModel checkoutModel = CheckoutRepository.getCheckoutModel();
        clickOnExistingBillingDetailsRadioButton();
        clickOnBillingDetailsContinueButton();
        clickOnAddressRadioButton();
        clickOnDeliveryDetailsContinueButton();
        clickOnDeliveryMethodRadioButton();
        inputDeliveryMethodComment(checkoutModel.getDeliveryMethodComment());
        clickOnDeliveryMethodContinueButton();
        clickOnPaymentMethodRadioButton();
        inputPaymentMethodComment(checkoutModel.getPaymentMethodComment());
        clickOnAgreementCheckbox();
        clickOnPaymentMethodContinueButton();
        clickOnConfirmOrderButton();
        return this;

    }

    public void completeCheckout() {
        this.checkoutBillingDetails();
        this.acceptMassageOk();
        this.clickOnConfirmOrderButton();
        this.successCheckout();
    }

    private void inputDeliveryMethodComment(String DeliveryMethodComment) {
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().click();
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().clear();
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().sendKeys(DeliveryMethodComment);
    }

    private void inputPaymentMethodComment(String PaymentMethodComment) {
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().click();
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().clear();
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().sendKeys(PaymentMethodComment);
    }

    public void clickOnExistingBillingDetailsRadioButton() {
        checkoutPageLoginedNotFirstTime.getExistingBillingDetailsRadioButton().click();
    }

    public void clickOnBillingDetailsContinueButton() {
        checkoutPageLoginedNotFirstTime.getBillingDetailsContinueButton().click();
    }

    public void clickOnAddressRadioButton() {
        checkoutPageLoginedNotFirstTime.getAddressRadioButton().click();
    }

    public void clickOnDeliveryDetailsContinueButton() {
        checkoutPageLoginedNotFirstTime.getDeliveryDetailsContinueButton().click();
    }

    public void clickOnDeliveryMethodRadioButton() {
        checkoutPageLoginedNotFirstTime.getDeliveryMethodRadioButton().click();
    }

    public void clickOnDeliveryMethodContinueButton() {
        checkoutPageLoginedNotFirstTime.getDeliveryMethodContinueButton().click();
    }

    public void clickOnPaymentMethodRadioButton() {
        checkoutPageLoginedNotFirstTime.getPaymentMethodRadioButton().click();
    }

    public void clickOnAgreementCheckbox() {
        checkoutPageLoginedNotFirstTime.getAgreementCheckbox().click();
    }

    public void clickOnPaymentMethodContinueButton() {
        checkoutPageLoginedNotFirstTime.getPaymentMethodContinueButton().click();
    }

    public void clickOnConfirmOrderButton() {
        checkoutPageLoginedNotFirstTime.getConfirmOrderButton().click();
    }

    public void successCheckout() {
        SuccessOrderPage successOrderPage = new SuccessOrderPage();
        String expected = "Thanks for shopping with us online!";
        Assert.assertEquals(successOrderPage.getSuccessTitle().getText(), expected, "Successful");
    }

    public void acceptMassageOk() {
        AcceptAlertMasageOnCheckoutPage AcceptAlertMasageOnCheckoutPage = new AcceptAlertMasageOnCheckoutPage();
        AcceptAlertMasageOnCheckoutPage.getAcceptMassageOk();
    }
}