package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Parameters({"email","pass"})
	@Test
	public void test(String email,String pass)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
	}
	

	
	

}
