package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twiter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiaGkifQ%3D%3D%22%7D");
		Thread.sleep(3000);
		driver.findElement(By.name("text")).sendKeys("safdar");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("jamal");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//driver.close();
	}

}
