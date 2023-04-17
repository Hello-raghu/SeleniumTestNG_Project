package Day5;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	

	public void onTestStart(ITestResult result)
	{
		    System.out.println("on test started....");
    }
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("on test success....");
    }
	public void onTestFailure(ITestResult result)
	{
		System.out.println("on test Failure....");
    }
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("on test Skipped....");
    }
	public void onFinish(ITestResult context)
	{
		System.out.println("on test Finish....");
    }
	
}
