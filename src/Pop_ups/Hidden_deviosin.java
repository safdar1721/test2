package Pop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_deviosin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("ranchi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("giridih");
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[text()='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		
		
	}

}
