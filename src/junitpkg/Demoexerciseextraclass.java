package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoexerciseextraclass {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("maya");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("maya678@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
}
}
