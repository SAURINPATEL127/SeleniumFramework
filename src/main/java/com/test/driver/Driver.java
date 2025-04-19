package com.test.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {
    private Driver() {
    }

    public static WebDriver driver;

    public static void setup()
    {
        if(Objects.isNull(driver))
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void tearDown(){
        if(Objects.nonNull(driver))

            driver.quit();
        driver=null;

    }
}
