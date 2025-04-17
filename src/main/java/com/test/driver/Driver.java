package com.test.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Driver {

    public static WebDriver driver;

    public static void setup()
    {
        WebDriverManager.chromedriver().setup();
    }

    public static void tearDown(){
        if(!Objects.isNull(driver))
        driver.quit();
    }
}
