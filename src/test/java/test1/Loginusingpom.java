package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric_libraries.Webdriver_utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepository.Loginpage;

public class Loginusingpom
{ @Test
	public void Login()
	{
	WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	Webdriver_utilities wlib=new Webdriver_utilities();
	wlib.maxmaisewindow(driver);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	System.out.println("browser launched ");
	driver.get("http://localhost/login.do");
	Loginpage hp=new Loginpage(driver);
	hp.getUsernameedit().sendKeys("admin");
	hp.getPasswordedit().sendKeys("manager");
	hp.getLoginbutton().click();

}
}
