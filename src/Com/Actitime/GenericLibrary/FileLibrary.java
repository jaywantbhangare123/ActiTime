package Com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterMethod;

public class FileLibrary {
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis= new FileInputStream("./TestData/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
		}

	public String readdataFromExcel(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fisl=new FileInputStream("./TestData/TestDaata.xlsx");
		Workbook wb=WorkbookFactory.create(fisl);
		String value1 = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value1;
	}
	

}
