package tests;

import baseTest.Basetest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComponentTests extends Basetest {

    @Test
    public void validateLinks(){
        navBarPage=homePage.clickShopByCategory();
        componentPage=navBarPage.clickComponents();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedComponentsURL());

        componentPage.clickLambdaTestLogo();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedHomeURL());
        driver.navigate().back();

        componentPage.clickCompareLogo();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedCompareURL());
        driver.navigate().back();

        componentPage.clickWishlistLogo();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedWishlistURL());
        driver.navigate().back();

        navBarCartBage =componentPage.clickCartLogo();
        Assert.assertEquals(navBarCartBage.getActualCartText(),navBarCartBage.getExpectedCartText());
        navBarCartBage.clickXButton();

        componentPage.clickHomeLogo();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedHomeURL());
        driver.navigate().back();

        componentPage.clickMiceTrackballs();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedMiceTrackballsURL());
        driver.navigate().back();

        componentPage.clickPrinters();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedPrintersURL());
        driver.navigate().back();

        componentPage.clickMonitors();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedMonitorsURL());
        driver.navigate().back();

        componentPage.clickScanners();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedScannersURL());
        driver.navigate().back();

        componentPage.clickWebCameras();
        Assert.assertEquals(driver.getCurrentUrl(),componentPage.getExpectedWebCamerasURL());
        driver.navigate().back();

    }

}
