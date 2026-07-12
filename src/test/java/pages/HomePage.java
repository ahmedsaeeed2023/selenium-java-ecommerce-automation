package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    By shopByCategoryBy = By.xpath("/html/body/div[1]/div[5]/header/div[3]/div[1]/div/div[1]/a");
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public NavBarPage clickShopByCategory(){
       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(shopByCategoryBy))).click();
        return new NavBarPage(driver);
    }

}
