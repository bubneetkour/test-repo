package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//popup close
	final String popUpCloseLocator = "a[class='signupClose icon ic-cancel-fill']";
	@FindBy(how = How.CSS, using = popUpCloseLocator)
	public WebElement popUp;
	public HomePage closePopup()
	{
		popUp.click();
		return this;
	}
	
	//=============================================
	/*public HomePage closePopup()
	{
		//driver.findElement(By.cssSelector("a[class='signupClose icon ic-cancel-fill']")).click();
		WebElement crossOnPopup = driver.findElement(By.cssSelector("a[class='signupClose icon ic-cancel-fill']"));
		crossOnPopup.click();
		
		return this;
		//return new HomePage(driver);
	}*/
	//============================================
	
	//Enter Origin
	public HomePage enterOrigin(String originName) throws Exception{
		WebElement origin = driver.findElement(By.xpath("//input[@placeholder='From']"));
		origin.clear();
		origin.sendKeys(originName);
		Thread.sleep(2000);
		origin.sendKeys(Keys.TAB);
		
		return this;
	}
	
	//Enter Destination
	public HomePage enterDestination(String destinationName) throws Exception
	{
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		destination.clear();
		destination.sendKeys(destinationName);
		Thread.sleep(2000);
		destination.sendKeys(Keys.TAB);
		
		return this;
	}
	
	//Depart Date
	public HomePage selectDepartDate(){
		//code
		System.out.println("Depart Date Done");
		return this;
	}
	
	//Return Date
	public HomePage selectReturnDate()
	{
		//Code
		System.out.println("Return Date Done");
		return this;
	}
	
	//Click on Search
	public ListingPage clickOnSearh() throws Exception{
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search Now']"));
		searchButton.click();
		
		return new ListingPage(driver);
	}
}







