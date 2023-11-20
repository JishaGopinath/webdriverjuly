package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationexercise {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("maya");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("maya789@gmail.com");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("maya@006");
		
		WebElement day=driver.findElement(By.xpath("//select[@id='days']"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("2");
		
		
		WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("January");
		
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='years']"));
		Select yeardetails=new Select(Year);
		yeardetails.selectByValue("2021");
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@id='optin']")).click();
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("maya");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("krishna");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("markup");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("tripunithura");
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("karthika");
		
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select countrydetails=new Select(country);
		countrydetails.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ernakulam");
		driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("682310");
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("5094967767");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
		
	}
}
