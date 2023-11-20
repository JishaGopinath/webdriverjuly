package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolgetexcersise {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String src=driver.getPageSource();
		if(src.contains("c++"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("not prsent");
		}
			

	}

}
