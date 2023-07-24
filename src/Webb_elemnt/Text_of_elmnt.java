package Webb_elemnt;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_of_elmnt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//a[@title='Urdu']"));
		String text=ele.getText();
		System.out.println(text);
		
		//fetch the location
		WebElement ele1=driver.findElement(By.xpath("//input[@type='text']"));
		org.openqa.selenium.Point locn=ele.getLocation();
		System.out.println(locn);
		int x=locn.getX();
		System.out.println(x);
		int y=locn.getY();
		System.out.println(y);
		
		//fetch font size
		WebElement ele2=driver.findElement(By.xpath("//input[@id='pass']"));
		String size=ele2.getCssValue("font size");
				System.out.println(size);
				
				//
		
		

	}

}
