package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;

public class MenuPage extends BasePage {
    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktopsMenuButton;

    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement seeAllDesktopsMenuButton;

    @FindBy(xpath = "//a[text()='Desktops']/..//li")
    private List<WebElement> desktopsMenuButtons;


    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    private WebElement laptopsAndNotebooksMenuButton;

    @FindBy(xpath = "//a[text()='Show All Laptops & Notebooks")
    private WebElement seeAllLaptopsAndNotebooksMenuButton;

    @FindBy(xpath = "//a[text()='Laptops & Notebooks']/..//li")
    private List<WebElement> laptopsAndNotebooksMenuButtons;

    @FindBy(xpath = "//a[text()='Components']")
    private WebElement componentsMenuButton;

    @FindBy(xpath = "//a[text()='Show All Components']")
    private WebElement seeAllComponentsMenuButton;

    @FindBy(xpath = "//a[text()='Components/..//li")
    private List<WebElement> componentsMenuButtons;

    @FindBy(xpath = "//a[text()='Tablets']")
    private WebElement tabletsMenuButton;

    @FindBy(xpath = "//a[text()='Software']")
    private WebElement softwareMenuButton;

    @FindBy(xpath = "//a[text()='Phones & PDAs']")
    private WebElement phonesAndPDAsMenuButton;

    @FindBy(xpath = "//a[text()='Cameras']")
    private WebElement camerasMenuButton;

    @FindBy(xpath = "//a[text()='MP3 Players']")
    private WebElement mp3PlayersMenuButton;

    @FindBy(xpath = "//a[text()='Show All MP3 Players']")
    private WebElement seeAllMp3PlayersMenuButton;

    @FindBy(xpath = "//a[text()='MP3 Players']/..//li")
    private List<WebElement> mp3PlayersMenuButtons;

    public WebElement getDesktopsMenuButton() {
        return desktopsMenuButton;
    }

    public WebElement getsSeeAllDesktopsMenuButton() {
        wait.until(ExpectedConditions.visibilityOf(seeAllDesktopsMenuButton));
        return seeAllDesktopsMenuButton;
    }

    public WebElement getDesktopsMenuButtons(int value) {
        return desktopsMenuButtons.get(value);
    }

    public WebElement getLaptopsAndNotebooksMenuButton() {
        return laptopsAndNotebooksMenuButton;
    }

    public WebElement getSeeAllLaptopsAndNotebooksMenuButton() {
        return seeAllLaptopsAndNotebooksMenuButton;
    }

    public WebElement getLaptopsAndNotebooksMenuButtons(int value) {
        return laptopsAndNotebooksMenuButtons.get(value);
    }

    public WebElement getComponentsMenuButton() {
        return componentsMenuButton;
    }

    public WebElement getSeeAllComponentsMenuButton() {
        return seeAllComponentsMenuButton;
    }

    public WebElement getComponentsMenuButtons(int value) {
        return componentsMenuButtons.get(value);
    }

    public WebElement getTabletsMenuButton() {
        return tabletsMenuButton;
    }

    public WebElement getSoftwareMenuButton() {
        return softwareMenuButton;
    }

    public WebElement getPhonesAndPDAsMenuButton() {
        return phonesAndPDAsMenuButton;
    }

    public WebElement getCamerasMenuButton() {
        return camerasMenuButton;
    }

    public WebElement getMp3PlayersMenuButton() {
        return mp3PlayersMenuButton;
    }

    public WebElement getSeeAllMp3PlayersMenuButton() {
        return seeAllMp3PlayersMenuButton;
    }

    public WebElement getMp3PlayersMenuButtons(int value) {
        return mp3PlayersMenuButtons.get(value);
    }


}
