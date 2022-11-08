package service;


import io.qameta.allure.Step;
import pages.CartPage;

public class CartPageService {private CartPage cartPage = new CartPage();

    @Step("Deleting item from cart")
    public void deleteItemFromCart() {
        cartPage.clickRemoveButton();
    }

    @Step("Getting count of items in the cart")
    public String getCountOfItemsInTheCart() {
        return cartPage.getCountOfItemsInTheCart();
    }

    @Step("Clicking on logout button")
    public void clickOnLogoutButton() {
        cartPage.clickOnLogoutButton();
    }

    @Step("Getting actual price of item in the cart")
    public String getActualPriceOfItemIhTheCart(){
        return cartPage.getPriceOfItem();
    }

    @Step("Getting total price with tax")
    public String getTotalPriceWithTax(){
        return cartPage.getTotalPriceWithTax();
    }

    @Step("Getting total order value")
    public String getTotalOrderValue(){
        return cartPage.getTotalOrderValue();
    }

    @Step("Clicking on proceed to checkout button")
    public void clickOnProceedToCheckoutButton(){
        cartPage.clickOnProceedToCheckoutButton();
    }

    @Step("Logout")
    public void logout(){
        cartPage.clickOnLogoutButton();
        cartPage.clickOnLoginButton();
    }

    @Step("Getting text of the page after clicking on logout button")
    public String gettingTextOfThePageAfterClickingOnLogoutButton(){
        return cartPage.getTextOfThePageAfterClickingOnLogoutButton();
    }
}