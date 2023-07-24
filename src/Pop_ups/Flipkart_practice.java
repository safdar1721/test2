package Pop_ups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart_practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("vivo y16");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='vivo Y16 (Drizzling Gold, 64 GB)'])[1]")).click();
		
		String p_id = driver.getWindowHandle();  //console transfer to other tab
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		Thread.sleep(2000);
		driver.quit();
		//driver.close();
		//driver.findElement(By.xpath("//label[@class='_1fqY3P']")).sendKeys("7011934034");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
