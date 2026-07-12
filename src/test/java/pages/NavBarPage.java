package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NavBarPage {
    WebDriver driver;
    WebDriverWait wait;
    String expectedNavAddress = "Top categories";
    By actualNavAddressBy = By.cssSelector("#mz-component-1626147655 > h5:nth-child(1)");
    By componentBy = By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[1]/a/div[2]/span");
    By XButonBy = By.xpath("/html/body/div[1]/div[1]/h5/a");
    By camerasBy = By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[2]/a/div[2]/span");
    By  PhoneTabletsIpodBy= By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[3]/a/div[2]/span");
    By softwareBy = By.xpath("/html/body/div[1]/div[1]/div/div/nav/div/ul/li[4]/a/div[2]/span");

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public String getActualNavAddress(){
        return driver.findElement(actualNavAddressBy).getText();
    }
    public String getExpectedNavAddress() {
        return expectedNavAddress;
    }
    public ComponentPage clickComponents(){
       wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(componentBy))).click();
       return new ComponentPage(driver);
    }
    public void clickXButon(){
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(XButonBy))).click();
    }
    public void clickCameras(){
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(camerasBy))).click();
    }
    public void clickPhoneTabletsIpod(){
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(PhoneTabletsIpodBy))).click();
    }
    public void clickSoftware(){
        wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(softwareBy))).click();
    }

}
