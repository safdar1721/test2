package Test_ng_foldr;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_testng {
	@Test(priority = 1,invocationCount = 3)
	public void test1()
	{
		Reporter.log("good morning",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("good evening",true);
	}
	@Test(enabled = false)
	public void test3()
	{
	Reporter.log("hello india",true);	
	}

}
