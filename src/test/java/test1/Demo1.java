package test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
@Test
public void Test1() throws Throwable
{
	System.out.println("hii");
	FileInputStream fis=new FileInputStream(".//src//test//resources//propertyfile.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
    String nam = pobj.getProperty("Name");
	String facebk=pobj.getProperty("url");
	System.out.println(facebk);
	System.out.println(nam);
	  
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(facebk);
	
	
	
}


}
