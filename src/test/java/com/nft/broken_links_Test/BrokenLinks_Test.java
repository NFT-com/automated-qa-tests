package com.nft.broken_links_Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.broken_links.BrokenLinks;


@Listeners({AllureListener.class})
public class BrokenLinks_Test  extends TestBase{
	BrokenLinks brokenLinks;
	
	public BrokenLinks_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() throws InterruptedException {
		initialization();
		brokenLinks = new BrokenLinks();
	}

	@Test(groups = {"regression"}, priority = 1)
	public void GetAllURLs() throws Exception {
		brokenLinks.GetAllURLs();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateTheBrokenLinks() throws Exception {
		brokenLinks.ValidateTheBrokenLinks();
	}
	
	@Test(groups = {"regression"}, priority = 3)
	public void ValidateAllBrokenImages() throws Exception {
		brokenLinks.ValidateAllBrokenImages();
	}
	
}
