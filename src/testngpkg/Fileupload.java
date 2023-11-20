package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("/Users/rahul/Sites/localhost/website/alert.html");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		String text=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		System.out.println("text="+text);
		
	}

}
