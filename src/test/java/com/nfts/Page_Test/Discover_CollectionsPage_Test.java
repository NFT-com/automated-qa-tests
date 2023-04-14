package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.discover.discover_Collections;


@Listeners({AllureListener.class})
public class Discover_CollectionsPage_Test extends TestBase {
	discover_Collections Discover_Collections;

	public Discover_CollectionsPage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		Discover_Collections = new discover_Collections();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToDiscover_CollectionsPage() throws Exception {
		Thread.sleep(3000);
		Discover_Collections.NavigateToDiscover_CollectionsPage();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateDiscoverCollectionsPage() throws Exception {
		Discover_Collections.ValidateDiscoverCollectionsPage();
	}
	

	@Test(groups = {"regression"}, priority = 3)
	public void VerifyCollectionDetailsPage() throws Exception {
		Discover_Collections.VerifyCollectionDetailsPage();
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
