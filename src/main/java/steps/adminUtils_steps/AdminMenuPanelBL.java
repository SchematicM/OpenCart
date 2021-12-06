package steps.adminUtils_steps;

import pages.adminUtils.AdminMenuPanel;

public class AdminMenuPanelBL{
    private AdminMenuPanel  adminMenuPanel;
    public AdminMenuPanelBL () {adminMenuPanel = new AdminMenuPanel();}

    public AdminMenuPanelBL clickOnMarketingDropdown() {
        adminMenuPanel.getMarketingDropdownMenu().click();
        return this;
    }

    public AdminMenuPanelBL clickOnCouponsButton() {
        adminMenuPanel.getCouponsMenuButton().click();
        return this;
    }

    public void clickOnAddCouponsButton() {
        adminMenuPanel.getAddCouponButton().click();
    }
}