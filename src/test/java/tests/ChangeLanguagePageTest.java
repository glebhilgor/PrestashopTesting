package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CartPage;
import service.CartPageService;
import service.MyAccountService;
import service.WomenPageService;

public class ChangeLanguagePageTest extends BaseTest {


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
    public void changeTheLanguageOnTheWebsiteTest(){
        myAccountService.changeTheLanguageOnTheWebsite();
        String actualLanguageName= myAccountService.getTextLanguageOnTheSite();
        String expectedLanguageName= "Русский";
        Assert.assertEquals(actualLanguageName,expectedLanguageName,"The language on the page is incorrect");

    }
}