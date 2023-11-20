package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Linkcount {

ChromeDriver driver;
	
	@Before
	public void SetUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.ebay.com/");
	}
	@Test
	public void test1()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total no.of links="+li.size());
		List<WebElement>li1=driver.findElements(By.tagName("input"));
		System.out.println(li1.size());
	}
	
}
