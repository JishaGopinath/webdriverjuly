package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddiff {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void redifftest()
	{
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("fdgdfg");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("aaruz.com");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.id("newpasswd")).sendKeys("456789");
		driver.findElement(By.id("newpasswd1")).sendKeys("456789");
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("aaruz@gmail"); //if you have email address
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[15]/td[2]/table/tbody/tr/td/input")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[16]/td/div/table/tbody/tr[2]/td[3]/select")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[16]/td/div/table/tbody/tr[4]/td[3]/input")).sendKeys("mom");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[16]/td/div/table/tbody/tr[6]/td[3]/input")).sendKeys("jayasree");
		driver.findElement(By.id("mobno")).sendKeys("45465675");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[26]/td[3]/select")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[28]/td/div")).click();
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[32]/td[3]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[34]/td[2]/input[6]")).click();
		
		
	}
	

}
