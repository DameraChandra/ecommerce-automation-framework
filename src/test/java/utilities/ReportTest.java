package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.Test;

public class ReportTest {

    @Test
    public void createReport() {

        // Create Report
        ExtentReports extent =
                ReportManager.generateReport();

        // Create Test Entry
        ExtentTest test1 =
                extent.createTest("Login Test");

        test1.pass("Login Successful");

        // Create Another Test
        ExtentTest test2 =
                extent.createTest("API Test");

        test2.pass("Products API Working");

        // Create Another Test
        ExtentTest test3 =
                extent.createTest("Database Test");

        test3.pass("Database Validation Successful");

        // Save Report
        extent.flush();

        System.out.println(
                "Extent Report Generated Successfully");
    }
}