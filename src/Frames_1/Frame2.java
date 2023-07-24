package Frames_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text' and @name='mytext1']")).sendKeys("manual");
		
		driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(ele);
		 driver.findElement(By.xpath("//input[@type='text' and @name='mytext2']")).sendKeys("testing");
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 WebElement ele2 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		 driver.switchTo().frame(ele2);
		 driver.findElement(By.xpath("//input[@type='text' and @name='mytext3']")).sendKeys("selenium");
		 
		 driver.switchTo().defaultContent();
		 WebElement ele3 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		 driver.switchTo().frame(ele3);
		 driver.findElement(By.xpath("//input[@type='text' and @name='mytext4']")).sendKeys("bangalore");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='text' and @name='mytext4']")).clear();
		 
		 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(ele);
		 driver.findElement(By.xpath("//input[@type='text' and @name='mytext2']")).clear();
		

	}

}
