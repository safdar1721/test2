package Webb_elemnt;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.sql.Driver;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		
			
			


	}

}
