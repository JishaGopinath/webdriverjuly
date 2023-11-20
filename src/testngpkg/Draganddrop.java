package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
ChromeDriver driver;
	
	@BeforeTest
	
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	@Test
	public void test()
	{
		WebElement Drag1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drop1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement drag2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement drag3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement drop3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement drag4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Drag1, drop1);
		act.dragAndDrop(drag2, drop2);
		act.dragAndDrop(drag3, drop3);
		act.dragAndDrop(drag4, drop4);
		act.perform();
		
		
	}

}
