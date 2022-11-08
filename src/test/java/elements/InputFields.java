package elements;

import driver.DriverSingleton;
import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InputFields extends BasePage {
    private static final String INPUT_XPATH = "//input[@id='%s']";
    private final String label;

    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), 15);

    public InputFields(String label) {
        this.label = label;
    }

    public void writeText(String text) {
        wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH, label)))).sendKeys(text);
    }
}
