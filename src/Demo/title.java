package Demo;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	
		
		
		

	}

}
