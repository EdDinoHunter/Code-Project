package Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.BasePage;
import Pages.HomePage;

public class BaseTest {

    public BasePage basePage;
    public HomePage homePage;
    
    public WebDriver driver;
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    
    @Before 
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Olija\\Desktop\\Project\\Project\\lib\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }

}