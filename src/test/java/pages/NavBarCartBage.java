package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavBarCartBage {
    WebDriver driver;
    WebDriverWait wait;
    String expectedCartText = "Cart";
    By actualCartTextBy=By.cssSelector(".bg-secondary");
    By xButtonby = By.cssSelector(".bg-secondary > a:nth-child(1)");
    By editCartButtonBy = By.cssSelector("a.btn-primary:nth-child(1)");
    By checkOutButtonBy = By.cssSelector(".btn-secondary");


    public NavBarCartBage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public String getExpectedCartText() {
        return expectedCartText;
    }

    public String getActualCartText() {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(actualCartTextBy))).getText();
    }

    public ComponentPage clickXButton(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(xButtonby))).click();
        return new ComponentPage(driver);
    }
    public void clickEditCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(editCartButtonBy))).click();
    }
    public void clickCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(checkOutButtonBy))).click();
    }
}
