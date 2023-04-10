package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.broken_links.BrokenLinks;
import com.nft.gallery.gallery;


@Listeners({AllureListener.class})
public class Gallery_Test extends TestBase {
	gallery Gallery;
	BrokenLinks brokenLinks;

	public Gallery_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		//initialization();
		Gallery = new gallery();
		brokenLinks = new BrokenLinks();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToNFTGalleryPage() throws Exception {
		Thread.sleep(3000);
		Gallery.NavigateToNFTGalleryPage();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateTheBrokenLinks() throws Exception {
		brokenLinks.ValidateTheBrokenLinks();
	}
	
	
	@Test(groups = {"regression"}, priority = 3)
	public void ValidateAllBrokenImages() throws Exception {
		brokenLinks.ValidateAllBrokenImages();
	}
	

	@Test(groups = { "regression" }, priority = 4)
	public void ValidateGenesisKeyPageAsVisitor() throws Exception {
		Thread.sleep(3000);
		Gallery.ValidateGenesisKeyPageAsVisitor();
	}

	@Test(groups = { "regression" }, priority = 5)
	public void ValidateGenesisKeyPageAsLoggedInUser() throws Exception {
		Gallery.ValidateGenesisKeyPageAsLoggedInUser();
	}


	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}

}
