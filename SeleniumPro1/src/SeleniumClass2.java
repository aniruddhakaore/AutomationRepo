import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass2 {
	public static void main (String [] args)throws InterruptedException{
		
		//System.setProperties();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String url = "https://www.facebook.com/";
		driver.navigate().to(url);
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Forgotten account?")).click();
		System.out.println("Forgotten pwd");
		driver.navigate().back();
		System.out.println("Back");
		Thread.sleep(500);
		driver.navigate().refresh();
		System.out.println("Refresh");
		driver.close();
		System.out.println("Browser Closed");
		}
	}	
