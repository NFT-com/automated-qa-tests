package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.discover.discover_NFTs;


@Listeners({AllureListener.class})
public class Discover_NFTsPage_Test extends TestBase {
	discover_NFTs Discover_NFTs;

	public Discover_NFTsPage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		Discover_NFTs = new discover_NFTs();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToDiscover_NFTsPage() throws Exception {
		Thread.sleep(3000);
		Discover_NFTs.NavigateToDiscover_NFTsPage();
	}
	

	@Test(groups = {"regression"}, priority = 2)
	public void ValidateDiscoverNFTsPage() throws Exception {
		Discover_NFTs.ValidateDiscoverNFTsPage();
	}

	@Test(groups = {"regression"}, priority = 3)
	public void VerifyNFTdetailspage() throws Exception {
		Discover_NFTs.VerifyNFTdetailspage();
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
	
}
