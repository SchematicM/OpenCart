package steps.checkout_steps;

import datamodel.CheckoutModel;
import org.testng.Assert;
import pages.checkout_pages.CheckoutPageLoginedFirstTime;
import pages.checkout_pages.SuccessOrderPage;
import pages.checkout_pages.AcceptAlertMasageOnCheckoutPage;
import repository.CheckoutRepository;

public class CheckoutPageLoginedFirstTimeBL {
    private CheckoutPageLoginedFirstTime checkoutPageLoginedFirstTime;
    public CheckoutPageLoginedFirstTimeBL(){
        checkoutPageLoginedFirstTime = new CheckoutPageLoginedFirstTime();
    }

    public CheckoutPageLoginedFirstTimeBL checkoutBillingDetails(int country, int region) {
        CheckoutModel checkoutModel = CheckoutRepository.getCheckoutModel();
        //clickOnBillingDetailsButton();
        inputFirstname(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputCompany(checkoutModel.getCompany());
        inputAddress1(checkoutModel.getAddress1());
        inputAddress2(checkoutModel.getAddress2());
        inputCity(checkoutModel.getCity());
        inputPostcode(checkoutModel.getPostcode());
        clickOnCountryInputButton();
        clickOnCountryInputButtons(country);
        clickOnRegionInputButton();
        clickOnRegionInputButtons(region);
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
        //acceptMassage();
        //clickOnConfirmOrderButton();
        //successOrderPage = new SuccessOrderPage();
        return this;
    }




    private void inputFirstname(String firstName){
        checkoutPageLoginedFirstTime.getFirstNameInput().click();
        checkoutPageLoginedFirstTime.getFirstNameInput().clear();
        checkoutPageLoginedFirstTime.getFirstNameInput().click();
        checkoutPageLoginedFirstTime.getFirstNameInput().sendKeys(firstName);
    }
    private void inputLastName(String lastName){
        checkoutPageLoginedFirstTime.getLastNameInput().click();
        checkoutPageLoginedFirstTime.getLastNameInput().clear();
        checkoutPageLoginedFirstTime.getLastNameInput().sendKeys(lastName);
    }
    private void inputCompany(String company){
        checkoutPageLoginedFirstTime.getCompanyInput().click();
        checkoutPageLoginedFirstTime.getCompanyInput().clear();
        checkoutPageLoginedFirstTime.getCompanyInput().sendKeys(company);
    }
    private void inputAddress1(String address1){
        checkoutPageLoginedFirstTime.getAddress1Input().click();
        checkoutPageLoginedFirstTime.getAddress1Input().clear();
        checkoutPageLoginedFirstTime.getAddress1Input().sendKeys(address1);
    }
    private void inputAddress2(String address2){
        checkoutPageLoginedFirstTime.getAddress2Input().click();
        checkoutPageLoginedFirstTime.getAddress2Input().clear();
        checkoutPageLoginedFirstTime.getAddress2Input().sendKeys(address2);
    }
    private void inputCity(String city){
        checkoutPageLoginedFirstTime.getCityInput().click();
        checkoutPageLoginedFirstTime.getCityInput().clear();
        checkoutPageLoginedFirstTime.getCityInput().sendKeys(city);
    }
    private void inputPostcode(String postcode){
        checkoutPageLoginedFirstTime.getPostcodeInput().click();
        checkoutPageLoginedFirstTime.getPostcodeInput().clear();
        checkoutPageLoginedFirstTime.getPostcodeInput().sendKeys(postcode);
    }
    private void inputDeliveryMethodComment(String DeliveryMethodComment){
        checkoutPageLoginedFirstTime.getDeliveryMethodComment().click();
        checkoutPageLoginedFirstTime.getDeliveryMethodComment().clear();
        checkoutPageLoginedFirstTime.getDeliveryMethodComment().sendKeys(DeliveryMethodComment);
    }
    private void inputPaymentMethodComment(String PaymentMethodComment){
        checkoutPageLoginedFirstTime.getPaymentMethodComment().click();
        checkoutPageLoginedFirstTime.getPaymentMethodComment().clear();
        checkoutPageLoginedFirstTime.getPaymentMethodComment().sendKeys(PaymentMethodComment);
    }

    public void clickOnBillingDetailsButton(){
        checkoutPageLoginedFirstTime.getBillingDetailsButton().click();
    }
    public void clickOnCountryInputButton(){
        checkoutPageLoginedFirstTime.getCountryInputButton().click();
    }
    public void clickOnCountryInputButtons(int value){
        checkoutPageLoginedFirstTime.getCountryInputButtons(value).click();
    }
    public void clickOnRegionInputButton(){
        checkoutPageLoginedFirstTime.getRegionInputButton().click();
    }
    public void clickOnRegionInputButtons(int value){
        checkoutPageLoginedFirstTime.getRegionInputButtons(value).click();
    }
    public void clickOnBillingDetailsContinueButton(){
        checkoutPageLoginedFirstTime.getBillingDetailsContinueButton().click();
    }
    public void clickOnDeliveryDetailsButton(){
        checkoutPageLoginedFirstTime.getDeliveryDetailsButton().click();
    }
    public void clickOnAddressRadioButton(){
        checkoutPageLoginedFirstTime.getAddressRadioButton().click();
    }
    public void clickOnDeliveryDetailsContinueButton(){
        checkoutPageLoginedFirstTime.getDeliveryDetailsContinueButton().click();
    }
    public void clickOnDeliveryMethodButton(){
        checkoutPageLoginedFirstTime.getDeliveryMethodButton().click();
    }
    public void clickOnDeliveryMethodRadioButton(){
        checkoutPageLoginedFirstTime.getDeliveryMethodRadioButton().click();
    }

    public void clickOnDeliveryMethodComment(){
        checkoutPageLoginedFirstTime.getDeliveryMethodComment().click();
    }
    public void clickOnDeliveryMethodContinueButton(){
        checkoutPageLoginedFirstTime.getDeliveryMethodContinueButton().click();
    }
    public void clickOnPaymentMethodButton(){
        checkoutPageLoginedFirstTime.getPaymentMethodButton().click();
    }
    public void clickOnPaymentMethodRadioButton(){
        checkoutPageLoginedFirstTime.getPaymentMethodRadioButton().click();
    }
    public void clickOnPaymentMethodComment(){
        checkoutPageLoginedFirstTime.getPaymentMethodComment().click();
    }
    public void clickOnAgreementCheckbox(){
        checkoutPageLoginedFirstTime.getAgreementCheckbox().click();
    }
    public void clickOnPaymentMethodContinueButton(){
        checkoutPageLoginedFirstTime.getPaymentMethodContinueButton().click();
    }
    public void clickOnConfirmOrderButton(){
        checkoutPageLoginedFirstTime.getConfirmOrderButton().click();
    }

    public void successCheckout() {
        SuccessOrderPage successOrderPage = new SuccessOrderPage();
        String expected = "Thanks for shopping with us online!";
        Assert.assertEquals(successOrderPage.getSuccessTitle().getText(),expected,"Successful");
    }

    public void acceptMassageOk(){
        AcceptAlertMasageOnCheckoutPage AcceptAlertMasageOnCheckoutPage = new AcceptAlertMasageOnCheckoutPage();
        AcceptAlertMasageOnCheckoutPage.getAcceptMassageOk();
    }




}