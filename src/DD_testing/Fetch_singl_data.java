package DD_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_singl_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//specify the path of the excel
		FileInputStream file = new FileInputStream("./Excel/Testdata.xlsx");
		//open the excel file
		Workbook book = WorkbookFactory.create(file);
		//specify the sheet value
		Sheet sh = book.getSheet("Sheet1");
		Row row = sh.getRow(0);     //specify the row value
		Cell cell = row.getCell(2);  //specify the cell value
		//String value = cell.toString();  //fetch the data from particular cell,number,sp-charcter,chra
		//String values = cell.getStringCellValue();  //get string value
		double values = cell.getNumericCellValue(); //fetch number value only
		System.out.println(values);
		
		

	}

}
