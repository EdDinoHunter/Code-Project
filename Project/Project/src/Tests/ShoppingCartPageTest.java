package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.ShoppingCartPage;
import Pages.TshirtsPage;

public class ShoppingCartPageTest extends BaseTest {

    public HomePage homePage;
    public TshirtsPage tshirtsPage;
    public ShoppingCartPage shoppingCartPage;

    String tshirtsPageText = "T-shirts";
    String productInCart = "Product successfully added to your shopping cart";
    String shoppingCart = "Your shopping cart";
    double totalProducts = 16.51;
    double totalShipping = 2.00;
    double total = totalProducts + totalShipping;
    double tax = 0.00;
    double totalPlusTax = 18.51;

    @Test
    public void shoppingCartTest() {

        homePage = new HomePage(driver);
        tshirtsPage = new TshirtsPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);

        homePage.basePage();
        homePage.tshirtsButton();
        homePage.scrollDown();
        tshirtsPage.verifyTshirtsPage(tshirtsPageText);
        tshirtsPage.addToCart();
        tshirtsPage.verifyItemInCart(productInCart);
        tshirtsPage.navigateToCheckoutPage();
        shoppingCartPage.verifyShoppingCartPage(shoppingCart);
        shoppingCartPage.compareTotalProductsPrice(totalProducts);
        shoppingCartPage.compareShippingPrice(totalShipping);
        shoppingCartPage.compareTotalPrice(total);
        shoppingCartPage.compareTaxPrice(tax);
        shoppingCartPage.compareTotalPlusTaxPrice(totalPlusTax);
    }
    
}