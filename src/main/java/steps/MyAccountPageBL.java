package steps;

import pages.MyAccountPage;

public class MyAccountPageBL {

    private final MyAccountPage myAccountPage;

    public MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnBackToHomePageButton() {
        myAccountPage.getBackToHomePageButton().click();
        return this;
    }

    public MyAccountPageBL clickOnMyAccountButton() {
        myAccountPage.getTextListGroup("My Account").click();
        return this;
    }

    public MyAccountPageBL clickOnEditAccountButton() {
        myAccountPage.getTextListGroup("Edit Account").click();
        return this;
    }

    public MyAccountPageBL clickOnPasswordButton() {
        myAccountPage.getTextListGroup("Password").click();
        return this;
    }

    public MyAccountPageBL clickOnWishListButton() {
        myAccountPage.getTextListGroup("Wish List").click();
        return this;
    }

    public MyAccountPageBL clickOnLogoutButton() {
        myAccountPage.getTextListGroup("Logout").click();
        return this;
    }

    public MyAccountPageBL clickOnEditAccountInformationButton() {
        myAccountPage.getTextUnstyledGroup("Edit").click();
        return this;
    }

    public MyAccountPageBL clickOnChangePasswordButton() {
        myAccountPage.getTextUnstyledGroup("Change").click();
        return this;
    }

    public MyAccountPageBL clickOnModifyWishListButton() {
        myAccountPage.getTextUnstyledGroup("wish").click();
        return this;
    }

    public HomePageBL getHomePageBL() {
        return new HomePageBL();
    }

    public EditAccountInformationPageBL getEditAccountInformationPageBL() {
        return new EditAccountInformationPageBL();
    }

    public ChangePasswordPageBL getChangePasswordPageBL() {
        return new ChangePasswordPageBL();
    }

}
