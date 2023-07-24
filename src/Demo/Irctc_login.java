package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.irctc.co.in/nget/train-search");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("jmlsfdr145");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("9835244560");
		  Thread.sleep(10000);
		  driver.findElement(By.xpath("//button[text()='SIGN IN']")).click();
		  driver.findElement(By.xpath("//label[text()='From']")).sendKeys("dhn");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//label[text()='To']")).sendKeys("jtj");

	}

}
