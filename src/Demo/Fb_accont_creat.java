package Demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_accont_creat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("safdarkk");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jamall");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("7011934033");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(ele);
		s1.selectByVisibleText("3");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(ele2);
		s2.selectByIndex(2);
		Thread.sleep(1000);
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(ele3);
		s3.selectByVisibleText("1997");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
		
		
		
		
		
		

	}

}
