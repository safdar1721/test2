package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRunner1 {
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Pom1 p = new Pom1(driver);
		p.passUN("admin");
		p.passpwd("manager");
		p.btn();
	}

}
