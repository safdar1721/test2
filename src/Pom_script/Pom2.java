package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	@FindBy(xpath = "//a[@id='a3']")
	private WebElement link;
	
	public Pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicklink()
	{
		link.click();
	}
}


