package org.example;

import com.test.constants.FramworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class LoginTest extends BaseTest {

    WebDriver driver;

    @Test
    public void test1()
    {

        driver = new ChromeDriver();
        driver.get(FramworkConstants.getURL());

    }

}
