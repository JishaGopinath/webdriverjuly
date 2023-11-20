package junitpkg;


import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Example {
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.w3schools.com");
			
		}
		@Test
		
			public void googletest()
			{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
			String title1=driver.getTitle();
			System.out.println(title1);
				WebElement search1=driver.findElement(By.id("search2"));
				search1.sendKeys("car");
				search1.submit();
			}

}
