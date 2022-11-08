package service;

import org.openqa.selenium.WebDriver;

import pages.CreateAccountPage;
import pages.LoginPage;

import static utils.Constants.*;

public class CreateAccountService {

    CreateAccountPage createAccountPage = new CreateAccountPage();
    LoginPageService loginPageService = new LoginPageService();
    LoginPage loginPage = new LoginPage();
    WebDriver driver;


    public void createNewAccount () {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillEmailCreate(EMAIL_CREATE)
                .clickCreateAnAccountButton(); // нужно ожидание
        createAccountPage.clickTitle();
        createAccountPage.fillInFirstName(FIRST_NAME);
        createAccountPage.fillInLastName(LAST_NAME);
        createAccountPage.fillInPassword(PASSWORD_CREATE);
        createAccountPage.clickRegisterButton();
    }

    public String getTextPageName () {
        return loginPage.getTextMessageAboutCreating();


    }

}
