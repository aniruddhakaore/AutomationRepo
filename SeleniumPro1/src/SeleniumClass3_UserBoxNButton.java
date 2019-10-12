import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass3_UserBoxNButton {
	public static void main (String [] args)throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","/Users⁩/aniruddhakaore⁩/⁨Desktop⁩/⁨Selenium⁩/Selenium Addins⁩/chromedriver_77");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*String url = "https://www.facebook.com/";
		driver.navigate().to(url);
		//Thread.sleep(500);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		//driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
		// Program for Radio Button
		String url1 = "https://chandanachaitanya.github.io/selenium-practice-site/";
		driver.navigate().to(url1);
		//driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@type='radio'][@value='Novels']")).click();
		List <WebElement> getGroup = driver.findElements(By.xpath("//input[@name='books']"));
		System.out.println(getGroup);
		int x = getGroup.size();
		System.out.println(x);
		//String attrString;
		int i = 0;
		for (i = 0; i<=x; i++)
		{
			String attrString = getGroup.get(i).getAttribute("value");
			System.out.println(attrString);
		}
		
		//Thread.sleep(5000);
		driver.close();
	}	
}
