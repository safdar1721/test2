package Webb_elemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_href {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(WebElement alllink:link)
		{
			String hrefvalue = alllink.getAttribute("href");
			System.out.println(hrefvalue);
		}
		Thread.sleep(2000);
		driver.close();

	}

}
