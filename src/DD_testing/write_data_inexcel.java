package DD_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class write_data_inexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet2");
		Row rw = sh.createRow(0);
		Cell cel = rw.createCell(0);
		cel.setCellValue("md sarmad");
		
		Row x = sh.createRow(1);
		Cell y = x.createCell(1);
		y.setCellValue("safdar");
		FileOutputStream fos = new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);

	}

}
