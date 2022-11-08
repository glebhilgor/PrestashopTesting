package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CartPage;
import service.CartPageService;
import service.MyAccountService;
import service.WomenPageService;

public class ChangeCurrencyPageTest extends BaseTest{

    WomenPageService womenPageService;
    CartPageService cartPageService;
    CartPage cartPage;
    MyAccountService myAccountService;



    @BeforeClass
    public void setUp() {
        womenPageService= new WomenPageService();
        cartPageService= new CartPageService();
        cartPage= new CartPage();
        myAccountService=new MyAccountService();

    }


    @Test
    public void changeTheCurrencyOnTheWebsiteTest(){
        myAccountService.changeTheCurrencyOnTheWebsite();
        String actualCurrencyName= myAccountService.getTitleCurrencyOnTheSite();
        String expectedCurrencyName= "EUR";
        Assert.assertEquals(actualCurrencyName,expectedCurrencyName,"The Currency on the page is incorrect");

    }
}

