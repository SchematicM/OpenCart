package pages.checkout_pages;

import lombok.SneakyThrows;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class AcceptAlertMasageOnCheckoutPage extends BasePage {
    private   void acceptMassageOk() {
        driver.switchTo().alert().accept();
    }

    @SneakyThrows
    public void getAcceptMassageOk(){
        wait.until(ExpectedConditions.alertIsPresent());
        acceptMassageOk();
    }
}