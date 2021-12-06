package pages.wish_list_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.containers.WishListContainer;

import java.util.ArrayList;
import java.util.List;

public class WishListPage extends BasePage {

    @FindBy(xpath = ".//tbody/tr")
    List<WebElement> products;

    @FindBy(className = "pull-right")
    WebElement continueButton;

    public List<WishListContainer> getProducts() {

        List<WishListContainer> wishListContainers = new ArrayList<>();
        for (WebElement element : products) {
            wishListContainers.add(new WishListContainer(element));
        }

        return wishListContainers;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}