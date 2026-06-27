package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager {

    public static ExtentReports extent;

    public static ExtentReports generateReport() {

        // Report File Location
        ExtentSparkReporter spark =
                new ExtentSparkReporter(
                        "reports/ExtentReport.html");

        // Report Title
        spark.config().setReportName(
                "Enterprise QA Automation Report");

        // Document Title
        spark.config().setDocumentTitle(
                "KRAVIX DAY 50 REPORT");

        // Create Extent Report
        extent = new ExtentReports();

        // Attach Reporter
        extent.attachReporter(spark);

        // Add System Information
        extent.setSystemInfo(
                "Tester",
                "Chandrika");

        extent.setSystemInfo(
                "Environment",
                "QA");

        extent.setSystemInfo(
                "Framework",
                "Selenium + API + DB");

        return extent;
    }
}