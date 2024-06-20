package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ListenersNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		//System.out.println("New Test Started " + result.getName());
		
		 ExtentManager.createTest(result.getMethod().getMethodName(), "Performing " + result.getMethod().getMethodName());
	        String currentUrl = BaseClass.getDriver().getCurrentUrl();

	  	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("on Test Success method " + result.getName());
		ExtentManager.getTest().pass("Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
//		commonMethods.takeScreenShot();
//		System.out.println("on Test failure method " + result.getName());
		ExtentManager.getTest().fail("Test Failed");
		
		try {
			ExtentManager.getTest().info("Screenshot of a failure page").fail(MediaEntityBuilder.createScreenCaptureFromBase64String(commonMethods.takeScreenShot64(), "Screenshot of a failure page").build());
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//System.out.println("onTestSkipped " + result.getName());
		ExtentManager.getTest().skip("Test Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
	//	System.out.println("onFinish " + context.getName());
		ExtentManager.flushReports();

	}

}
