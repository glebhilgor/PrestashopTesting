package service;

import io.qameta.allure.Step;
import pages.CartPage;
import pages.MyAccountPage;
import pages.WomenPage;

public class WomenPageService {
    private WomenPage womenPage = new WomenPage();
    private LoginPageService loginPageService = new LoginPageService();
    private MyAccountPage myAccountPage = new MyAccountPage();
    private CartPage cartPage = new CartPage();

    @Step("Add item to cart")
    public void addItemToCart() {
        loginPageService.login();
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
        womenPage.clickToContinueShoppingButton();
        womenPage.clickToCartButton();
    }
    @Step("Adding item to the cart")
    public void addingItemToCart() {
        myAccountPage.clickPageTitleWomen();
        womenPage.clickToAddToCartButton();
        womenPage .clickToContinueShoppingButton();
        womenPage.clickToCartButton();
    }

    public String getTitleItemInTheCart() {
        return cartPage.descriptionItemInTheCart();
    }


}