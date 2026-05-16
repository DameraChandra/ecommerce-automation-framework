package utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {

        System.out.println("Execution Started");
    }

    @Override
    public void onFinish(ITestContext context) {

        System.out.println("Execution Finished");
    }

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("STARTED : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("PASSED : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("FAILED : " + result.getName());

        try {

            ScreenshotUtils.capture(result.getName());

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}