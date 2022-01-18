package tests;

import base.BaseTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import pages.DatePickerPage;
import pages.HomePage;
import pages.WidgetsPage;

public class Scenario6 extends BaseTests {
    private WebDriver driver;
    private By datePickerMonthYearInput;
    private By dateAndTimePickerInput;

    @BeforeEach
    public void initDriver() {

        driver = setUp();
    }
    @Test
    public void scenario6() {
        //STEP 0) Load the Home Page
        //Creating object of Home page
        HomePage homePage = new HomePage(driver);

        //STEP 1) Find "Widgets" button on the "HomePage" and click on it
        homePage.clickWidgets();

        //STEP 2) Creating object of "Widgets" page
        WidgetsPage widgetsPage = new WidgetsPage(driver);

        //STEP 3) Find "DatePicker" button and click on it
        widgetsPage.clickDatePickerBtn();

        //STEP 4) Creating object of "Date Picker" page
        DatePickerPage datePickerPage = new DatePickerPage(driver);

        //STEP 5) Edit the "DatePickerMonthYearInput"
        datePickerPage.editDatePickerMonthYearInput();

        //STEP 6)
        //Click on the "Select Date" button
        datePickerPage.clickSelectDateBtn();

        //STEP 7)
        //Edit the "DateAndTimePickerInput"
        datePickerPage.editDateAndTimePickerInput();

        //STEP 8)
        //Click on the "Select Date" button
        datePickerPage.clickSelectDateBtn();



    }
}