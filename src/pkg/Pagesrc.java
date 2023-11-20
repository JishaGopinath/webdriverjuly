package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//to launch chromebrowser
		driver.get("https://www.google.com");//to launch application
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("not present");
		}

	}

}
