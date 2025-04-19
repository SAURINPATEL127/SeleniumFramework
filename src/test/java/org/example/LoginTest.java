package org.example;

import com.test.constants.FramworkConstants;
import com.test.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class LoginTest extends BaseTest{


    @Test
    public void send()
    {
        Driver.driver.get(FramworkConstants.getURL());
    }

}
