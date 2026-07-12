package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.ComponentPage;
import pages.HomePage;
import pages.NavBarCartBage;
import pages.NavBarPage;

public class Basetest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected NavBarPage navBarPage;
    protected ComponentPage componentPage;
    protected NavBarCartBage navBarCartBage;

    @BeforeClass
    public void setup(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void HomePage(){
        driver.navigate().to("https://ecommerce-playground.lambdatest.io/");
        homePage = new HomePage(driver);
    }

     @AfterClass
    public void teardown(){driver.quit();}
}
