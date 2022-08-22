package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TshirtsPage extends BasePage {

    public TshirtsPage(WebDriver driver) {
        super(driver);
    }

    By tshirtsPageBy = By.className("category-name");
    By addToCartButtonBy = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
    By itemImageBy = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
    By itemInCartBy = By.xpath("//*[@id='layer_cart']/div[1]/div[1]/h2");
    By checkOutButtonBy = By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a");


    public TshirtsPage verifyTshirtsPage(String expectedText) {
        String tshirtsPage = readText(tshirtsPageBy);
        scrollDown();
        assertStringEquals(tshirtsPage, expectedText);
        return this;
    }

    public TshirtsPage addToCart() {
        WebElement element = driver.findElement(itemImageBy);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        click(addToCartButtonBy);
        return this;
    }

    public TshirtsPage verifyItemInCart(String expectedText) {
        String itemInCart = readText(itemInCartBy);
        assertStringEquals(itemInCart, expectedText);
        return this;
    }

    public TshirtsPage navigateToCheckoutPage() {
        click(checkOutButtonBy);
        return this;
    }

}