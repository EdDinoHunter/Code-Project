package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.SignInPage;

public class SignInPageTest extends BaseTest {

    public HomePage homePage;
    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    String email = "dino666@gmail.com";
    String password = "666999";
    String signOutButton = "Sign out";

    @Test
    public void signIn() {

        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.basePage();
        homePage.signInPageButton();
        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        myAccountPage.verifySignIn(signOutButton);
    }
    
}