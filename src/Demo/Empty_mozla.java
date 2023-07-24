package Demo;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_mozla {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		//Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		//driver.close();
		//driver.get("https://www.google.com");
		//Dimension d = new Dimension(200,300);
		//driver.manage().window().setSize(d);
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);

	}

}
