package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TextBoxPage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class SimpleWebTest<JavaScriptExecutor> {

    private WebDriver driver;
    private WebDriverWait wait;
    private Object webDriver;
    private By form;


    @BeforeEach

    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();

    }
        //Scenariul 1
        @Test
        public void clickSubmitButton(){

        //STEP 0) Load the Home Page
        driver.get("https://demoqa.com/");

        //STEP 1) Find "Elements" tab and click on it
        WebElement elements = driver.findElement(By.cssSelector(".card.top-card:first-child"));
        elements.click();

        //STEP 2) Find "Text Box" tab and click on it
        WebElement textBox = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-0']"));
        textBox.click();

        //STEP 3) Fill up the "User Name" , "email", "Current Address" and "Permanent Address" text field with valid credentials
        WebElement textUserName = driver.findElement(By.id("userName"));
        textUserName.sendKeys("Sebastian Marie");
        WebElement textEmail = driver.findElement(By.id("userEmail"));
        textEmail.sendKeys("sebastian.marie@fortech.ro");
        WebElement textCurrentAddress = driver.findElement(By.id("currentAddress"));
        textCurrentAddress.sendKeys("Frunzisului,106");
        WebElement textPermanentAddress = driver.findElement(By.id("permanentAddress"));
        textPermanentAddress.sendKeys("Frunzisului,106");

        //STEP 4) Click on the "Submit" button
        WebElement submitButton = driver.findElement(By.id("submit"));
        //Bring "Submit" button on view from under the Google adds
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        submitButton.click();
    }
       //Scenariul 2
       @Test
       public void saveGeneratedTextInVariableAndPrintOut(){
           //STEP 0) Load the Home Page
           driver.get("https://demoqa.com/");

           //STEP 1) Find "Elements" tab and click on it
           WebElement tabElements = driver.findElement(By.cssSelector(".card.top-card:first-child"));
           tabElements.click();

           //STEP 2) Find "Check Box" tab and click on it
           WebElement tabCheckBox = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-1']"));
           tabCheckBox.click();

           //STEP 3) Expand "Home", by clicking on the 'arrow'
           WebElement expandHome = driver.findElement(By.cssSelector(".rct-icon-expand-close"));
           expandHome.click();

           //STEP 4) Find the "Desktop" checkbox and click on it
           WebElement desktopCheckBox = driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-title"));
           desktopCheckBox.click();

           //Step 5) Collect and save the printed "text" and print it in the console
           String myText = driver.findElement(By.id("result")).getText();

           System.out.println("The text is: " + myText);

       }
       //Scenariul 3
       @Test
       public void editWebTables() {
           //STEP 0) Load the Home Page
           driver.get("https://demoqa.com/");

           //STEP 1) Find "Elements" tab and click on it
           WebElement tabElements = driver.findElement(By.cssSelector(".top-card:first-child"));
           tabElements.click();

           //STEP 2) Find "Web Tables" tab and click on it
           WebElement tabWebTables = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-3']"));
           tabWebTables.click();

           //STEP 3) Find the 2nd line "Edit" button and click on it
           WebElement secondEditButton = driver.findElement(By.id("edit-record-2"));
           secondEditButton.click();

           //STEP 4) Find all printed lines of the "RegForm" delete them and write new values

           WebElement firstName = driver.findElement(By.id("firstName"));
           firstName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           firstName.sendKeys("Ion");

           WebElement lastName = driver.findElement(By.id("lastName"));
           lastName.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           lastName.sendKeys("Pop");

           WebElement email = driver.findElement(By.id("userEmail"));
           email.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           email.sendKeys("test@automation.com");

           WebElement age = driver.findElement(By.id("age"));
           age.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           age.sendKeys("40");


           WebElement salary = driver.findElement(By.id("salary"));
           salary.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           salary.sendKeys("15000");

           WebElement department = driver.findElement(By.id("department"));
           department.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
           department.sendKeys("Legal");

           WebElement submit = driver.findElement(By.id("submit"));
           submit.click();

       }
       //Scenariul 4)
       @Test
       public void uploadFile() {
               //STEP 0) Load the Home Page
               driver.get("https://demoqa.com/");

               //STEP 1) Find "Elements" tab and click on it
               WebElement tabElements = driver.findElement(By.cssSelector(".top-card:first-child"));
               tabElements.click();

               //STEP 2) Find "Upload and Download" tab and click on it
               WebElement tabUploadAndDownload = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-7']"));
               //Bring "Submit" button on view from under the Google adds
               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabUploadAndDownload);
               tabUploadAndDownload.click();

               //STEP 3) Find "Choose File" button and click on it for upload
               WebElement chooseFileButton = driver.findElement(By.cssSelector(".form-file-label"));
               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", chooseFileButton);
               chooseFileButton.click();

               //STEP 4) Upload a "Zip" file
               WebElement addFile = driver.findElement(By.xpath(".//input[@type='file']"));
               addFile.sendKeys("C:/Users/sebastian.marie/Downloads/jar_files.zip");

       }
       //Scenariul 5)
       @Test
       public void printText() {
           //STEP 0) Load the Home Page
           driver.get("https://demoqa.com/");

           //STEP 1) Find "Alerts, Frame & Windows" tab and click on it
           WebElement tabAlertsFrameWindows = driver.findElement(By.cssSelector(".top-card:nth-child(3)"));
           tabAlertsFrameWindows.click();

           //Step 2) Find "Frames" tab and click on it
           WebElement tabFrames = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-2']"));
           //Bring "Submit" button on view from under the Google adds
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabFrames);
           tabFrames.click();

           // Switched to the iFrame
           WebElement iFrame1 = driver.findElement(By.id("frame1"));
           driver.switchTo().frame(iFrame1);

           //STEP 3) Save the text from "iFrame" into a String type variable
           String str = driver.findElement(By.id("sampleHeading")).getText();

           //STEP 4) Print the text in the console
           System.out.println("The iFrame text is: " + str);

       }
           //Scenariul 6)
           @Test
           public void setDate () {
               //STEP 0) Load the Home Page
               driver.get("https://demoqa.com/");

               //STEP 1) Find "Widgets" and click on it
               WebElement Widgets = driver.findElement(By.cssSelector(".top-card:nth-child(4)"));
               Widgets.click();

               //STEP 2) Find "Date Picker" and click on it
               WebElement datePicker = driver.findElement(By.xpath("//div[contains(@class, 'show')]/ul/li[@id='item-2']"));
               //Bring "Submit" button on view from under the Google adds
               ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", datePicker);
               datePicker.click();

               //STEP 3) Change date with 30 days ahead in both dropdown lists
               WebElement dropDownSelectDate = driver.findElement(By.id("datePickerMonthYearInput"));
               dropDownSelectDate.click();
               Date date = new Date();
               SimpleDateFormat df  = new SimpleDateFormat("MM/dd/YYYY");
               Calendar c1 = Calendar.getInstance();
               String currentDate = df.format(date);// get current date here

               // now add 30 day in Calendar instance
               c1.add(Calendar.DAY_OF_YEAR, 30);
               df = new SimpleDateFormat("MM/dd/YYYY");
               Date resultDate = c1.getTime();
               String     dueDate = df.format(resultDate);
               driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.CONTROL, "A");
               driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.BACK_SPACE);
               driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(dueDate);

               driver.findElement(By.cssSelector(".col-md-3.col-sm-12:nth-child(1)")).click();

               WebElement dropDownDateAndTimePickerInput = driver.findElement(By.id("dateAndTimePickerInput"));
               dropDownDateAndTimePickerInput.click();
               date = new Date();
               df = new SimpleDateFormat("MM/dd/YYYY");
               c1 = Calendar.getInstance();
               currentDate = df.format(date);

               // now add 30 day in Calendar instance
               c1.add(Calendar.DAY_OF_YEAR, 30);
               df = new SimpleDateFormat("MM/dd/YYYY");
               resultDate = c1.getTime();
               dueDate = df.format(resultDate);
               driver.findElement(By.id("dateAndTimePickerInput")).sendKeys(Keys.CONTROL, "A");
               driver.findElement(By.id("dateAndTimePickerInput")).sendKeys(Keys.BACK_SPACE);
               driver.findElement(By.id("dateAndTimePickerInput")).sendKeys(dueDate);

               driver.findElement(By.cssSelector(".col-md-3.col-sm-12:nth-child(1)")).click();

           }
           /* @AfterEach
           public void quitWebDriver() {
           driver.quit();
          }*/

   }
