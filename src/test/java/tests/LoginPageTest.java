package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import service.LoginPageService;

import static utils.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class LoginPageTest extends BaseTest {

    LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        LoginPage loginPage = new LoginPage();
    }

    @Test
    public void loginTest() {
        MyAccountPage myAccountPage = loginPageService.login();
        String actualTextOfMainPage = myAccountPage.getTextPageNameAccount();
        Assert.assertEquals(actualTextOfMainPage,EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE, "The actual text of the page does not match expected!");
    }

}
