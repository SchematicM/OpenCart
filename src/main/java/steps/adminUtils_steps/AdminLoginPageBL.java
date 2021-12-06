package steps.adminUtils_steps;

import datamodel.LoginModel;
import driver.DriverRepository;
import lombok.SneakyThrows;
import org.testng.Assert;
import pages.adminUtils.AdminLoginPage;
import repository.LoginModelRepository;
import steps.MyAccountPageBL;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPage;
    public AdminLoginPageBL(){adminLoginPage =new AdminLoginPage();}

    public void loginValidAdmin() {
        LoginModel loginModel = LoginModelRepository.getValidAdminLoginModel();
        inputUsername(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
    }

    private void inputUsername(String email) {
        adminLoginPage.getInputUsername().clear();
        adminLoginPage.getInputUsername().sendKeys(email);
    }

    private void inputPassword(String password) {
        adminLoginPage.getInputPassword().clear();
        adminLoginPage.getInputPassword().sendKeys(password);
    }

    public void clickOnLoginButton()
    {
        adminLoginPage.getLoginButton().click();
    }
    public AdminMainPageBL successfulLoginCheck() {
        String expected = "http://localhost/opencart/upload/admin/index.php";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertTrue( actual.contains(expected),"Ooops, Error Login!");
        return new AdminMainPageBL();
    }

}