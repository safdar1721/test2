package Webb_elemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_chekbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//input"));
		int count = link.size();
		for(int i=0;i<count;i++)
		{
			WebElement we = link.get(i);
			we.click();
			Thread.sleep(1000);
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement we = link.get(i);
			we.click();
			Thread.sleep(1000);
		}

	}

}
