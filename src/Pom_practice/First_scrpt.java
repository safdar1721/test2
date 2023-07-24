package Pom_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_scrpt {
	@FindBy(id="firstName")
	private WebElement Fnfield;
	@FindBy(id="lastName")
	private WebElement lnfield;
	@FindBy(id="userEmail")
	private WebElement umail;
	@FindBy(xpath = "//label[text()='Male']")
	private WebElement gender;
	@FindBy(id="userNumber")
	private WebElement number;
	
	@FindBy(xpath ="//div[@class='subjects-auto-complete__value-container "
			+ "subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	private WebElement subject;
	@FindBy(xpath ="//label[text()='Sports']")
	private WebElement hobbies;
	@FindBy(id="uploadPicture")
	private WebElement uploadpic;
	@FindBy(id="currentAddress")
	private WebElement curentadd;
	
	public First_scrpt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fn(String FN)
	{
		Fnfield.sendKeys(FN);
	}
	public void ln(String LN)
	{
		lnfield.sendKeys(LN);
	}
	public void usermail(String UM)
	{
		umail.sendKeys(UM);
	}
	public void button()
	{
		gender.click();
	}
	public void unumber(String UN)
	{
		number.sendKeys(UN);
	}
	public void sub(String SU)
	{
		subject.sendKeys(SU);
	}
	public void hobbutn()
	{
		hobbies.click();
	}
	public void upload(String UL)
	{
		uploadpic.sendKeys(UL);
	}
	public void curenad(String CA)
	{
		curentadd.sendKeys(CA);
	}

}
