package common.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class LCB {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.onetravel.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
}
