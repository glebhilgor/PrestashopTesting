package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverSingleton;

@Log4j2
public class LoginPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 20);

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//i[@class='icon-lock left']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailCreate;

    @FindBy(xpath = "//i[@class='icon-user left']")
    private WebElement createAccountButton;


    @FindBy(xpath = "//h1[contains(text(), 'Authentication')]")
    private WebElement nameAuthenticationPage;

    @FindBy(xpath = "//li[contains(text(), 'Invalid email address.')]")
    private WebElement invalidEmailMessage;

    @FindBy(xpath = "//p[contains(text(), 'Your account has been created.')]")
    private WebElement messageAboutCreatingAccount;

    @FindBy(xpath = "//li[contains(text(), 'Invalid password.')]")
    private WebElement messageInvalidPassword;

    public String getTextMessageAboutCreating() {
        return messageAboutCreatingAccount.getText();
    }

    public LoginPage openPage(String url) {
        log.info("Opening page by URL");
        driver.get(url);
        return this;
    }


    public LoginPage fillInEmailAddress(String addressEmail) {
        log.info("Entering email address");
        emailAddress.clear();
        emailAddress.sendKeys(addressEmail);
        return this;
    }

    public LoginPage fillInPassword(String keyPassword) {
        log.info("Entering  password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clickSignInButton() {
        log.info("Clicking the sing in button");
        signInButton.click();
    }

    public LoginPage fillEmailCreate(String createEmail) {
        log.info("Entering email address to create");
        emailCreate.clear();
        emailCreate.sendKeys(createEmail);
        return this;
    }

    public void clickCreateAnAccountButton() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(password));
        log.info("Clicking the button create");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(createAccountButton));
        createAccountButton.click();
    }


    public String getTextAuthenticationPage() {
        log.info("Getting name AuthenticationPage");
        return nameAuthenticationPage.getText();

    }


    public String getTextInvalidEmailMessage() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(invalidEmailMessage));
        log.info("Getting message invalid email");
        return invalidEmailMessage.getText();

    }

    public String getTextOfNameInvalidPassword() {
        log.info("Getting message Invalid password");
        return messageInvalidPassword.getText();
    }

}