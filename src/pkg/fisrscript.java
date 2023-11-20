package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class fisrscript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String Exp="google";
		if(actualtitle.equalsIgnoreCase(Exp))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
