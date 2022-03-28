package extentListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnerTestNG implements ITestListener{
	ExtentReports extent=ExtentReporterNG.extentReportGenerator();
	ExtentTest test;	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 test = extent.createTest(result.getMethod().getMethodName());		
	}
@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
//		try {
//			test.addScreenCaptureFromPath(TakeScreenShot.captureScreenShot(driver, result.getMethod().getMethodName()), "Screenshot attached");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
@Override
	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
	}
@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "pass");
	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();	
	}
@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
