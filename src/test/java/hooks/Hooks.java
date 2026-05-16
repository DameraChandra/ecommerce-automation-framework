package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import factory.DriverFactory;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}