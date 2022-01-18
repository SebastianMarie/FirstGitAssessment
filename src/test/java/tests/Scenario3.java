package tests;

import base.BaseTests;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class Scenario3 extends BaseTests {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = setUp();
    }
    @Test
    public void scenario3() {
        //STEP 0) Load the Home Page
        //Creating object of Home page
        HomePage homePage = new HomePage(driver);

        //STEP 1) Find "Elements" button on the "HomePage" and click on it
        homePage.clickElements();

        //STEP 2) Creating object of Elements page
        ElementsPage elementsPage = new ElementsPage(driver);

        //STEP 3) Find "Web Tables" button in "ElementsPage" and click on it
        elementsPage.clickWebTables();

        //STEP 4) Creating an object of WebTables page
        WebTablesPage webTablesPage = new WebTablesPage(driver);

        //STEP 5) Edit the 2nd row in the "Web Tables" page with: firstName, lastName, age, email, salary and department
        webTablesPage.clickEditButtonRow2();
        webTablesPage.editFirstName("Ion");
        webTablesPage.editLastName("Pop");
        webTablesPage.editAge("40");
        webTablesPage.editUserEmail("test@automation.com");
        webTablesPage.editSalary("15000");
        webTablesPage.editDepartment("Legal");
        webTablesPage.clickSubmitBtn2();

        //STEP 5a) Verify if the expected 2nd row is the same with the actual edited 2nd row
        String expectedSecondRow = "Ion\n" + "Pop\n" + "40\n" + "test@automation.com\n" + "15000\n" + "Legal";
        String actualSecondRow = webTablesPage.viewSecondRowInput();
        Assertions.assertEquals(expectedSecondRow, actualSecondRow);

        //STEP 6) Delete the 3rd row in "Web Tables" page
        webTablesPage.clickDeleteThirdRowBtn();

        //STEP 6a) Verify if the expected 3rd row is deleted
        String expectedThirdRow = " " + " " + " " + " " + " " + " " + " ";
        String actualThirdRow = webTablesPage.viewThirdRowInput();
        Assertions.assertEquals(expectedThirdRow, actualThirdRow);

        //STEP 7) Fill up the 3rd row with data
        webTablesPage.addNewRecordRow();

        //STEP 7a) Verify if the actual data is the same as the expected data to fill in the form.
        String expectedThirdRowEdit = "Ion\n" + "Pop\n" + "40\n" + "test@automation.com\n" + "15000\n" + "Legal";
        String actualThirdRowEdit = webTablesPage.viewThirdRowInput();
        Assertions.assertEquals(expectedThirdRowEdit, actualThirdRowEdit);
    }
    @AfterEach
    public void quitWebDriver() {
        driver.quit();
    }
}