package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("starting testng");
	}
	
	//@BeforeTest is used before the test
	@BeforeTest
	public void beforeTest() {
		System.out.println("starting test execution");
	}
	
	//@BeforeClass is used before class
	@BeforeClass
	public void beforeClass() {
		System.out.println("initilized selenium");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("open the browser");
	}
	
	@Test
	public void test1(){
		
		System.out.println("inside test1");
    }
	
	@Test
	public void test2() {
		System.out.println("inside test2");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("destory selenium");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("stop test execution");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("stop testng");
	}
	
	

}
