package ConfigurationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningConfigurationAnnotations {

	@BeforeSuite
	public void demo() {
		Reporter.log(" demo i executed before suite", true);
	}

	@BeforeTest
	public void demo1() {
		Reporter.log("demo1 i executed before test", true);
	}

	@BeforeClass
	public void demo2() {
		Reporter.log("demo2 i executed before class", true);
	}

	@BeforeMethod
	public void demo3() {
		Reporter.log("demo3 i executed before method", true);
	}

	@Test
	public void name() {
		Reporter.log("i am vijay",true);
	}
	
	@Test
	public void yourname() {
		Reporter.log(" my name Arjun",true);
	}

	@AfterMethod
	public void demo31() {
		Reporter.log("demo31 i executed after method", true);
	}

	@AfterClass
	public void demo21() {
		Reporter.log("demo21 i executed after class", true);
	}

	@AfterTest
	public void demo11() {
		Reporter.log("demo11 i executed after test", true);
	}

	@AfterSuite
	public void demoo() {
		Reporter.log("demoo i executed after suite", true);
	}
}
