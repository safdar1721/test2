package Test_ng_foldr;

import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Dependency_testng {
	@Test
	public void compose()
	{
		Reporter.log("hello india",true);
		
	}
	@Test(dependsOnMethods = "compose")
	public void sentitems()
	{
		Reporter.log("hello jharkhand",true);
	}
	@Test(dependsOnMethods = "sentitems")
	public void trash()
	{
		Reporter.log("good morning",true);
	}
	/*@BeforeSuite
	@BeforeTest
	@BeforeClass
	@BeforeMethod
	@Test
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite
	@DataProvider
	@FindBy
	@Parameters
	*/

}
