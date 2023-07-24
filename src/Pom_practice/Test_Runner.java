package Pom_practice;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Runner extends Generic_script {  
	@Test
	public void test()
	{
		
		First_scrpt p = new First_scrpt(driver);
		p.fn("safdar");
		p.ln("jamal");
		p.usermail("safdar@gmail.con");
		p.button();
		p.unumber("7011934034");
		p.sub("hindi");
		p.hobbutn();
		p.upload("F:\\takess.jpeg");
		p.curenad("jharkhand");
	}

}
