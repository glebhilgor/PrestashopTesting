package pages;


import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

@Log4j2

public class CheckoutOrderPage extends BasePage {

    @FindBy(xpath = "//button[@name='processAddress']")
    private WebElement proceedCheckoutButton;

    @FindBy(xpath = "//div[@class='checker']")
    private WebElement consentCheckbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//p[@class='payment_module']")
    private WebElement choosingPaymentMethodButton;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    private WebElement orderConfirmationButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement orderConfirmationMessage;

    public void clickOnProceedToCheckoutButton() {
        log.info("Clicking on the proceed to checkout button");
        Waiter.waitVisibilityOfElement(driver,proceedCheckoutButton);
        proceedCheckoutButton.click();
    }

    public void choosingTheTypeOfDelivery() {
        log.info("Choosing the type of delivery");
        Waiter.waitVisibilityOfElement(driver,consentCheckbox);
        consentCheckbox.click();

    }

    public void clickOnProceedToCheckoutButtonAfterAgreementOfTermsOfServices() {
        log.info("Clicking on the proceed to checkout button after agreement of terms of delivery");
        Waiter.waitVisibilityOfElement(driver,proceedToCheckoutButton);
        proceedToCheckoutButton.click();
    }

    public void clickOnBankTransferButton() {
        log.info("Choosing a bank transfer payment");
        Waiter.waitVisibilityOfElement(driver,choosingPaymentMethodButton);
        choosingPaymentMethodButton.click();
    }

    public void clickOnOrderConfirmationButton() {
        log.info("Clicking on the order confirmation button");
        Waiter.waitVisibilityOfElement(driver,orderConfirmationButton);
        orderConfirmationButton.click();
    }

    public String getTextOfOrderConfirmationMessage() {
        log.info("Getting a text of order confirmation message");
        Waiter.waitVisibilityOfElement(driver,orderConfirmationMessage);
        return orderConfirmationMessage.getText();
    }


}
