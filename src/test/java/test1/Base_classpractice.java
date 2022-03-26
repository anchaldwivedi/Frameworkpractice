package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genric_libraries.Base_class;

public class Base_classpractice extends Base_class
{
	@Test
	public void Test_baseclass() throws InterruptedException
	{
		System.out.println("my testscript is here");
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
		System.out.println("clicked on task");
		driver.findElement(By.xpath("//span[.='Create Tasks']")).click();
		System.out.println("clicked on create task button");
		WebElement element = driver.findElement(By.xpath("//select[@name='customerId']"));
		wlb.select(element, 1);
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("anchal123");
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("pearl");
		driver.findElement(By.xpath("//input[@id='task[0].name']")).sendKeys("pearl123");
		driver.findElement(By.xpath("//input[@id='task[0].markedToBeAddedToUserTasks']")).click();
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		
		
		
		
		
		
		
		
	}
	
	
	
}
