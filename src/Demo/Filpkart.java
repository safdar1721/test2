package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
			ele.sendKeys("vivo t20");
			Thread.sleep(2000);
			//ele.clear();
			//Thread.sleep(2000);
			//ele.sendKeys("vivo y19");
			ele.sendKeys(Keys.CONTROL+"a");
			Thread.sleep(2000);
			ele.sendKeys(Keys.CONTROL+"c");
			Thread.sleep(2000);
			ele.sendKeys(Keys.DELETE);
			Thread.sleep(5000);
			ele.sendKeys(Keys.CONTROL+"v");
			
			
		  
		 
	}

}
