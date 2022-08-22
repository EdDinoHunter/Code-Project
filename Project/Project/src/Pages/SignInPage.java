package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
    
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    By authenticationBy = By.className("navigation_page");
    By emailAddressBy = By.xpath("//*[@id='email']");
    By passwordBy = By.xpath("//*[@id='passwd']");
    By signInButtonBy = By.id("SubmitLogin");
    By signOutButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a");


    public SignInPage verifySignInPage (String expectedText) {
        assertElementVisible(authenticationBy);
        return this;
    }
    
    public SignInPage enterEmail(String emailText) {
        writeText(emailAddressBy, emailText);
        return this;
    }

    public SignInPage enterPassword(String passwordText) {
        writeText(passwordBy, passwordText);
        return this;
    }

    public SignInPage signInButton() {
        click(signInButtonBy);
        return this;
    }

}