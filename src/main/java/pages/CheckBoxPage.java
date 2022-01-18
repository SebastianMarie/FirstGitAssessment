package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locator for ExpandHome arrow button
    By expandHomeBtn = By.cssSelector(".rct-icon-expand-close");

    //Locator for Desktop checkbox
    By desktopCheckBox = By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-title");

    //Locator for the printed text
    By printedText = By.id("result");

    //Method to enter ExpandHome arrow and click on it
    public void clickExpandHomeBtn() {

        driver.findElement(expandHomeBtn).click();
    }
    //Method to enter Desktop checkbox and click on it
    public void clickDesktopBtn() {

        driver.findElement(desktopCheckBox).click();
    }
    //Method to get the printed text and print it in the console
    public void printText() {
        String myText = driver.findElement(printedText).getText();

        System.out.println(myText);
    }
    //Method to view the text in the "Text Area"
    public String viewPrintedText() {

        return driver.findElement(printedText).getText();

    }
}
