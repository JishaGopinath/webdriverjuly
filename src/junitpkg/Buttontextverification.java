package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextverification {
	ChromeDriver driver;
	
	@Before
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		
		String s=driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		System.out.println("button text"+"\n"+s);
		if(s.equals("Create my account >>"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
