package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hi-in.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("safdar");
		driver.findElement(By.id("pass")).sendKeys("jamal");
		driver.findElement(By.name("login")).click();
		driver.close();
		

	}

}
