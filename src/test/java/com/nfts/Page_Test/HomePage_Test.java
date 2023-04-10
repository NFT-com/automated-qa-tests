package com.nfts.Page_Test;



import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.home_page.homepage;

@Listeners({AllureListener.class})
public class HomePage_Test extends TestBase {
	homepage HomePage;

	public HomePage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		//initialization();
		HomePage = new homepage();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToNFT() throws Exception {
		Thread.sleep(3000);
		HomePage.NavigateToNFT();
	}

	@Test(groups = { "regression" }, priority = 2)
	public void ValidateNFTLogoImage() throws Exception {
		Thread.sleep(3000);
		HomePage.ValidateNFTLogoImage();
	}

	@Test(groups = { "regression" }, priority = 3)
	public void ValidateNFTcomHeaderOptions() throws Exception {
		Thread.sleep(3000);
		HomePage.ValidateNFTcomHeaderOptions();
	}

	@Test(groups = { "regression" }, priority = 4)
	public void VerifyDiscoverHeaderDropDownoptions() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyDiscoverHeaderDropDownoptions();
	}

	@Test(groups = { "regression" }, priority = 5)
	public void VerifyLearnHeaderDropDownoptions() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyLearnHeaderDropDownoptions();
	}

	@Test(groups = { "regression" }, priority = 6)
	public void VerifySearchFieldResponse() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifySearchFieldResponse();
	}

	@Test(groups = { "regression" }, priority = 7)
	public void VerifySignInResponse() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifySignInResponse();
	}

	@Test(groups = { "regression" }, priority = 8)
	public void VerifyCartheaderOption() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyCartheaderOption();
	}

	@Test(groups = { "regression" }, priority = 9)
	public void VerifyClickonCreateAProfileButton() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyClickonCreateAProfileButton();
	}

	@Test(groups = { "regression" }, priority = 10)
	public void VerifyHomePageSections() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyHomePageSections();
	}

	@Test(groups = { "regression" }, priority = 11)
	public void VerifyConnectWalletScreen() throws Exception {
		Thread.sleep(3000);
		HomePage.VerifyConnectWalletScreen();
	}

	@Test(groups = { "regression" }, priority = 12)
	public void FooterlinkRedirects() throws Exception {
		Thread.sleep(3000);
		HomePage.FooterlinkRedirects();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
