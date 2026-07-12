package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WebDriver driver;

//    @BeforeClass

            driver= new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://ecommerce-playground.lambdatest.io/");

    }
}