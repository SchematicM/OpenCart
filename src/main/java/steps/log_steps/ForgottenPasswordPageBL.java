package steps.log_steps;

import pages.log_pages.ForgottenPasswordPage;

public class ForgottenPasswordPageBL {


    private ForgottenPasswordPage forgottenPasswordPage;

    public ForgottenPasswordPageBL(){ forgottenPasswordPage = new ForgottenPasswordPage(); }

    public void enterEmail(String email){
        forgottenPasswordPage.getEmailString().clear();
        forgottenPasswordPage.getEmailString().sendKeys(email);
        forgottenPasswordPage.getContinueButton().click();
    }

    public void forgottenPassBackButton(){
        forgottenPasswordPage.getBackButton().click();
    }
}