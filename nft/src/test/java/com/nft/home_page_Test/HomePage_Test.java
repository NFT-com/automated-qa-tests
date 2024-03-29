package com.nft.home_page_Test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nft.qa.base.TestBase;
import com.nft.home_page.homepage;

public class HomePage_Test extends TestBase{
	homepage HomePage;

	public HomePage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		initialization();
		HomePage = new homepage();
	}

	@Test(groups = {"regression"}, priority = 1)
	public void NavigateToNFT() throws Exception {
		HomePage.NavigateToNFT();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateNFTLogoImage() throws Exception {
		HomePage.ValidateNFTLogoImage();
	}
	
	
	@Test(groups = {"regression"}, priority = 3)
	public void ValidateNFTcomHeaderOptions() throws Exception {
		HomePage.ValidateNFTcomHeaderOptions();
	}
	
	@Test(groups = {"regression"}, priority = 4)
	public void VerifyDiscoverHeaderDropDownoptions() throws Exception {
		HomePage.VerifyDiscoverHeaderDropDownoptions();
	}
	
	@Test(groups = {"regression"}, priority = 5)
	public void VerifyLearnHeaderDropDownoptions() throws Exception {
		HomePage.VerifyLearnHeaderDropDownoptions();
	}
	
	@Test(groups = {"regression"}, priority = 6)
	public void VerifySearchFieldResponse() throws Exception {
		HomePage.VerifySearchFieldResponse();
	}
	
	/*
	 * @Test(groups = {"regression"}, priority = 7) public void
	 * VerifySignInResponse() throws Exception { HomePage.VerifySignInResponse(); }
	 * 
	 * @Test(groups = {"regression"}, priority = 8) public void
	 * VerifyCartheaderOption() throws Exception {
	 * HomePage.VerifyCartheaderOption(); }
	 * 
	 * @Test(groups = {"regression"}, priority = 9) public void
	 * VerifyClickonCreateAProfileButton() throws Exception {
	 * HomePage.VerifyClickonCreateAProfileButton(); }
	 * 
	 * @Test(groups = {"regression"}, priority = 10) public void
	 * VerifyHomePageSections() throws Exception {
	 * HomePage.VerifyHomePageSections(); }
	 * 
	 * @Test(groups = {"regression"}, priority = 11) public void
	 * VerifyConnectWalletScreen() throws Exception {
	 * HomePage.VerifyConnectWalletScreen(); }
	 */
	
	  @AfterClass(alwaysRun = true) 
	  public void tearDown() { 
		  driver.quit();
	  }
	 
}
