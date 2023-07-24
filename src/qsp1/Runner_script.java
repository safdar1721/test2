package qsp1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner_script extends Generic_script{
	@Test
	public void ValidLogin() throws InterruptedException
	{
	driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.id("pass")).sendKeys("jamal");
	driver.findElement(By.name("login")).click();
	Thread.sleep(4000);
	String title = driver.getTitle();
	System.out.println(title);
	}

}
