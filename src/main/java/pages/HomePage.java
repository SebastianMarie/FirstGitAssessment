package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    //Locator for "Elements" button
    By elementsBtn = By.cssSelector(".top-card:first-child");

    //Method to click Elements button
    public void clickElements() {
        driver.findElement(elementsBtn).click();
    }
    //Locator for AlertsFramesAndWindows button
    By alertsFramesAndWindowsBtn = By.cssSelector(".top-card:nth-child(3)");

    //Method to click AlertsFramesAndWindows button
    public void clickAlertsFramesAndWindows() {
        driver.findElement(alertsFramesAndWindowsBtn).click();
    }
    //Locator for Widgets button
    By widgetsBtn = By.cssSelector(".top-card:nth-child(4)");

    //Method to click Widgets button
    public void clickWidgets() {
        driver.findElement(widgetsBtn).click();
    }

}
