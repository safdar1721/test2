package Pom_script;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRunner2 {
	@Test
	public void test2()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/link.html");
		Pom2 p = new Pom2(driver);
		p.clicklink();
	}

}
