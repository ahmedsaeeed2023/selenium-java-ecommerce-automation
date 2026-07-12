package tests;

import baseTest.Basetest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class navBarTest extends Basetest {

    @Test
    public void navBarSubCategory(){
        navBarPage=homePage.clickShopByCategory();
        Assert.assertEquals(navBarPage.getExpectedNavAddress(),navBarPage.getActualNavAddress());
        navBarPage.clickXButon();
        homePage.clickShopByCategory();
        navBarPage.clickComponents();
        driver.navigate().back();
        homePage.clickShopByCategory();
        navBarPage.clickCameras();
        driver.navigate().back();
        homePage.clickShopByCategory();
        navBarPage.clickPhoneTabletsIpod();
        driver.navigate().back();
        homePage.clickShopByCategory();
        navBarPage.clickSoftware();
        driver.navigate().back();
    }

}
