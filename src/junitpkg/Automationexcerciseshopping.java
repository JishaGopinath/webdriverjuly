package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexcerciseshopping {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/products");
	}
	@Test
	public void test() throws Exception
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(15);
		
		//driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i")).click();
		//driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		
		
	}

}
