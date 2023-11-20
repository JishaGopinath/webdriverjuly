package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://facebook.com");	
		
	}
	@Test
	public void test()
	{
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jisha@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}

