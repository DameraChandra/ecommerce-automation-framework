package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

    public static void takeScreenshot(WebDriver driver, String fileName) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File dest = new File("screenshots/" + fileName + ".png");

        try {
            FileUtils.copyFile(src, dest);
            System.out.println("Screenshot saved successfully");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}