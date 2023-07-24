package Frames_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/mainpage.html");
		Thread.sleep(2000);
		driver.findElement(By.id("f1")).sendKeys("safdar");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		driver.findElement(By.id("f1")).sendKeys("jamal");
		Thread.sleep(2000);
		driver.findElement(By.id("f1")).clear();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("f1")).clear();
		
		
		
		

	}

}
