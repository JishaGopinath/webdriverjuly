package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Gmaillogin {
	WebDriver driver;
	
	By gmailemail=By.xpath("//*[@id=\"identifierId\"]");
	By login=By.xpath("//*[@id=\"identifierNext\"]/div/button/span");


public Gmaillogin(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email)
{
	driver.findElement(gmailemail).sendKeys(email);
}
public void submit()
{
	driver.findElement(login).click();
}
}