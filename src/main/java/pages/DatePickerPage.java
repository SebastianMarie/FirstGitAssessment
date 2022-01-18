package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePickerPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public DatePickerPage(WebDriver driver) {

        this.driver = driver;
    }
    //Locator for "datePickerMonthYearInput" input box
    By datePickerMonthYearInput = By.cssSelector("#datePickerMonthYearInput");

    //Locator for "dateAndTimePickerInput" input box
    By dateAndTimePickerInput = By.cssSelector("#dateAndTimePickerInput");

    //Locator for "Select Date" button
    By selectDateBtn = By.cssSelector(".col-md-3.col-sm-12:nth-child(1)");

    //Method to edit the "datePickerMonthYearInput" input box
    public void editDatePickerMonthYearInput() {
        driver.findElement(datePickerMonthYearInput).click();
        //Change the date by 30 days forward in the "DatePickerMonthYearInput"
        // get current date here
        WebElement dropDownSelectDate = driver.findElement(datePickerMonthYearInput);
        dropDownSelectDate.click();
        Date date = new Date();
        SimpleDateFormat df  = new SimpleDateFormat("MM/dd/YYYY");
        Calendar c1 = Calendar.getInstance();
        String currentDate = df.format(date);

        // now add 30 day in Calendar instance
        c1.add(Calendar.DAY_OF_YEAR, 30);
        df = new SimpleDateFormat("MM/dd/YYYY");
        Date resultDate = c1.getTime();
        String     dueDate = df.format(resultDate);
        driver.findElement(datePickerMonthYearInput).sendKeys(Keys.CONTROL, "A");
        driver.findElement(datePickerMonthYearInput).sendKeys(Keys.BACK_SPACE);
        driver.findElement(datePickerMonthYearInput).sendKeys(dueDate);


    }
    //Method to edit the "dateAndTimePickerInput" input box
    public void editDateAndTimePickerInput() {
        driver.findElement(dateAndTimePickerInput).click();
        //Change the date by 30 days forward in the "DateAndTimePickerInput"
        // get current date here
        WebElement dropDownSelectDate = driver.findElement(dateAndTimePickerInput);
        dropDownSelectDate.click();
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
        Calendar c1 = Calendar.getInstance();
        String currentDate = df.format(date);

        // now add 30 day in Calendar instance
        c1.add(Calendar.DAY_OF_YEAR, 30);
        df = new SimpleDateFormat("MM/dd/YYYY");
        Date resultDate = c1.getTime();
        String dueDate = df.format(resultDate);
        driver.findElement(dateAndTimePickerInput).sendKeys(Keys.CONTROL, "A");
        driver.findElement(dateAndTimePickerInput).sendKeys(Keys.BACK_SPACE);
        driver.findElement(dateAndTimePickerInput).sendKeys(dueDate);

    }
    //Method to click on "Select Date" button
    public void clickSelectDateBtn() {
        driver.findElement(selectDateBtn).click();
    }


}

