package Listeners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class Listener extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test case passed");
		
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("test case failed");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("test case skipped");
	}
	
	public void onStart(ITestContext testContext) {
		System.out.println("test case started");
	}
	
	public void onFinish(ITestContext testContext) {
		System.out.println("test case ended");
	}

}
