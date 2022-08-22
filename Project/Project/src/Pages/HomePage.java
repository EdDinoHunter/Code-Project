package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
    
    String baseURL = ("http://automationpractice.com");

    By numberOfPopularItemsBy = By.cssSelector("ul#homefeatured>li");
    By bestSellersButtonBy = By.xpath("//*[@id='home-page-tabs']/li[2]/a");
    By numberOfBestSellersItemsBy = By.cssSelector("ul#blockbestsellers>li");
    By signInPageButtonBy = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");
    By tshirtsButtonBy = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");

    
    public HomePage basePage() {
        driver.get(baseURL);
        return this;
    }

    public HomePage verifyNumberOfPopularItems (int expectedNumberOfItems) {
        int actualNumberOfItems = locateElements(numberOfPopularItemsBy).size();
        assertIntegerEquals(expectedNumberOfItems, actualNumberOfItems);
        return this;
    }

    public HomePage switchOnBestSellers(){
        click(bestSellersButtonBy);
        return this;
    }

    public HomePage verifyNumberOfBestSellersItems (int expectedNumberOfItems) {
        int actualNumberOfItems = locateElements(numberOfBestSellersItemsBy).size();
        assertIntegerEquals(expectedNumberOfItems, actualNumberOfItems);
        return this;
    }

    public HomePage signInPageButton(){
        click(signInPageButtonBy);
        return this;
    }

    public HomePage tshirtsButton(){
        click(tshirtsButtonBy);
        return this;
    }

}