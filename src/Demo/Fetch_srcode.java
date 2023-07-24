package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_srcode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3000);
		            String title=driver.getTitle();
		            System.out.println(title);
		            
		          String url=driver.getCurrentUrl();
		          System.out.println(url);
		          
		          String src=driver.getPageSource();
		          System.out.println(src);
		          
		          driver.close();
		          
	}

}
