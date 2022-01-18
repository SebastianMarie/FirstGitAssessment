package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WebTablesPage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public WebTablesPage(WebDriver driver) {

        this.driver = driver;
    }
    //Locator for editing button in the 2nd row
    By editButtonBtnRow2 = By.id("edit-record-2");

    //Locator for "firstName" text box
    By firstNameInputRow2 = By.id("firstName");

    //Locator for "lastName" text box
    By lastNameInputRow2 = By.id("lastName");

    //Locator for "userEmail" text box
    By userEmailInputRow2 = By.id("userEmail");

    //Locator for "age" text box
    By ageInputRow2 = By.id("age");

    //Locator for "salary" text box
    By salaryInputRow2 = By.id("salary");

    //Locator for "department" text box
    By departmentInputRow2 = By.id("department");

    //Locator for "submit" button
    By submitBtn2 = By.id("submit");

    //Locator for "delete" the 3rd row button
    By deleteBtnRow3 = By.id("delete-record-3");

    //Locator for "add" button
    By addNewRecordBtn = By.id("addNewRecordButton");

    //Locator for the new 2nd row
    By secondRowInput = By.cssSelector(".rt-tr-group:nth-child(2)");

    //Locator for the new 3rd row
    By thirdRowInput = By.cssSelector(".rt-tr-group:nth-child(3)");

    //Method to find editButton and click on it
    public void clickEditButtonRow2() {

        driver.findElement(editButtonBtnRow2).click();
    }
    //Method to edit "firstName" text box, delete the previous content and write a new content
    public void editFirstName(String first_name) {
        driver.findElement(firstNameInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(firstNameInputRow2).sendKeys(first_name);
    }
    //Method to edit "firstName" text box, delete the previous content and write a new content
    public void editLastName(String last_name) {
        driver.findElement(lastNameInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(lastNameInputRow2).sendKeys(last_name);
    }
    //Method to edit "userEmail" text box, delete the previous content and write a new content
    public void editUserEmail(String user_email) {
        driver.findElement(userEmailInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(userEmailInputRow2).sendKeys(user_email);
    }
    //Method to edit "age" text box, delete the previous content and write a new content
    public void editAge(String user_age) {
        driver.findElement(ageInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(ageInputRow2).sendKeys(user_age);
    }
    //Method to edit "salary" text box, delete the previous content and write a new content
    public void editSalary(String user_salary) {
        driver.findElement(salaryInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(salaryInputRow2).sendKeys(user_salary);
    }
    //Method to edit "department" text box, delete the previous content and write a new content
    public void editDepartment(String user_department) {
        driver.findElement(departmentInputRow2).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        driver.findElement(departmentInputRow2).sendKeys(user_department);
    }
    //Method to find the submit button and click on it
    public void clickSubmitBtn2() {

        driver.findElement(submitBtn2).click();
    }
    //Method to find the 3rd row and click "delete" button  on it
    public void clickDeleteThirdRowBtn() {

        driver.findElement(deleteBtnRow3).click();
    }
    //Method to add a new row
    public void addNewRecordRow() {
        driver.findElement(addNewRecordBtn).click();
        editFirstName("Ion");
        editLastName("Pop");
        editUserEmail("test@automation.com");
        editAge("40");
        editSalary("15000");
        editDepartment("Legal");
        driver.findElement(submitBtn2).click();
    }
    //Method to view the new 2nd row
    public String viewSecondRowInput() {
        return driver.findElement(secondRowInput).getText();
    }
    //Method to view the new 3rd row
    public String viewThirdRowInput() {
        return driver.findElement(thirdRowInput).getText();
    }
}

