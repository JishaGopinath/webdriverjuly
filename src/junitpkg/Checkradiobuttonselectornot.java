package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkradiobuttonselectornot {
	ChromeDriver driver;
	@Before
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		boolean m=driver.findElement(By.xpath("//*[@value='m']")).isSelected();
		
		if(m)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
	}
	

}
