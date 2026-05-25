package base;

import factory.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.initDriver();   // ✅ NO PARAMETER
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}