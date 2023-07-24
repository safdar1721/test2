package Demo;

import java.awt.Dimension;
import java.io.Closeable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  //driver.navigate().to("https://www.google.com");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().forward();
	  Thread.sleep(1000);
	  driver.navigate().refresh();
	  Dimension d = new Dimension(100,200);
	  //driver.manage().window().setSize(d);
	 
	  
	 

	}

}
