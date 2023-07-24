package Incognito1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com");
		

	}

}
