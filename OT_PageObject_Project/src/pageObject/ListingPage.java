package pageObject;

import org.openqa.selenium.WebDriver;

public class ListingPage {

	private WebDriver driver;
	
	public ListingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Contract Select
/*	public PaymentPage  selectContract() throws Exception{
		//Code
		System.out.println("Click on First contract in list.");
		return new PaymentPage(driver);
	}*/
	
	public void selectContract() throws Exception{
		//Code
		System.out.println("Click on First contract in list.");
		
	}
}
