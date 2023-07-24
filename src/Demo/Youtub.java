package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtub {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("atif aslam song"); 
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(4000);
	//driver.findElement(By.cssSelector("a[class='yt-simple-endpoint style-scope ytd-video-renderer']")).click();
	Thread.sleep(8000);
	driver.findElement(By.cssSelector("button[class='ytp-ad-skip-button ytp-button']")).click();
	
			}

}
