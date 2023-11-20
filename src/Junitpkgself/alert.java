package Junitpkgself;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class alert {
	
	RemoteWebDriver driver;
	
	@Before
	
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///Users/rahul/Downloads/alertself.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("jisha");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("gopinath");
		driver.findElement(By.xpath("/html/body/input[4]")).click();

}
}
