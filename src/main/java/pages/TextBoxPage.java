package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public TextBoxPage(WebDriver driver) {

        this.driver = driver;
    }

    //Locator for UserName field
    By userNameInput = By.id("userName");

    //Locator for Email field
    By emailInput = By.id("userEmail");

    //Locator for CurrentAddress field
    By currentAddressInput = By.id("currentAddress");

    //Locator for PermanentAddress field
    By permanentAddressInput = By.id("permanentAddress");

    //Locator for Submit button
    By submitButton1 = By.id("submit");

    //Locator for "Text Area"
    By textArea = By.cssSelector(".border.col-md-12.col-sm-12");

    //Method to enter userName
    public void enterUserName(String user_name) {

        driver.findElement(userNameInput).sendKeys(user_name);
    }

    //Method to enter Email
    public void enterEmail(String email_address) {

        driver.findElement(emailInput).sendKeys(email_address);
    }

    //Method to enter CurrentAddress
    public void enterCurrentAddress(String current_address) {

        driver.findElement(currentAddressInput).sendKeys(current_address);
    }

    //Method to enter PermanentAddress
    public void enterPermanentAddress(String permanent_address) {

        driver.findElement(permanentAddressInput).sendKeys(permanent_address);
    }

    //Method to click on Submit button and bring it in to view
    public void clickSubmitBTn1() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(submitButton1));
        driver.findElement(submitButton1).click();
    }

    //Method to view the text in the "Text Area"
    public String viewTextArea() {

        return driver.findElement(textArea).getText();

    }

}
