package junitpkg;

import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	
		public void googletest() throws Exception
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cricket",Keys.ENTER);
			
		}
	}


