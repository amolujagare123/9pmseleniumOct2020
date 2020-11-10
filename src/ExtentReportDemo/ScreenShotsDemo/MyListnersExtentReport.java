package ExtentReportDemo.ScreenShotsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ExtentReportDemo.ScreenShotsDemo.MyRepors.initExtentReport;
import static ExtentReportDemo.ScreenShotsDemo.MyRepors.takescreenshot;

public class MyListnersExtentReport extends BeforeAfterTestMethod implements ITestListener {

    static ExtentReports extent = initExtentReport();

    ExtentTest test;

    public void onTestStart(ITestResult result) {

        System.out.println("onTestStart");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {

        System.out.println("onTestSuccess");

        test.pass(result.getMethod().getMethodName()+" : test is passed");
    }

    public void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure");

        test.fail(result.getThrowable());

        try {
            test.addScreenCaptureFromPath("./screenshots/"+takescreenshot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void onStart(ITestContext context) {

        System.out.println("onStart");
    }

    public void onFinish(ITestContext context) {

        System.out.println("onFinish");

        extent.flush();
    }
}
