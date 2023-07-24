package Webb_elemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_deselct_multploption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/html/multiplDD.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Taj Hotel"));
		Select s = new Select(ele);
		s.selectByIndex(1);
		
		
		
		

	}

}
