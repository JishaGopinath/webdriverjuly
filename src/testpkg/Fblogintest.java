package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;
import pagepkg.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest()
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.Setvalues("abc@gmail.com", "Aaruz@123");
		
		ob.login();
		driver.navigate().back();
		Fbcreatepage ob1=new Fbcreatepage(driver);
		ob1.pageclick();
		ob1.getstartedbutton();
		
	}

}
