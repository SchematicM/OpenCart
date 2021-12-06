package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListContainer {

    private WebElement rootElement;

    public WishListContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getImage() {
        return rootElement.findElement(By.xpath(".//img[contains(@src, 'demo')]"));
    }

    public String getTitle() {
        return rootElement.findElement(By.xpath(".//*[@class = 'text-left']/a")).getText();
    }

    public WebElement getTitleButton() {
        return rootElement.findElement(By.xpath(".//*[@class = 'text-left']/a"));
    }

    public String getModel() {
        return rootElement.findElement(By.xpath(".//tbody/tr/*[@class = 'text-left'][2]")).getText();
    }

    public String getStockStatus() {
        return rootElement.findElement(By.xpath(".//tbody/tr/*[@class = 'text-right'][1]")).getText();
    }

    public String getPrice() {
        return rootElement.findElement(By.xpath(".//*[@class = 'price']")).getText().split(" ")[0];
    }

    public WebElement getAddToCartButton() {
        return rootElement.findElement(By.xpath(".//*[contains(@onclick, 'cart.add')]"));
    }

    public WebElement getRemoveButton() {
        return rootElement.findElement(By.xpath(".//*[@data-original-title = 'Remove']"));
    }

}