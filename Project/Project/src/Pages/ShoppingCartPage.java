package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    By shoppingCartBy = By.xpath("//*[@id='columns']/div[1]/span[2]");
    By totalProductsBy = By.xpath("//*[@id='total_product']");
    By totalShippingBy = By.xpath("//*[@id='total_shipping']");
    By totalBy = By.xpath("//*[@id='total_price_without_tax']");
    By taxBy = By.xpath("//*[@id='total_tax']");
    By totalPlusTaxBy = By.xpath("//*[@id='total_price']");


    public ShoppingCartPage verifyShoppingCartPage(String expectedText) {
        String shoppingCart = readText(shoppingCartBy);
        scrollDown();
        assertStringEquals(shoppingCart, expectedText);
        return this;
    }

    public ShoppingCartPage compareTotalProductsPrice(double expected) {
        String totalProductsPrice = readText(totalProductsBy);
        double actual = convertStringToDouble(totalProductsPrice);
        doubleCompare(expected, actual, 0,1 );
        return this;
    }

    public ShoppingCartPage compareShippingPrice(double expected) {
        String totalShippingPrice = readText(totalShippingBy);
        double actual = convertStringToDouble(totalShippingPrice);
        doubleCompare(expected, actual, 0,1);
        return this;
    }

    public ShoppingCartPage compareTotalPrice(double expected) {
        String totalPrice = readText(totalBy);
        double actual = convertStringToDouble(totalPrice);
        doubleCompare(expected, actual, 0,1);
        return this;
    }

    public ShoppingCartPage compareTaxPrice(double expected) {
        String taxPrice = readText(taxBy);
        double actual = convertStringToDouble(taxPrice);
        doubleCompare(expected, actual, 0,1);
        return this;
    }

    public ShoppingCartPage compareTotalPlusTaxPrice(double expected) {
        String totalPlusTaxPrice = readText(totalPlusTaxBy);
        double actual = convertStringToDouble(totalPlusTaxPrice);
        doubleCompare(expected, actual, 0,1);
        return this;
    }

}