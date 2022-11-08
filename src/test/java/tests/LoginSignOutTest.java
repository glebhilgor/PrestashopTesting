package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyAccountPage;
import service.LoginPageService;

import static utils.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class LoginSignOutTest extends BaseTest {
    LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        LoginPage loginPage = new LoginPage();
    }

    @Test
    public void loginSignOutTest() {
        LoginPage loginPage=loginPageService.signOut();
        String actualTextOfAuthenticationPage = loginPage.getTextAuthenticationPage();
        String expectedTextOfAuthenticationPage= "AUTHENTICATION";
        Assert.assertEquals(actualTextOfAuthenticationPage,expectedTextOfAuthenticationPage, "The actual text of the page does not match expected!");
    }


}
