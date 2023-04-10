package com.nfts.Page_Test;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;
import com.nft.learn.learn_Blogs;


@Listeners({AllureListener.class})
public class Learn_BlogPage_Test extends TestBase {
	learn_Blogs Learn_Blogs;

	public Learn_BlogPage_Test() {
		super();
	}

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		initialization();
		Learn_Blogs = new learn_Blogs();
	}

	@Test(groups = { "regression" }, priority = 1)
	public void NavigateToLearn_BlogPage() throws Exception {
		Thread.sleep(3000);
		Learn_Blogs.NavigateToLearn_BlogPage();
	}
	
	@Test(groups = {"regression"}, priority = 2)
	public void ValidateLearn_blogPage() throws Exception {
		Learn_Blogs.ValidateLearn_blogPage();
	}
	
	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
