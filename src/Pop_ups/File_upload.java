package Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/html/file%20upload.html");
		Thread.sleep(1000);
		 WebElement ele = driver.findElement(By.name("upload file"));
		 ele.sendKeys("F:\\mobile\\pdf2\\B.pdf");
		 System.out.println("file is uploaded");

	}

}
