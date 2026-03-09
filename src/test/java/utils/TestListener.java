package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        String testName = result.getName();

        System.out.println("Test Failed: " + testName);

        ScreenshotUtil.takeScreenshot(driver, testName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Test Passed: " + result.getName());
    }

}