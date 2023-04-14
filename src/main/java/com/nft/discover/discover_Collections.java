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
	int expectedNFTcardlist = 8;
	int expectedNFTcardlist_afterLoadMore = 16;
	
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
	
	public void VerifyCollectionDetailsPage() throws InterruptedException {
		executor.executeScript("window.scrollBy(0,-450)", "");
		Thread.sleep(1500);
		executor.executeScript("arguments[0].click();", locators.DiscoverCollectionsPage_CollectionCard);
		Thread.sleep(8000);
		
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_BannerImage.isDisplayed());
		
		String DiscoverCollectionsDetailPage_CollectionName = locators.DiscoverCollectionsDetailPage_CollectionName.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_CollectionName.isDisplayed());
		System.out.println("Collection name is====>> " + DiscoverCollectionsDetailPage_CollectionName);
		
		String DiscoverCollectionsDetailPage_CollectionCreator = locators.DiscoverCollectionsDetailPage_CollectionCreator.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_CollectionCreator.isDisplayed());
		System.out.println("Collection creator is====>> " + DiscoverCollectionsDetailPage_CollectionCreator);
		
		String DiscoverCollectionsDetailPage_CollectionCreatorWalletAddress = locators.DiscoverCollectionsDetailPage_CollectionCreatorWalletAddress.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_CollectionCreatorWalletAddress.isDisplayed());
		System.out.println("Collection creator wallet address is====>> " + DiscoverCollectionsDetailPage_CollectionCreatorWalletAddress);
		
		String DiscoverCollectionsDetailPage_ContractAddress = locators.DiscoverCollectionsDetailPage_ContractAddress.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_ContractAddress.isDisplayed());
		System.out.println("Collection contract address is====>> " + DiscoverCollectionsDetailPage_ContractAddress);
		
		String DiscoverCollectionsDetailPage_ContractWalletAddress = locators.DiscoverCollectionsDetailPage_ContractWalletAddress.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_ContractWalletAddress.isDisplayed());
		System.out.println("Collection contract wallet address is====>> " + DiscoverCollectionsDetailPage_ContractWalletAddress);
		
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_Description.isDisplayed());
	
		String DiscoverCollectionsDetailPage_DescriptionValue = locators.DiscoverCollectionsDetailPage_DescriptionValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_DescriptionValue.isDisplayed());
		System.out.println("Collection Description is====>> " + DiscoverCollectionsDetailPage_DescriptionValue);
		
		String DiscoverCollectionsDetailPage_Floor = locators.DiscoverCollectionsDetailPage_Floor.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_Floor.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_Floor);
		
		String DiscoverCollectionsDetailPage_FloorValue = locators.DiscoverCollectionsDetailPage_FloorValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_FloorValue.isDisplayed());
		System.out.println("Collection floor value is====>> " + DiscoverCollectionsDetailPage_FloorValue);
		
		String DiscoverCollectionsDetailPage_TotalVol = locators.DiscoverCollectionsDetailPage_TotalVol.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_TotalVol.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_TotalVol);
		
		String DiscoverCollectionsDetailPage_TotalVolValue = locators.DiscoverCollectionsDetailPage_TotalVolValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_TotalVolValue.isDisplayed());
		System.out.println("Collection total vol value is====>> " + DiscoverCollectionsDetailPage_TotalVolValue);
		
		String DiscoverCollectionsDetailPage_Supply = locators.DiscoverCollectionsDetailPage_Supply.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_Supply.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_Supply);
		
		String DiscoverCollectionsDetailPage_SupplyValue = locators.DiscoverCollectionsDetailPage_SupplyValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SupplyValue.isDisplayed());
		System.out.println("Collection Supply value is====>> " + DiscoverCollectionsDetailPage_SupplyValue);
		
		String DiscoverCollectionsDetailPage_Owners = locators.DiscoverCollectionsDetailPage_Owners.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_Owners.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_Owners);
		
		String DiscoverCollectionsDetailPage_OwnersValue = locators.DiscoverCollectionsDetailPage_OwnersValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_OwnersValue.isDisplayed());
		System.out.println("Collection owner value is====>> " + DiscoverCollectionsDetailPage_OwnersValue);
		

		String DiscoverCollectionsDetailPage_SORatio = locators.DiscoverCollectionsDetailPage_SORatio.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SORatio.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_SORatio);
		
		String DiscoverCollectionsDetailPage_SORatioValue = locators.DiscoverCollectionsDetailPage_SORatioValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SORatioValue.isDisplayed());
		System.out.println("Collection S/O Ratio value is====>> " + DiscoverCollectionsDetailPage_SORatioValue);
		
		String DiscoverCollectionsDetailPage_MKTCap = locators.DiscoverCollectionsDetailPage_MKTCap.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_MKTCap.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_MKTCap);
		
		String DiscoverCollectionsDetailPage_MKTCapValue = locators.DiscoverCollectionsDetailPage_MKTCapValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_MKTCapValue.isDisplayed());
		System.out.println("Collection MKT cap value is====>> " + DiscoverCollectionsDetailPage_MKTCapValue);
		
		String DiscoverCollectionsDetailPage_AvgPrice = locators.DiscoverCollectionsDetailPage_AvgPrice.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_AvgPrice.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_AvgPrice);
		
		String DiscoverCollectionsDetailPage_AvgPriceValue = locators.DiscoverCollectionsDetailPage_AvgPriceValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_AvgPriceValue.isDisplayed());
		System.out.println("Collection AvgPrice value is====>> " + DiscoverCollectionsDetailPage_AvgPriceValue);
		
		String DiscoverCollectionsDetailPage_Type = locators.DiscoverCollectionsDetailPage_Type.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_Type.isDisplayed());
		System.out.println("Collection data table name is====>> " + DiscoverCollectionsDetailPage_Type);
		
		String DiscoverCollectionsDetailPage_TypeValue = locators.DiscoverCollectionsDetailPage_TypeValue.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_TypeValue.isDisplayed());
		System.out.println("Collection type value is====>> " + DiscoverCollectionsDetailPage_TypeValue);
		
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_FilterOption.isDisplayed());
		
		String DiscoverCollectionsDetailPage_NFTsListView = locators.DiscoverCollectionsDetailPage_NFTsListView.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_NFTsListView.isDisplayed());
		System.out.println("Collection list view is for ====>> " + DiscoverCollectionsDetailPage_NFTsListView);
		
		String DiscoverCollectionsDetailPage_ActivitiesListView = locators.DiscoverCollectionsDetailPage_ActivitiesListView.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_ActivitiesListView.isDisplayed());
		System.out.println("Collection list view is for ====>> " + DiscoverCollectionsDetailPage_ActivitiesListView);
		
		String DiscoverCollectionsDetailPage_TotalNFTsCount = locators.DiscoverCollectionsDetailPage_TotalNFTsCount.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_TotalNFTsCount.isDisplayed());
		System.out.println("Total listed NFT under this collection is ====>> " + DiscoverCollectionsDetailPage_TotalNFTsCount);
		
		List<WebElement> DiscoverCollectionsDetailPage_TotalNFTsCardCount = locators.DiscoverCollectionsDetailPage_TotalNFTsCardCount;
		System.out.println("No of cards are : " + DiscoverCollectionsDetailPage_TotalNFTsCardCount.size());
		for (int j = 0; j < DiscoverCollectionsDetailPage_TotalNFTsCardCount.size(); j++) {
			int ProfilesPage_Leaderboard_DisplayedResults = DiscoverCollectionsDetailPage_TotalNFTsCardCount.size();
			//System.out.println("Profile card count is ==> " +ProfilesPage_Leaderboard_DisplayedResults);
			Assert.assertEquals(ProfilesPage_Leaderboard_DisplayedResults, expectedNFTcardlist);
		}
		
		locators.DiscoverCollectionsDetailPage_LoadMorebutton.click();
		Thread.sleep(3000);
		
		List<WebElement> DiscoverCollectionsDetailPage_TotalNFTsCardCounts = locators.DiscoverCollectionsDetailPage_TotalNFTsCardCount;
		System.out.println("No of cards are : " + DiscoverCollectionsDetailPage_TotalNFTsCardCounts.size());
		for (int j = 0; j < DiscoverCollectionsDetailPage_TotalNFTsCardCounts.size(); j++) {
			int ProfilesPage_Leaderboard_DisplayedResult = DiscoverCollectionsDetailPage_TotalNFTsCardCounts.size();
			//System.out.println("Profile card count is ==> " +ProfilesPage_Leaderboard_DisplayedResults);
			Assert.assertEquals(ProfilesPage_Leaderboard_DisplayedResult, expectedNFTcardlist_afterLoadMore);
		}
		
		//locators.DiscoverCollectionsDetailPage_FilterOption.click();
		executor.executeScript("arguments[0].click();", locators.DiscoverCollectionsDetailPage_FilterOption);
		
		Thread.sleep(2000);
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SearchForNFTs.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SearchForNFTs_SearchField.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SearchForNFTs_ClearFilter.isDisplayed());
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SearchForNFTs_CloseFilter.isDisplayed());
		
		locators.DiscoverCollectionsDetailPage_SearchForNFTs_SearchField.sendKeys("9999");
		Thread.sleep(2000);
		String DiscoverCollectionsDetailPage_SearchForNFTs_CardName = locators.DiscoverCollectionsDetailPage_SearchForNFTs_CardName.getText();
		Assert.assertTrue(locators.DiscoverCollectionsDetailPage_SearchForNFTs_CardName.isDisplayed());
		System.out.println("Collection list view is for ====>> " + DiscoverCollectionsDetailPage_SearchForNFTs_CardName);
		
		Assert.assertTrue(DiscoverCollectionsDetailPage_SearchForNFTs_CardName.contains("9"));
		
		
		locators.DiscoverCollectionsDetailPage_SearchForNFTs_ClearFilter.click();
		Thread.sleep(2000);
		locators.DiscoverCollectionsDetailPage_SearchForNFTs_CloseFilter.click();
		Thread.sleep(2000);
		System.out.println("*****Filter closed successfully*****");
	}

	

}
