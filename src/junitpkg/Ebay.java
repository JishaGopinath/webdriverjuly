package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	ChromeDriver driver;
	
	@Before
	public void SetUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://www.ebay.com/");
	}
	@Test
	public void ebaytest()
	{
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='s0-53-17-6-3-4[0]-3-2-1-list']/li[2]/div/a")).click();
		//driver.findElement(By.xpath("//*[@id='srp-river-main']/div[2]/ul/li[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='x-refine__group__0']/ul/li/ul/li[1]/a")).click();
		
	}
	@Test
	public void test1()
	{
		
		
		String actualtitle=driver.getTitle();
		String Exp="Electronics, Cars, Fashion, Collectibles & More | eBay";
		if(actualtitle.equalsIgnoreCase(Exp))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
	
	
	}
	public void test2()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("no of links="+li.size());

	for(WebElement element:li)
	{
		String link=element.getAttribute("href");
		String text=element.getText();
		System.out.println(link+"---------"+text);
	}

}
}

