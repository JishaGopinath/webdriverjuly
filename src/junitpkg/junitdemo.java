package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	@Before
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
	}
	@Test
	public void test2()
	{
		String src=driver.getPageSource();
		if(src.contains("abc"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("not prsent");
		}
			
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
