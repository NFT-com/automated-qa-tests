package com.nft.discover;


import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.nft.broken_links.BrokenLinks;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.Locators;
import com.nft.qa.base.TestBase;
import org.openqa.selenium.interactions.Actions;



@Listeners({AllureListener.class})
public class discover_NFTs extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	BrokenLinks brokenLinks = new BrokenLinks();
	
	public void NavigateToDiscover_NFTsPage() throws InterruptedException {
		Thread.sleep(2000);
		locators.NFTCom_Discover_Headeroption.click();
		Thread.sleep(2000);
		locators.NFTCom_Discover_NFTs_DropwDownValue.click();
		Thread.sleep(3000);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.nft.com/app/discover/nfts");
		System.out.println("<<<<=====NFT.COM Discover NFTS Page loaded successfully.====>>>>");
	}

	
	public void ValidateDiscoverNFTsPage() throws InterruptedException {
		
		brokenLinks.ValidateAllBrokenImages();
		System.out.println("<---Displayed Images Validated Successfully--->");
		Thread.sleep(2000);
		
		String DiscoverNFTsPage_Title = locators.DiscoverPage_Title.getText();
		Assert.assertTrue(locators.DiscoverPage_Title.isDisplayed());
		System.out.println("Displayed title is====>> " + DiscoverNFTsPage_Title);
		
		Assert.assertTrue(locators.DiscoverPage_GlobalSearchField.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTs.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Collections.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Profiles.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters.isDisplayed());
		Thread.sleep(1500);
		if(locators.DiscoverNFTsPage_Filters_Marketplace.isDisplayed()) {
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Status.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_NFTType.isDisplayed());
		}
		else {
			locators.DiscoverNFTsPage_Filters.click();
			Thread.sleep(2000);
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Status.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price.isDisplayed());
			Assert.assertTrue(locators.DiscoverNFTsPage_Filters_NFTType.isDisplayed());
		}
		
		locators.DiscoverNFTsPage_Filters_Marketplace.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_OpenSea.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_LooksRare.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_X2Y2.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_NFTcom.isDisplayed());
		System.out.println("<<<<=====NFTs Marketplace filter verified successfully====>>>>");
		
		
		locators.DiscoverNFTsPage_Filters_Status.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Status_BuyNow.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Status_New.isDisplayed());
		System.out.println("<<<<=====NFTs Status filter verified successfully====>>>>");
		
		executor.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1500);
		locators.DiscoverNFTsPage_Filters_Price.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_Min.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_Max.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_DefaultETHValue.isDisplayed());
		locators.DiscoverNFTsPage_Filters_Price_DefaultETHValue.click();
		Thread.sleep(1000);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_ETH.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_WETH.isDisplayed());
		locators.DiscoverNFTsPage_Filters_Price_DefaultETHValue.click();
		Thread.sleep(1000);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Price_ApplyButton.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_NFTcom.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_Marketplace_NFTcom.isDisplayed());
		System.out.println("<<<<=====NFTs Price filter verified successfully====>>>>");
		
		executor.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1500);
		locators.DiscoverNFTsPage_Filters_NFTType.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_NFTType_ERC721.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_NFTType_ERC1155.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_Filters_NFTType_CRYPTO_PUNKS.isDisplayed());
		System.out.println("<<<<=====NFTs NFT type filter verified successfully====>>>>");
		
		Assert.assertTrue(locators.DiscoverNFTsPage_DisplayedNFTs.isDisplayed());
		System.out.println("<<<<=====NFT Card is displayed on NFTs Page====>>>>");
		
		List<WebElement> NFTCards = locators.DiscoverNFTsPage_DisplayedListOfNFTs;
		System.out.println("No of NFT cards are : " + NFTCards.size());
		/*
		 * for (int j = 0; j < NFTCards.size(); j++) {
		 * Assert.assertEquals(NFTCards.size(), "15"); }
		 */
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",locators.DiscoverNFTsPage_LoadMoreButton);
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverNFTsPage_LoadMoreButton.isDisplayed());
		System.out.println("<<<<=====Load More Button is displayed on NFTs Page====>>>>");
	}

	public void VerifyNFTdetailspage() throws InterruptedException {
		executor.executeScript("window.scrollBy(0,-150)", "");
		Thread.sleep(1500);
		locators.DiscoverNFTsPage_NFTCard.click();
		Thread.sleep(3000);
		
		
	}
	

}
