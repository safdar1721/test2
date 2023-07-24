package Webb_elemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_nd_drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement des = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).perform();
		
		
	}

}
