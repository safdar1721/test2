package DD_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_multipl_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet3");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(int i=0; i<link.size(); i++)
		{
		Row rw = sh.createRow(i);
		Cell cel = rw.createCell(0);
		WebElement ele = link.get(i);
		String url = ele.getAttribute("href");
		cel.setCellValue(url);
		}
		FileOutputStream fos = new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);
		driver.close();
		
	}

}
