package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");
    By myAccountBy = By.xpath("//*[@id='center_column']/h1");
    By signInButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");

    
    public MyAccountPage verifySignIn (String expectedText) {
        String signOut = readText(signOutButtonBy);
        assertStringEquals(signOut, expectedText);
        return this;
    }

    public MyAccountPage verifyValidAccount (String expectedText) {
        String myAccount = readText(myAccountBy);
        assertStringEquals(myAccount, expectedText);
        return this;
    }

    public MyAccountPage signOut() {
        click(signOutButtonBy);
        return this;
    }

    public MyAccountPage verifySignOut (String expectedText) {
        String signIn = readText(signInButtonBy);
        assertStringEquals(signIn, expectedText);
        return this;
    }

}