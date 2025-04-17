package org.example;

import com.test.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.Objects;

public class BaseTest {

    protected BaseTest() {
    }

    @BeforeMethod
    public static void driverInitialise(){
        Driver.setup();
    }

    @AfterMethod
    public static void driverFlush(){
        Driver.tearDown();
    }
}
