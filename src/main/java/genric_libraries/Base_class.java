package genric_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{
	 public WebDriver driver;
	public Webdriver_utilities wlb=new Webdriver_utilities();
	 
	
@BeforeSuite
public void connect_database()
{
System.out.println("connect to database");	
}
@BeforeClass
public void launching_the_browser()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	Webdriver_utilities wlib=new Webdriver_utilities();
	wlib.maxmaisewindow(driver);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	System.out.println("browser launched ");
	
}
@BeforeMethod
public void login_to_application() throws InterruptedException
{
	driver.get("http://localhost/login.do");
	 System.out.println("log in successfully");
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     Thread.sleep(1000);
     }
@AfterMethod
public void logout_application()
{
	driver.findElement(By.xpath("//a[.='Logout']")).click();
	System.out.println("logout application successfull");
	}
@AfterClass
public void close_the_browser()
{  driver.quit();
	System.out.println("close the browser");
	
}
@AfterSuite
public void close_the_database()
{ 
	System.out.println("database close successfully");
	}
}

