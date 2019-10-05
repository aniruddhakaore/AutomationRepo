import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass1 {
	public static void main (String [] args)throws InterruptedException{
		
		//System.setProperties();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String url = "https://www.facebook.com/";
		driver.get(url);
		//driver.findElements(ByXPath"//select[@id='fakebox-input']");
		String str1 = driver.getTitle();
		System.out.println("Title:- "+str1);
		int i = str1.length();
		System.out.println("Length Of Title:- " +i);
		String str2 = driver.getCurrentUrl();
		System.out.println("Current URL:- " +str2);
		System.out.println("Expected URL:- "+url);
		
		if (url.equals(str2)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
			
		driver.close();
	}	
}
