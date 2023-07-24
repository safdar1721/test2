package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Login_yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&"
				+ "done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%2F&add=1");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("safdar1721");
		Thread.sleep(2000);
		driver.findElement(By.name("signin")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.className("login-body")).click();
		
		

	}

}
