package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.learn.learn_Docs;


@Listeners({AllureListener.class})
public class Learn_DocsPage_Test extends TestBase {
	learn_Docs Learn_Docs;

	public Learn_DocsPage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		initialization();
		Learn_Docs = new learn_Docs();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToLearn_DocsPage() throws Exception {
		Thread.sleep(3000);
		Learn_Docs.NavigateToLearn_DocsPage();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateLearn_DocsPage() throws Exception {
		Learn_Docs.ValidateLearn_DocsPage();
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
