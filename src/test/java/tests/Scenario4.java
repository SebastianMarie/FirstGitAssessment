package tests;

import base.BaseTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.ElementsPage;
import pages.HomePage;
import pages.UploadAndDownloadPage;

public class Scenario4 extends BaseTests {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {

        driver = setUp();
    }
    @Test
    public void scenario4() {
        //STEP 0) Load the Home Page
        //Creating object of Home page
        HomePage homePage = new HomePage(driver);

        //STEP 1) Find "Elements" button on the "HomePage" and click on it
        homePage.clickElements();

        //STEP 2) Creating object of Elements page
        ElementsPage elementsPage = new ElementsPage(driver);

        //STEP 4) Find "Upload And Download" button and click on it
        elementsPage.clickUploadAndDownloadBtn();

        //STEP 5) Creating object of UploadAndDownload page
        UploadAndDownloadPage uploadAndDownloadPage = new UploadAndDownloadPage(driver);

        //STEP 6) Upload a zip type file
        uploadAndDownloadPage.uploadFile("C://Users/sebastian.marie/Desktop/DemoqaAutFramework/resources");

    }

}