import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumClass3_Dropdown {
	public static void main (String [] args)throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","/Users⁩/aniruddhakaore⁩/⁨Desktop⁩/⁨Selenium⁩/Selenium Addins⁩/chromedriver_77");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String url1 = "https://chandanachaitanya.github.io/selenium-practice-site/";
		driver.navigate().to(url1);
		
		
		// Program for Dropdown 
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='programming-languages']")));
		sel1.selectByValue("Python");
		sel1.selectByIndex(2);
			
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='selenium_suite']")));
		sel2.selectByIndex(3);
		sel2.selectByIndex(2);
		sel2.selectByValue("Adv");
		sel2.selectByVisibleText("Selenium IDE");
		
		List <WebElement> List2 = sel2.getOptions();
		
		int x = List2.size();
		System.out.println(x);
		//String attrString;
		int i;
		for (i = 0; i<x; i++)
		{
			String attrString = List2.get(i).getText();
			if (List2.get(i).isSelected())
			{
				System.out.println(attrString);
			}
		}
				
		//Thread.sleep(500);
		driver.close();
	}	
}

