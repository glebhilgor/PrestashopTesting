package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driver.DriverSingleton;

public class CreateAccountPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 15);

    @FindBy(xpath = "//input[@id='id_gender2']") //гр-н или г-жа
    private WebElement title;

    @FindBy(xpath = "//input[@id='customer_firstname']")// имя
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordCreate;


    @FindBy(xpath = "//span[contains(text(), 'Register')]")
    private WebElement registerButton;

    public void clickTitle() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(title));
        title.click();
    }

    public CreateAccountPage fillInFirstName(String firstNameString) {
        firstName.clear();
        firstName.sendKeys(firstNameString);
        return this;
    }

    public CreateAccountPage fillInLastName(String lastNameString) {
        lastName.clear();
        lastName.sendKeys(lastNameString);
        return this;
    }

    public CreateAccountPage fillInPassword(String passwordString) {
        passwordCreate.clear();
        passwordCreate.sendKeys(passwordString);
        return this;
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

}