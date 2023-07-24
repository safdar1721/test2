package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.testng.annotations.Test;

public class Two_annotn_singlecls {
private By driver;

@Test
public void login() throws InterruptedException
{
	driver.findElement((SearchContext) By.id("email")).sendKeys("hello");
	driver.findElement((SearchContext) By.id("pass")).sendKeys("jamal");
	driver.findElement((SearchContext) By.name("login")).click();
	Thread.sleep(4000);
	
}
}
