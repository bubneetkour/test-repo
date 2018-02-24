package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import common.utility.LCB;

public class TC02 extends LCB{

	@Test
	public void testCase02() throws Exception{
		HomePage homePage = new HomePage(driver);
		homePage.closePopup()
		.enterOrigin("DEL")
		.enterDestination("MNL")
		.selectDepartDate()
		.selectReturnDate()
		.clickOnSearh();
	}
}
