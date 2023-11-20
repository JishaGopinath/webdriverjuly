package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Gmaillogin;

public class Gmailtest {
	WebDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-1459415450%3A1698864956034354&theme=glif");
	}
	@Test
	public void test()
	{
	Gmaillogin ob=new Gmaillogin(driver);
	ob.setvalues("abc@gmail.com");
	ob.submit();
	}

}
