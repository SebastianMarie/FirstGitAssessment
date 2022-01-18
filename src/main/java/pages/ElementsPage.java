package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementsPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public ElementsPage(WebDriver driver) {

        this.driver = driver;
    }

    //Locator for TextBox button
    By textBoxBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-0']");

    //Locator for CheckBox button
    By checkBoxBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-1']");

    //Locator for WebTables button
    By webTablesBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-3']");

    //Locator for UploadAndDownload button
    By uploadAndDownloadBtn = By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-7']");

    //Method to click on TextBox button
    public void clickTextBoxBtn() {
        driver.findElement(textBoxBtn).click();
    }
    //Method to click on CheckBox button
    public void clickCheckBoxBtn() {
        driver.findElement(checkBoxBtn).click();
    }
    //Method to click on WebTables button
    public void clickWebTables() {
        driver.findElement(webTablesBtn).click();
    }
    //Method to click on UploadAndDownload button
    public void clickUploadAndDownloadBtn() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(uploadAndDownloadBtn));
        driver.findElement(uploadAndDownloadBtn).click();
    }

}
