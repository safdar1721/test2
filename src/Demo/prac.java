package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/login/");
		  driver.findElement(By.xpath("//*[@id='email']/self::INPUT")).sendKeys("safdar");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='pass']/self::INPUT")).sendKeys("jamal");
		  Thread.sleep(2000);

	}

}
