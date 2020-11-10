package ExtentReportDemo.ScreenShotsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyRepors {

    public static String takescreenshot(WebDriver driver) throws IOException {
        // 1. create a refernce of an Interface  TakesScreenshot
        // assign the driver to it
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. create object file using the method  getScreenshotAs
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

        String imageName="image"+timeStamp+".png";

        // 3. lets convert the object of file into an image (copy object into real image)
        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+imageName));

        return imageName;
    }


    public static ExtentReports initExtentReport()
    {
        // initializing part of the extent report

        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");

        reporter.config().setReportName("All project tests");
        reporter.config().setDocumentTitle("Regression Tests");

        ExtentReports extent  = new ExtentReports();

        extent.attachReporter(reporter);


        extent.setSystemInfo("developers name","amol ujagare");
        extent.setSystemInfo("testers name","priyanka");
        extent.setSystemInfo("project name","billing");
        extent.setSystemInfo("Start Date","05/11/2020");

        return  extent;
    }

}
