package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
				
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones",Keys.ENTER);
		String expected="Amazon.in : Mobile Phones";
		String actual=driver.getTitle();
		System.out.println(actual);
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart\"]/span")).click();
		
	}

}
