package org.example;

import com.test.constants.FramworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URL;


public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
    }


    @Test
    public void test1()
    {


        driver = new ChromeDriver();
        driver.get(FramworkConstants.getURL());

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
