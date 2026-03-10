package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        String testName = result.getName();

        System.out.println("Test Passed: " + testName);

        ScreenshotUtil.takeScreenshot(driver, testName + "_PASS");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName();

        System.out.println("Test Failed: " + testName);

        ScreenshotUtil.takeScreenshot(driver, testName + "_FAIL");
    }
}