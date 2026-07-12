package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComponentPage {
    WebDriver driver;
    WebDriverWait wait;
    String expectedComponentsURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25";
    String expectedHomeURL = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";
    String expectedCompareURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/compare";
    String expectedWishlistURL = "https://ecommerce-playground.lambdatest.io/index.php?route=account/login";

    String expectedMiceTrackballsURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_29";
    String expectedMonitorsURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_28";
    String expectedPrintersURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_30";
    String expectedScannersURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_31";
    String expectedWebCamerasURL = "https://ecommerce-playground.lambdatest.io/index.php?route=product/category&path=25_32";

    By lambdaTestLogoBy = By.xpath("/html/body/div[1]/div[6]/header/div[2]/div[1]/div[1]/figure/a/img");
    By compareLogoBy = By.cssSelector("#entry_217823 > a:nth-child(1) > span:nth-child(1) > svg:nth-child(1)");
    By wishlistLogoBy = By.cssSelector("#entry_217824 > a:nth-child(1) > span:nth-child(1) > svg:nth-child(1)");
    By cartLogoBy = By.cssSelector("#entry_217825 > a:nth-child(1) > div:nth-child(1) > div:nth-child(1) > svg:nth-child(1)");
    By homeLogoBy = By.cssSelector(".fa.fa-home");
    By filterIconBy = By.cssSelector(".fa-chevron-circle-down");
    By mice_trackballsBy = By.cssSelector("a.mb-2:nth-child(1) > figure:nth-child(1) > figcaption:nth-child(2)");
    By monitorsBy = By.cssSelector("a.mb-2:nth-child(2) > figure:nth-child(1) > figcaption:nth-child(2)");
    By printersBy = By.cssSelector("a.mb-2:nth-child(3) > figure:nth-child(1) > figcaption:nth-child(2)");
    By scannersBy = By.cssSelector("a.mb-2:nth-child(4) > figure:nth-child(1) > figcaption:nth-child(2)");
    By webCamerasBy = By.cssSelector("a.mb-2:nth-child(5) > figure:nth-child(1) > figcaption:nth-child(2)");

    By manufacturerAppleBy = By.cssSelector("div.both:nth-child(1) > div:nth-child(1) > label:nth-child(2)");
    By subCategoryMonitorsBy = By.cssSelector("#mz-filter-panel-0-2 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > label:nth-child(2)");

    public ComponentPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void clickLambdaTestLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(lambdaTestLogoBy))).click();
    }
    public void clickCompareLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(compareLogoBy))).click();
    }
    public void clickWishlistLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(wishlistLogoBy))).click();
    }
    public NavBarCartBage clickCartLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(cartLogoBy))).click();
        return new NavBarCartBage(driver);
    }
    public void clickHomeLogo(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(homeLogoBy))).click();
    }
    public void clickMiceTrackballs(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(mice_trackballsBy))).click();
    }
    public void clickMonitors(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(monitorsBy))).click();
    }
    public void clickFilterIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(filterIconBy))).click();
    }
    public void clickPrinters(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(printersBy))).click();
    }
    public void clickScanners(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(scannersBy))).click();
    }
    public void clickWebCameras(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(webCamerasBy))).click();
    }

    public String getExpectedComponentsURL() {
        return expectedComponentsURL;
    }

    public String getExpectedHomeURL() {
        return expectedHomeURL;
    }

    public String getExpectedCompareURL() {
        return expectedCompareURL;
    }

    public String getExpectedWishlistURL() {
        return expectedWishlistURL;
    }

    public String getExpectedMiceTrackballsURL() {
        return expectedMiceTrackballsURL;
    }

    public String getExpectedMonitorsURL() {
        return expectedMonitorsURL;
    }

    public String getExpectedPrintersURL() {
        return expectedPrintersURL;
    }

    public String getExpectedScannersURL() {
        return expectedScannersURL;
    }

    public String getExpectedWebCamerasURL() {
        return expectedWebCamerasURL;
    }

    public boolean isFilterIconSelected(){
        return wait.until(ExpectedConditions.elementToBeClickable(filterIconBy)).isSelected();
    }

    public void clickManufacturerApple(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(manufacturerAppleBy))).click();
    }
    public boolean isManufacturerAppleSelected(){
        return wait.until(ExpectedConditions.elementToBeClickable(manufacturerAppleBy)).isSelected();
    }
    public void clickSubCategoryMonitors(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(subCategoryMonitorsBy))).click();
    }
    public boolean isSubCategoryMonitorsSelected(){
        return driver.findElement(subCategoryMonitorsBy).isSelected();
    }
}
