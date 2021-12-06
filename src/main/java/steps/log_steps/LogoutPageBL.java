package steps.log_steps;

import pages.log_pages.LogoutPage;
import steps.HomePageBL;

public class LogoutPageBL {

    private LogoutPage logoutPage;

    public LogoutPageBL() { logoutPage = new LogoutPage(); }

    public HomePageBL clickOnContinueButton() {
        logoutPage.getContinueButton().click();
        return new HomePageBL();
    }
}