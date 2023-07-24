package Webb_elemnt;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swipe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/swipe.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@id='a1']"));
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath(("//input[@id='a3']")));
		ele2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.xpath("//input[@id='a2']"));
		ele3.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"v");
		
	}

}
