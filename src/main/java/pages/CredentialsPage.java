package pages;

/*Credentials for use for this project
First Name: Ion
Last Name: Pop
Full Name: Ion Pop
Age: 40
Email: test@automation.com
Salary: 15000
Department: Legal
Current Address: Frunzisului 106
Permanent Addres: Frunzisului 106
*/
public class CredentialsPage {

    String firstName = "Ion";

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    String lastName = "Pop";

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    String userName = "Ion Pop";

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    String userEmail = "test@automation.com";

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    int age = Integer.parseInt("40");

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    int salary = Integer.parseInt("15000");

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    String department = "Legal";

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    String currentAddress = "Frunzisului 106";

    public String getCurrentAddress() {
        return currentAddress;
    }
    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }
    String permanentAddress = "Frunzisului 106";

    public String getPermanentAddress() {
        return permanentAddress;
    }
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

}
