package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    public WebDriver driver;
    public WebDriverWait wait;


    public BasePage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void waitVisibility (By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }
    
    public void click(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
        driver.findElement(elementBy).click();
    }
    
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    
    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    
    public void assertStringEquals (String signOut, String expectedText) {
        Assert.assertEquals(signOut, expectedText);
    }

    public void assertIntegerEquals (int expectedNumberOfItems, int actualNumberOfItems) {
        Assert.assertEquals(expectedNumberOfItems, actualNumberOfItems);
    }

    public void assertElementVisible (By elementBy) {
        boolean isVisible = driver.findElement(elementBy).isDisplayed();
        Assert.assertTrue(isVisible);
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
    }

    public List<WebElement>locateElements(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElements(elementBy);
    }

    public int countItems(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElements(elementBy).size();
    }

    public double convertStringToDouble(String string) {
        return Double.parseDouble(string.substring(1));
    }
    

    public void doubleCompare (double expected, double actual, double delta, int i) {
        Assert.assertEquals(expected, actual, delta);
    }

}