package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("jishagopinath@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("5678");
		driver.findElement(By.name("login")).click();
	}

}
