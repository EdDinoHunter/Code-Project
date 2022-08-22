package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.TshirtsPage;

public class TshirtsPageTest extends BaseTest {
     
    public HomePage homePage;
    public TshirtsPage tshirtsPage;

    String tshirts = "T-shirts";
    String itemInCart = "Product successfully added to your shopping cart";

    @Test
    public void itemInCartTest() {

        homePage = new HomePage(driver);
        tshirtsPage = new TshirtsPage(driver);

        homePage.basePage();
        homePage.tshirtsButton();
        tshirtsPage.verifyTshirtsPage(tshirts);
        tshirtsPage.addToCart();
        tshirtsPage.verifyItemInCart(itemInCart);
    }
    
}