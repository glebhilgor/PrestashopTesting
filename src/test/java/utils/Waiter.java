package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    private Waiter() {
    }

    public static void waitVisibilityOfElement(WebDriver driver, WebElement element) {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitVisibilityOfElementLocated(WebDriver driver, String xpath, String label) {
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(xpath, label))));
    }
}
