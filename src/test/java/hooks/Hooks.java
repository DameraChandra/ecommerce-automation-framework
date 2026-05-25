package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {

        System.out.println("Execution Started");

        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();

        System.out.println("Execution Completed");
    }
}