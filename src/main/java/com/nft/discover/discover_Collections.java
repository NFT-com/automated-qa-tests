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
public class discover_Collections extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	BrokenLinks brokenLinks = new BrokenLinks();
	 
	
	public void NavigateToDiscover_CollectionsPage() throws InterruptedException {
		Thread.sleep(2000);
		locators.NFTCom_Discover_Headeroption.click();
		Thread.sleep(2000);
		locators.NFTCom_Discover_Collections_DropwDownValue.click();
		Thread.sleep(3000);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.nft.com/app/discover/collections");
		System.out.println("<<<<=====NFT.COM Discover Collections Page loaded successfully.====>>>>");
	}

	
	public void ValidateDiscoverCollectionsPage() throws InterruptedException {
		
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
		Assert.assertTrue(locators.DiscoverCollectionsPage_Leaderboard.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_ViewCollections.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_24hTimeStamp.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_7dayTimeStamp.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_30dayTimeStamp.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_AllTimeStamp.isDisplayed());
		
		String DiscoverCollectionsPage_LeaderBoardtableHeaders_COLLECTION = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_COLLECTION.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_COLLECTION.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_COLLECTION);

		String DiscoverCollectionsPage_LeaderBoardtableHeaders_VOLUME = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_VOLUME.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_VOLUME.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_VOLUME);

		String DiscoverCollectionsPage_LeaderBoardtableHeaders_CHANGE = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_CHANGE.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_CHANGE.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_CHANGE);

		String DiscoverCollectionsPage_LeaderBoardtableHeaders_FLOORPRICE = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_FLOORPRICE.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_FLOORPRICE.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_FLOORPRICE);

		String DiscoverCollectionsPage_LeaderBoardtableHeaders_ITEMS = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_ITEMS.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_ITEMS.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_ITEMS);

		String DiscoverCollectionsPage_LeaderBoardtableHeaders_SALES = locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_SALES.getText();
		Assert.assertTrue(locators.DiscoverCollectionsPage_LeaderBoardtableHeaders_SALES.isDisplayed());
		System.out.println("Displayed Header value is====>> " + DiscoverCollectionsPage_LeaderBoardtableHeaders_SALES);
		
		List<WebElement> DiscoverCollectionsPage_COLLECTIONList = locators.DiscoverCollectionsPage_COLLECTIONList;
		System.out.println("No of NFT cards are : " + DiscoverCollectionsPage_COLLECTIONList.size());
		  /*for (int j = 0; j < DiscoverCollectionsPage_COLLECTIONList.size(); j++) 
		  {
		  Assert.assertEquals(DiscoverCollectionsPage_COLLECTIONList.size(), "15"); 
		  }*/
		 
		Thread.sleep(2000);
		locators.DiscoverCollectionsPage_ViewCollections.click();
		Thread.sleep(3000);
		Assert.assertTrue(locators.DiscoverCollectionsPage_Showleaderboard.isDisplayed());
		
		if(locators.DiscoverCollectionsPage_Filters_FloorPrice.isDisplayed()) {
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_NFTType.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance.isDisplayed());
		}
		else {
			locators.DiscoverCollectionsPage_Filter.click();
			Thread.sleep(2000);
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_NFTType.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume.isDisplayed());
			Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance.isDisplayed());
		}
		Thread.sleep(2000);
		
		locators.DiscoverCollectionsPage_Filters_FloorPrice.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice_Min.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice_Max.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice_DefaultETHValue.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_FloorPrice_ApplyButton.isDisplayed());
		System.out.println("<<<<=====Collections floor price filter verified successfully====>>>>");
		
		
		locators.DiscoverCollectionsPage_Filters_NFTType.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_NFTType_ERC721.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_NFTType_ERC1155.isDisplayed());
		System.out.println("<<<<=====Collections NFTtype filter verified successfully====>>>>");
		
		
		executor.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1500);
		locators.DiscoverCollectionsPage_Filters_TradingVolume.click();
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume_Min.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume_Max.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume_DefaultETHValue.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_TradingVolume_ApplyButton.isDisplayed());
		System.out.println("<<<<=====Collections Trading Volume filter verified successfully====>>>>");
		
		
		executor.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1500);
		locators.DiscoverCollectionsPage_Filters_Issuance.click();
		Thread.sleep(1500);
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance_30days.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance_90days.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance_180days.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsPage_Filters_Issuance_1year.isDisplayed());
		System.out.println("<<<<=====Collections Issuance filter verified successfully====>>>>");
		
		Assert.assertTrue(locators.DiscoverCollectionsPage_DisplayedNFTs.isDisplayed());
		
		
		List<WebElement> DiscoverCollectionsPage_DisplayedListOfCollections = locators.DiscoverCollectionsPage_DisplayedListOfCollections;
		System.out.println("No of Collection cards are : " + DiscoverCollectionsPage_DisplayedListOfCollections.size());
		/*
		 * for (int j = 0; j < DiscoverCollectionsPage_DisplayedListOfCollections.size(); j++) {
		 * Assert.assertEquals(DiscoverCollectionsPage_DisplayedListOfCollections.size(), "15"); }
		 */
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",locators.DiscoverNFTsPage_LoadMoreButton);
		Thread.sleep(1500);
		Assert.assertTrue(locators.DiscoverCollectionsPage_LoadMoreButton.isDisplayed());
		System.out.println("<<<<=====Load More Button is displayed on Collections Page====>>>>");
		
		
	}

	

}
