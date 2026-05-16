package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import tests.BaseTest;

public class ScreenshotUtils {

    public static void capture(String fileName) throws IOException {

        File src = ((TakesScreenshot) BaseTest.driver)
                .getScreenshotAs(OutputType.FILE);

        File dest = new File(
                System.getProperty("user.dir")
                        + "/screenshots/"
                        + fileName
                        + ".png");

        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot Saved Successfully");
    }
}