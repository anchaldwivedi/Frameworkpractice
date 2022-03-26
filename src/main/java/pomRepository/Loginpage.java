package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
@FindBy(xpath = "//input[@id='username']")
private  WebElement usernameedit;
@FindBy(xpath = "//input[@type='password']")
private WebElement passwordedit;
@FindBy(xpath = "//div[.='Login ']")
private WebElement loginbutton;
public WebElement getUsernameedit() {
	return usernameedit;
}
public WebElement getPasswordedit() {
	return passwordedit;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
 public Loginpage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 
 }
 //bussiness logic
 public void logintoapplication()
 {
	 usernameedit.sendKeys("admin");
	 passwordedit.sendKeys("manager");
	 loginbutton.click();
 }
}
