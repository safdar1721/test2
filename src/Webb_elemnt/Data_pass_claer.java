package Webb_elemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_pass_claer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/texct.html");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int count = ele.size();
		for(WebElement enter:ele)
		{
			enter.sendKeys("safdar");
			Thread.sleep(1000);
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement ele2 = ele.get(i);
			ele2.clear();
			Thread.sleep(1000);
		}
		

	}

}
