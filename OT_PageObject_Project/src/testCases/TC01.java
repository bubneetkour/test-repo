package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.ListingPage;
import common.utility.LCB;

public class TC01 extends LCB{

	@Test
	public void testCase01() throws Exception{
		HomePage homePage = new HomePage(driver);
		homePage.closePopup()
		.enterOrigin("LAS")
		.enterDestination("LAX")
		.selectDepartDate()
		.selectReturnDate()
		.clickOnSearh();
		
		ListingPage listingPage = new ListingPage(driver);
		listingPage.selectContract();
		
		
		
	}
}
