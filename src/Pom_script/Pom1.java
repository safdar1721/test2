package Pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Pom1 {
	@FindBy(id="email")
	private WebElement unfield;
	@FindBy(id="pass")
	private WebElement pwdfield;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passUN(String un)
	{
		unfield.sendKeys(un);
	}
	public void passpwd(String pwd)
	{
		pwdfield.sendKeys(pwd);
	}
	public void btn()
	{
		loginbtn.click();
	}
	

}
