package tests;

import org.aspectj.lang.annotation.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CheckoutOrderPageService;


public class CheckoutOrderPageTest extends BaseTest {

    private CheckoutOrderPageService checkoutOrderPadeService;

    @BeforeClass
    public void setUp() {
        checkoutOrderPadeService = new CheckoutOrderPageService();
    }

    @Test
    public void checkoutOrderTest() {
        checkoutOrderPadeService.ordering();
        String actualMessageOfCheckoutPage = checkoutOrderPadeService.getTextOfOrderConfirmationMessage();
        String expectedMessageOfCheckoutPage = "ORDER CONFIRMATION";
        Assert.assertEquals(actualMessageOfCheckoutPage,expectedMessageOfCheckoutPage,"The actual text of checkout page does not match expected!");
    }
}