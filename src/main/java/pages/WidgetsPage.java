package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WidgetsPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public WidgetsPage(WebDriver driver) {

        this.driver = driver;
    }
    //Locator for "DatePicker" button
    By datePickerBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-2']");

    //Method to click on the "DatePicker" button
    public void clickDatePickerBtn() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(datePickerBtn));
        driver.findElement(datePickerBtn).click();
    }
}
