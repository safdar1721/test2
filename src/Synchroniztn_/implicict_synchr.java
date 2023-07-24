package Synchroniztn_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicict_synchr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/html/swipe.html");
		WebElement ele=driver.findElement(By.xpath("//input[@id='a1']"));
		ele.sendKeys(Keys.CONTROL+"ax");
		WebElement ele2=driver.findElement(By.xpath(("//input[@id='a3']")));
		ele2.sendKeys(Keys.CONTROL+"v");
		WebElement ele3=driver.findElement(By.xpath("//input[@id='a2']"));
		ele3.sendKeys(Keys.CONTROL+"ax");
		ele.sendKeys(Keys.CONTROL+"v");
		

	}

}
