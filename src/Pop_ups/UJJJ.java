package Pop_ups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UJJJ {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("vivo y16");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/vivo-y16-drizzling-gold-64-gb/p/itm72f3a9786718b?pid=MOBGHV2FREZH4NHQ&lid=LSTMOBGHV2FREZH4NHQ9NGASN&marketplace=FLIPKART&q=vivo+y16&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=0ae780a8-08bc-42a5-a9ad-5ace0e2aa306.MOBGHV2FREZH4NHQ.SEARCH&ppt=hp&ppn=homepage&ssid=63jhdgsaq80000001686988513027&qH=0f244e8c68f2584f	");
		Set<String> awhl = driver.getWindowHandles();
        int count = awhl.size();
		ArrayList<String> s=new ArrayList<>(awhl);
		
	    for(String we:awhl)
	    {
		driver.switchTo().window(we);
		driver.findElement(By.xpath("(//div[text()='vivo Y16 (Steller Black, 64 GB)'])[1]")).click();
		Thread.sleep(1000);

		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("F:\\takess\\fli78p.jpeg");
		FileHandler.copy(src, des);
		
	    }
	}
	

}
