package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CartPageService;
import service.WomenPageService;

public class CartPageTest extends BaseTest {

    private WomenPageService womenPageService;
    private CartPageService cartPageService;

    @BeforeClass
    public void setUp() {
        womenPageService = new WomenPageService();
        cartPageService = new CartPageService();
    }

    @Test
    public void addItemToCartTest() {
        womenPageService.addItemToCart();
        String actualNameOfItemItTheCart = womenPageService.getTitleItemInTheCart();
        cartPageService.clickOnLogoutButton();
        String expectedNameOfItemItTheCart = "Faded Short Sleeve T-shirts";
        Assert.assertTrue(actualNameOfItemItTheCart.contains(expectedNameOfItemItTheCart), "The actual name of item in the cart does not match expected!");
    }

    @Test
    public void deleteItemFromCartTest() {
        womenPageService.addItemToCart();
        cartPageService.deleteItemFromCart();
        String actualCountOfItemsInTheCart = cartPageService.getCountOfItemsInTheCart();
        String expectedCountOfItemsInTheCart = "2 product";
        Assert.assertEquals(actualCountOfItemsInTheCart, expectedCountOfItemsInTheCart, "The actual count of item in the cart does not match expected!");
    }
}

