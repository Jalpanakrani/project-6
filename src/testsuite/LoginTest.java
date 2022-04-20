package testsuite;

import browserfactory.BaseTest;
import javafx.scene.control.PasswordField;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl ="https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void setup(){
        openBrowser(baseUrl);}

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials() {
        //Enter tha valid Username
        WebElement ValidUsernameField = driver.findElement(By.id("customer.username"));
        // valid Usename Field
        ValidUsernameField.sendKeys("Jalpa");
        ValidUsernameField.click();
        //Enter valid Password
        WebElement ValidPasswordField = driver.findElement(By.xpath("//input[@id='customer.password']"));
        // validUserName Field
        ValidPasswordField.sendKeys("Jalpa123");
        ValidPasswordField.click();

        // Click on LOGINButton
        WebElement LOGINButtOnField = driver.findElement(By.xpath("//input[@id='customer.password']"));
        LOGINButtOnField.sendKeys("11111");
        LOGINButtOnField.click();
        //This is from requirement
        String expectedMessage = "Accounts Overview";
        // Find your account was created successfully
        WebElement actuleMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]"));
        String actualMessage = actuleMessageElement.getText();
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
        @Test
        public void VarifyTheErrorMessage() {
            //Enter tha valid Username
            WebElement InValidUsernameField = driver.findElement(By.id("customer.username"));
            // Invalid Usename Field
            InValidUsernameField.sendKeys("Jalpaa");
            InValidUsernameField.click();
            //Enter valid Password
            WebElement InValidPasswordField = driver.findElement(By.xpath("//input[@id='customer.password']"));
            // validUserName Field
            InValidPasswordField.sendKeys("Jalpaaa");
            InValidPasswordField.click();

            // Click on LOGINButton
            WebElement LoginButtOnField = driver.findElement(By.xpath("//input[@id='customer.password']"));
            LoginButtOnField.sendKeys("11111");
            LoginButtOnField.click();
        }
            @Test
            public void UserShouldLogOutSuccessfully() {
                //Enter tha valid Username
                WebElement ValidUsernameField1= driver.findElement(By.id("customer.username"));
                // valid Usename Field
                ValidUsernameField1.sendKeys("Jalpa");
                ValidUsernameField1.click();
                //Enter valid Password
                WebElement ValidPasswordField1= driver.findElement(By.xpath("//input[@id='customer.password']"));
                // validUserName Field
                ValidPasswordField1.sendKeys("Jalpa123");
                ValidPasswordField1.click();

                // Click on LOGINButton
                WebElement LOGINButtOnField1= driver.findElement(By.xpath("//input[@id='customer.password']"));
                LOGINButtOnField1.sendKeys("11111");
                LOGINButtOnField1.click();

                // Click on LOGOut link
                WebElement LogOut= driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));

                //This is from requirement
                String expectedMessage1 = "Customer Login";
                // Find your account was created successfully

                // Validate actual and expected message
                // The username and Password could not be verified
                WebElement actualMessage =  driver.findElement(By.xpath("//div[@id='rightPanel']"));
                actualMessage.sendKeys("username and password could not be verified");
                actualMessage.getText();

                // Validate actual and expected message
                WebElement expectedMessage =  driver.findElement(By.xpath("//div[@id='rightPanel']"));
                expectedMessage.sendKeys("username and password could be verified");
                expectedMessage.getText();

                Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
            }
    @After
    public void tearDown() {
                closeBrowser();
            }}

