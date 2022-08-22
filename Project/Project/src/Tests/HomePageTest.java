package Tests;

import org.junit.Test;

import Pages.BasePage;
import Pages.HomePage;
import Pages.SignInPage;

public class HomePageTest extends BaseTest {
    
    public BasePage basePage;
    public HomePage homePage;
    public SignInPage signInPage;

    int numberOfPopularItems = 7;
    int numberOfBestSellersItems = 7;

    @Test
    public void openHomePage() {
        homePage = new HomePage(driver);
        homePage.basePage();
    }


    @Test
    public void verifyNumberOfPopularItems() {
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.scrollDown();
        homePage.verifyNumberOfPopularItems(numberOfPopularItems);
    }

    @Test
    public void verifyNumberOfBestSellersItems() {
        homePage = new HomePage(driver);
        homePage.basePage();
        homePage.scrollDown();
        homePage.switchOnBestSellers();
        homePage.verifyNumberOfBestSellersItems(numberOfBestSellersItems);
    }

    @Test
    public void navigateToSignInPage() {
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        homePage.basePage();
        homePage.scrollDown();
        homePage.signInPageButton();
        signInPage.signInButton();
    }

}