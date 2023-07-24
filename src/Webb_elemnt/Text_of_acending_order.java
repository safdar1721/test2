package Webb_elemnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Text_of_acending_order {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s = new Select(ele);
		ArrayList<String> arr = new ArrayList<String>();
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for(WebElement op:options) {
			String text = op.getText();
			arr.add(text);
			
		}
		Collections.sort(arr);
		for(String A:arr)
		{
			System.out.println(A); 
		}

	}




	}


