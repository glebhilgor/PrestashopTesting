package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

@Log4j2
public class CartPage extends BasePage {
    @FindBy(xpath = "//td[@class='cart_description']//*[contains(text(), 'Faded Short Sleeve T-shirts')]")
    private WebElement ItemInTheCart; //  товар в корзине

    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement removeItemButton;

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    private WebElement countOfItemInTheCart;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class='price']//span")
    private WebElement unitPrice;

    @FindBy(xpath = "//td[@id='total_product']")
    private WebElement totalPriceWithTax;

    @FindBy(xpath = "//td[@id='total_price_container']/span")
    private WebElement totalOrderValue;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement textOfThePageAfterClickingOnLogoutButton;

    public String descriptionItemInTheCart() {
        log.info("GetTing the Product description In the Shopping Cart");
        Waiter.waitVisibilityOfElement(driver,ItemInTheCart);
        return ItemInTheCart.getText();
    }

    public String getCountOfItemsInTheCart() {
        log.info("Getting count of items in the cart");
        Waiter.waitVisibilityOfElement(driver,countOfItemInTheCart);
        return countOfItemInTheCart.getText();
    }
    public void clickRemoveButton(){
        log.info("Clicking on the button remove");
        Waiter.waitVisibilityOfElement(driver,removeItemButton);
        removeItemButton.click();}

    public void clickOnLogoutButton() {
        log.info("Clicking on the logout button");
        Waiter.waitVisibilityOfElement(driver,logoutButton);
        logoutButton.click();
    }

    public String getTextOfLoginButton() {
        log.info("Getting text of button");
        Waiter.waitVisibilityOfElement(driver,loginButton);
        return loginButton.getText();
    }

    public String getPriceOfItem() {
        log.info("Getting price of item");
        return unitPrice.getText();
    }

    public String getTotalPriceWithTax() {
        log.info("Getting total price of item with tax");
        return totalPriceWithTax.getText();
    }

    public String getTotalOrderValue() {
        log.info("Getting total order value");
        return totalOrderValue.getText();
    }

    public void clickOnProceedToCheckoutButton() {
        log.info("Clicking on the proceed to checkout button");
        Waiter.waitVisibilityOfElement(driver,proceedToCheckoutButton);
        proceedToCheckoutButton.click();
    }
    public void clickOnLoginButton() {
        log.info("Clicking on login button");
        Waiter.waitVisibilityOfElement(driver,loginButton);
        loginButton.click();
    }

    public String getTextOfThePageAfterClickingOnLogoutButton() {
        log.info("Getting text of the page after clicking on logout button");
        Waiter.waitVisibilityOfElement(driver,textOfThePageAfterClickingOnLogoutButton);
        return textOfThePageAfterClickingOnLogoutButton.getText();
    }

}
