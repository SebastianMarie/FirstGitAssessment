package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UploadAndDownloadPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public UploadAndDownloadPage(WebDriver driver) {

        this.driver = driver;
    }
    //Locator for "uploadFile" button
    By chooseFileBtn = By.id("uploadFile");

    public void uploadFile(String pathToFile) {

        driver.findElement(chooseFileBtn).sendKeys(pathToFile);
    }



}

