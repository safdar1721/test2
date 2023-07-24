package Java_script_extr;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passdata_disabltext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/xpath.html");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//pass the data inside a disable text field
		js.executeScript("document.getElementById('a1').value='friday'");
		
		//for delete the data in disable field
		
		js.executeScript("document.getElementById('a1').value=' '");
		
	}

}
