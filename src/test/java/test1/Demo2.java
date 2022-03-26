package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric_libraries.Webdriver_utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2
{
@Test
public void test() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Webdriver_utilities wlib=new Webdriver_utilities();
	wlib.maxmaisewindow(driver);
	wlib.loadforpage(driver);
	WebElement element = driver.findElement(By.xpath("//a[.='Gmail']"));
	wlib.rightclick(driver, element);
	
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement element2 = driver.findElement(By.xpath("//select"));
	wlib.select(element2, 4);
	Thread.sleep(1000);
	wlib.select(element2,"Argentina");
	
	driver.get("https://unixpapa.com/js/testover.html");
	
	WebElement element3 = driver.findElement(By.xpath("//div[.='Some Text']"));
	wlib.mouseover(driver, element3);
	
	
}
}



