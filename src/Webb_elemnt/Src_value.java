package Webb_elemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Src_value {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> element = driver.findElements(By.xpath("//img"));
		for(WebElement srcvalue:element)	
		{
			String valueofsrc = srcvalue.getAttribute("src");
			System.out.println(valueofsrc);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
