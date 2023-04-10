package com.nft.learn;


import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.nft.broken_links.BrokenLinks;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.Locators;
import com.nft.qa.base.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


@Listeners({AllureListener.class})
public class learn_Docs extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	Actions actions = new Actions(driver);
	BrokenLinks brokenLinks = new BrokenLinks();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	
	public void NavigateToLearn_DocsPage() throws InterruptedException {
		Thread.sleep(2000);
		locators.NFTCom_Learn_Headeroption.click();
		Thread.sleep(2000);
		locators.NFTCom_Learn_Docs_DropwDownValue.click();
		Thread.sleep(3000);
		 String docsURL = driver.getCurrentUrl();
		 System.out.println(docsURL);
	    driver.switchTo().window(newTb.get(0));
	    System.out.println("Page title of new tab: " + driver.getTitle());
	    String DocsURL = driver.getCurrentUrl();
	    Assert.assertEquals(DocsURL, "https://docs.nft.com/overview/introducing-nft.com");
	    Assert.assertTrue(locators.IntroToNFTDoc.isDisplayed());
	    System.out.println("<<<<=====NFT.COM Docs Page loaded successfully.====>>>>");
	}

	
	public void ValidateLearn_DocsPage() throws InterruptedException {
		
		brokenLinks.ValidateTheBrokenLinks();
		//brokenLinks.ValidateAllBrokenImages();
		System.out.println("<---Broken Links Validated Successfully--->");
		Thread.sleep(2000);
		
		Assert.assertTrue(locators.Learn_DocsPage_Overview.isDisplayed());
		Assert.assertTrue(locators.Learn_DocsPage_NFTProfiles.isDisplayed());
		Assert.assertTrue(locators.Learn_DocsPage_NFTTrading.isDisplayed());
		Assert.assertTrue(locators.Learn_DocsPage_GenesisKeys.isDisplayed());
		Assert.assertTrue(locators.Learn_DocsPage_Discover.isDisplayed());
		Assert.assertTrue(locators.Learn_DocsPage_Pricing.isDisplayed());
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider.isDisplayed());
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider.isDisplayed());
		
		String Learn_DocsPage_DocDescription = locators.Learn_DocsPage_DocDescription.getText();
		Assert.assertTrue(locators.Learn_DocsPage_DocDescription.isDisplayed());
		System.out.println("Displayed Page description is====>> " + Learn_DocsPage_DocDescription);
	
		locators.Learn_DocsPage_ProfileCreation.click();
		Thread.sleep(2000);
		String Learn_DocsPage_PageTitle = locators.Learn_DocsPage_PageTitle.getText();
		Assert.assertTrue(locators.Learn_DocsPage_PageTitle.isDisplayed());
		System.out.println("Displayed Page title is====>> " + Learn_DocsPage_PageTitle);
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
		Thread.sleep(2000);
	}}