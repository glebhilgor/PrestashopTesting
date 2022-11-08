package service;

import io.qameta.allure.Step;
import pages.CheckoutOrderPage;

public class CheckoutOrderPageService {
    private WomenPageService womenPageService = new WomenPageService();
    private AddressPageService addressPageService = new AddressPageService();
    private CartPageService cartPageService = new CartPageService();
    private CheckoutOrderPage checkoutOrderPage = new CheckoutOrderPage();

    @Step("Making order")
    public void ordering() {
        addressPageService.createYourAddress();
        womenPageService.addingItemToCart();
        cartPageService.clickOnProceedToCheckoutButton();
        checkoutOrderPage.clickOnProceedToCheckoutButton();
        checkoutOrderPage.choosingTheTypeOfDelivery();
        checkoutOrderPage.clickOnProceedToCheckoutButtonAfterAgreementOfTermsOfServices();
        checkoutOrderPage.clickOnBankTransferButton();
        checkoutOrderPage.clickOnOrderConfirmationButton();
    }

    @Step("Getting text of order4 confirmation message")
    public String getTextOfOrderConfirmationMessage() {
        return checkoutOrderPage.getTextOfOrderConfirmationMessage();
    }

    @Step("Deleting address")
    public void deleteAddress() {
        addressPageService.deleteAddress();
    }
}