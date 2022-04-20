package testsuite;

import browserfactory.BaseTest;
import javafx.scene.control.PasswordField;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;

public class RegistrationTest extends BaseTest {
    String baseUrl ="https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setup(){
        openBrowser(baseUrl);}


    @Test
    public void verifyThatSigningUpPageDisplay() {
        //click on the Registration link
        WebElement Registrationlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        Registrationlink.click();
        //This is from requirement
        String expectedMessage = "Signing up is easy!";

        //verify that the Signing up is easy!
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[@id='rightPanel']"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
        //validate actual and expected message
    }
 @Test
 public void verifyUserShouldRegisterAccountSuccessfully() {
     //click on the Registration link
     WebElement Registrationlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
     Registrationlink.click();
     // Enter First Name
     WebElement FirstNameField= driver.findElement(By.id("customer.firstName"));
     //  FirstName Field
     FirstNameField.sendKeys("Swaminarayan");
     FirstNameField.click();
     // Enter Last Name
     WebElement LastNameField= driver.findElement(By.name("customer.lastName"));
     //  LastName Field
     LastNameField.sendKeys("Nilkanth");
     LastNameField.click();
     // field Address
     WebElement EmailField= driver.findElement(By.id("customer.address.street"));
     //  Email address Field
     EmailField.sendKeys("Watford,London");
     EmailField.click();
     //click on city
     WebElement CityNameField= driver.findElement(By.className("input"));
     // CityName Field
     CityNameField.sendKeys("London");
     CityNameField.click();
     //click on StateName
     WebElement StateNameField= driver.findElement(By.id("customer.address.state"));
     // StateNameField Field
     StateNameField.sendKeys("Gujrat");
     StateNameField.click();
     //click on ZipCode
     WebElement ZipCodeField= driver.findElement(By.id("customer.address.zipCode"));
     // ZipCodeField Field
     ZipCodeField.sendKeys("365601");
     ZipCodeField.click();
     //click on PhoneNO
     WebElement PhoneNoField= driver.findElement(By.name("customer.phoneNumber"));
     // PhoneNoField Field
     PhoneNoField.sendKeys("9879651265");
     PhoneNoField.click();
     //click on SSN
     WebElement SSNField= driver.findElement(By.id("customer.ssn"));
     // SSNField Field
     SSNField.sendKeys("123456");
     SSNField.click();
     //click on Username
     WebElement UsernameField= driver.findElement(By.id("customer.username"));
     // UserName Field
     UsernameField.sendKeys("Jalpa");
     UsernameField.click();
     //click on Password
     WebElement PasswordField= driver.findElement(By.xpath("//input[@id='customer.password']"));
     // UserName Field
     PasswordField.sendKeys("Jalpa123");
     PasswordField.click();
     // Click on ConfirmPassword
     WebElement ConfirmPasswordField= driver.findElement(By.xpath("//input[@id='customer.password']"));
     //  ConfirmPassword Field
     ConfirmPasswordField.sendKeys("Jalpa123");
     ConfirmPasswordField.click();
     // Click on REGISTERBUTTOn
     WebElement REGISTERBUTTOnField= driver.findElement(By.xpath("//input[@id='customer.password']"));
     REGISTERBUTTOnField.sendKeys("11111");
     REGISTERBUTTOnField.click();
     //This is from requirement
     String expectedMessage = "Your account was created successfully.you are now logged in";
     // Find your account was created successfully
     WebElement actuleMessageElement = driver.findElement(By.xpath("//div[@id='rightPanel']"));
     String actualMessage = actuleMessageElement.getText();
     // Validate actual and expected message
     Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
 }
    @After
    public void tearDown() {
        closeBrowser();


    }}




