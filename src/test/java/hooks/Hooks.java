package hooks;

import factory.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.initDriver();  // ✅ FIXED (no parameter)
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}