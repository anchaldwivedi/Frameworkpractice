package genric_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_utility 
{
public String readdatafromexcel(String sheet,int row ,int cell ) throws EncryptedDocumentException, Throwable
{
	FileInputStream fis=new FileInputStream(".//src//test//resources//demo.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s = wb.getSheet(sheet);
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	String value= c.getStringCellValue();
	return value;
	
	
	
	
}

}

