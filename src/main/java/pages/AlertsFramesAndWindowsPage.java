package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AlertsFramesAndWindowsPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public AlertsFramesAndWindowsPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locator for "Frames" button
    By framesBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-2']");

    //Method to click on the "Frames" button after got into view
    public void clickFramesBtn() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  driver.findElement(framesBtn));
        driver.findElement(framesBtn).click();
    }
}

