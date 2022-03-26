package test1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric_libraries.Propertyfile_utility;
import genric_libraries.Webdriver_utilities;
import genric_libraries.excel_utility;
import genric_libraries.java_utilities;

public class Demo_date
{
@Test
public void getdate() throws EncryptedDocumentException, Throwable
{
	java_utilities jlib=new java_utilities();
	String date=jlib.getcurrentdate();
	System.out.println(date);
	
	int number = jlib.getrandomnumber();
	System.out.println(number);
	
	Propertyfile_utility plib =new Propertyfile_utility();
	String name= plib.readdatafromproprtyfile("url");
	System.out.println(name);
	
	excel_utility elib=new excel_utility();
	 String excel=elib.readdatafromexcel("Sheet1",0,0);
	 System.out.println(excel);
	String excel1= elib.readdatafromexcel("Sheet1", 5, 2);
	System.out.println(excel1);
	
	
    
	
}

}
