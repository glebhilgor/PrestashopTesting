package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.CreateAccountService;

import static utils.Constants.EXPECTED_TEXT_OF_NAME_OF_MY_ACCOUNT_PAGE;

public class CreateAccountTest extends BaseTest {
    CreateAccountService createAccountService;

    @BeforeClass
    public void setUp() {
        createAccountService= new CreateAccountService();}


    @Test
    public void createAccountTest(){
        createAccountService.createNewAccount();
        String actualTextOfCreateAccount= createAccountService.getTextPageName();
        String expectedTextOfCreateAccount ="Your account has been created.";
        Assert.assertEquals(actualTextOfCreateAccount,expectedTextOfCreateAccount, "The actual text of the page does not match expected!");

    }


}
