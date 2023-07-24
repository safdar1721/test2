package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("safdar1721");
		Thread.sleep(2000);
		driver.findElement(By.name("signin")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("login-passwd")).sendKeys("sfdrjml@1721");
		Thread.sleep(1500);
		driver.findElement(By.id("login-signin")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id=\"ybarMailLink\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		
		

	}

}
