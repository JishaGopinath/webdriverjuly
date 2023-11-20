package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker2booking {

	WebDriver driver;
	@BeforeTest()
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
	}
	@Test
	public void test() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]/span")).click();
		Thread.sleep(20);
		driver.manage().window().maximize();
		datepickermethod("October 2023","30");
		datepickermethod("October 2023","31");
		
		
		
	}
	private void datepickermethod(String Expmonth, String Expdate) {
		String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		while(true)
		{
			if(month.equals(Expmonth))
			{
				System.out.println("month="+month);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
				
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getText();
			if(date.equals(Expdate))
			{
				dateelement.click();
				break;
			}
		}
		
	}
}
