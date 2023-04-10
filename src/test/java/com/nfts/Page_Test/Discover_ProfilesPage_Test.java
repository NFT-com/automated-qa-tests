package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.discover.discover_Profiles;


@Listeners({AllureListener.class})
public class Discover_ProfilesPage_Test extends TestBase {
	discover_Profiles Discover_Profiles;

	public Discover_ProfilesPage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		//initialization();
		Discover_Profiles = new discover_Profiles();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToDiscover_ProfilesPage() throws Exception {
		Thread.sleep(3000);
		Discover_Profiles.NavigateToDiscover_ProfilesPage();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateDiscoverProfilesPage() throws Exception {
		Discover_Profiles.ValidateDiscoverProfilesPage();
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
