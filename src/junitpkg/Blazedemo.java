package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void blazedemotest()
	{
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("gfd");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("dfghf");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("343453");
		driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("343453");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
}
