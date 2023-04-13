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
		executor.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(1500);
		//locators.DiscoverNFTsPage_NFTCard.click();
		executor.executeScript("arguments[0].click();", locators.DiscoverNFTsPage_NFTCard);
		Thread.sleep(8000);
		
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_NFTImage.isDisplayed());
		
		String DiscoverNFTsPage_NFTCardDetailPage_ProfileName = locators.DiscoverNFTsPage_NFTCardDetailPage_ProfileName.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_ProfileName.isDisplayed());
		System.out.println("NFT Profile name is====>> " + DiscoverNFTsPage_NFTCardDetailPage_ProfileName);
		
		String DiscoverNFTsPage_NFTCardDetailPage_NFTName = locators.DiscoverNFTsPage_NFTCardDetailPage_NFTName.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_NFTName.isDisplayed());
		System.out.println("NFT name is====>> " + DiscoverNFTsPage_NFTCardDetailPage_NFTName);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Creator = locators.DiscoverNFTsPage_NFTCardDetailPage_Creator.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Creator.isDisplayed());
		System.out.println("NFT Creator ====>> " + DiscoverNFTsPage_NFTCardDetailPage_Creator);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Owner = locators.DiscoverNFTsPage_NFTCardDetailPage_Owner.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Owner.isDisplayed());
		System.out.println("NFT owner is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Owner);
		
		String DiscoverNFTsPage_NFTCardDetailPage_CreatorName = locators.DiscoverNFTsPage_NFTCardDetailPage_CreatorName.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_CreatorName.isDisplayed());
		System.out.println("NFT Creator name is====>> " + DiscoverNFTsPage_NFTCardDetailPage_CreatorName);
		
		String DiscoverNFTsPage_NFTCardDetailPage_OwnerName = locators.DiscoverNFTsPage_NFTCardDetailPage_OwnerName.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_OwnerName.isDisplayed());
		System.out.println("NFT Owner name is====>> " + DiscoverNFTsPage_NFTCardDetailPage_OwnerName);
		
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Info.isDisplayed());
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Traits.isDisplayed());
		
		String DiscoverNFTsPage_NFTCardDetailPage_Description = locators.DiscoverNFTsPage_NFTCardDetailPage_Description.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Description.isDisplayed());
		System.out.println("NFT description is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Description);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Description_message = locators.DiscoverNFTsPage_NFTCardDetailPage_Description_message.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Description_message.isDisplayed());
		System.out.println("NFT Description message is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Description_message);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Contract = locators.DiscoverNFTsPage_NFTCardDetailPage_Contract.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Contract.isDisplayed());
		System.out.println("NFTcontract is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Contract);
		
		String DiscoverNFTsPage_NFTCardDetailPage_TokenID = locators.DiscoverNFTsPage_NFTCardDetailPage_TokenID.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_TokenID.isDisplayed());
		System.out.println("NFT token id is====>> " + DiscoverNFTsPage_NFTCardDetailPage_TokenID);
		
		String DiscoverNFTsPage_NFTCardDetailPage_TokenStandard = locators.DiscoverNFTsPage_NFTCardDetailPage_TokenStandard.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_TokenStandard.isDisplayed());
		System.out.println("NFT token standard is====>> " + DiscoverNFTsPage_NFTCardDetailPage_TokenStandard);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Blockchain = locators.DiscoverNFTsPage_NFTCardDetailPage_Blockchain.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Blockchain.isDisplayed());
		System.out.println("NFT blockchain is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Blockchain);
		

		String DiscoverNFTsPage_NFTCardDetailPage_ContractValue = locators.DiscoverNFTsPage_NFTCardDetailPage_ContractValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_ContractValue.isDisplayed());
		System.out.println("NFT contract value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_ContractValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_TokenIDValue = locators.DiscoverNFTsPage_NFTCardDetailPage_TokenIDValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_TokenIDValue.isDisplayed());
		System.out.println("NFT token id value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_TokenIDValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_TokenStndValue = locators.DiscoverNFTsPage_NFTCardDetailPage_TokenStndValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_TokenStndValue.isDisplayed());
		System.out.println("NFT token stnd value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_TokenStndValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_BlockchainValue = locators.DiscoverNFTsPage_NFTCardDetailPage_BlockchainValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_BlockchainValue.isDisplayed());
		System.out.println("NFT blockchain value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_BlockchainValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Pricedetail = locators.DiscoverNFTsPage_NFTCardDetailPage_Pricedetail.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Pricedetail.isDisplayed());
		System.out.println("NFT price detail is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Pricedetail);
		
		String DiscoverNFTsPage_NFTCardDetailPage_PriceValue = locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValue.isDisplayed());
		System.out.println("NFT price value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_PriceValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_PriceValue_EthOrWeth = locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValue_EthOrWeth.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValue_EthOrWeth.isDisplayed());
		System.out.println("NFT eth or weth detail is====>> " + DiscoverNFTsPage_NFTCardDetailPage_PriceValue_EthOrWeth);
		
		String DiscoverNFTsPage_NFTCardDetailPage_PriceValueInUSD = locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValueInUSD.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_PriceValueInUSD.isDisplayed());
		System.out.println("NFT price in USD is====>> " + DiscoverNFTsPage_NFTCardDetailPage_PriceValueInUSD);
		
		String DiscoverNFTsPage_NFTCardDetailPage_EndsIn = locators.DiscoverNFTsPage_NFTCardDetailPage_EndsIn.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_EndsIn.isDisplayed());
		System.out.println("NFT Ends In detail is====>> " + DiscoverNFTsPage_NFTCardDetailPage_EndsIn);
		
		String DiscoverNFTsPage_NFTCardDetailPage_EndsInDays = locators.DiscoverNFTsPage_NFTCardDetailPage_EndsInDays.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_EndsInDays.isDisplayed());
		System.out.println("NFT Ends In days is====>> " + DiscoverNFTsPage_NFTCardDetailPage_EndsInDays);
		
		String DiscoverNFTsPage_NFTCardDetailPage_ListedMarketPlaceValue = locators.DiscoverNFTsPage_NFTCardDetailPage_ListedMarketPlaceValue.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_ListedMarketPlaceValue.isDisplayed());
		System.out.println("NFT marketplace place value is====>> " + DiscoverNFTsPage_NFTCardDetailPage_ListedMarketPlaceValue);
		
		String DiscoverNFTsPage_NFTCardDetailPage_SelectListingORAddtoCart = locators.DiscoverNFTsPage_NFTCardDetailPage_SelectListingORAddtoCart.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_SelectListingORAddtoCart.isDisplayed());
		System.out.println("NFT Select Listing OR Add to Cart ====>> " + DiscoverNFTsPage_NFTCardDetailPage_SelectListingORAddtoCart);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Activities = locators.DiscoverNFTsPage_NFTCardDetailPage_Activities.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Activities.isDisplayed());
		System.out.println("NFT Activities is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Activities);
		
		String DiscoverNFTsPage_NFTCardDetailPage_Sales = locators.DiscoverNFTsPage_NFTCardDetailPage_Sales.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_Sales.isDisplayed());
		System.out.println("NFT Card details page is====>> " + DiscoverNFTsPage_NFTCardDetailPage_Sales);
		
		String DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection = locators.DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection.isDisplayed());
		System.out.println("NFT More from collection page is====>> " + DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection);
		
		/*String DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection_card = locators.DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection_card.getText();
		Assert.assertTrue(locators.DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection_card.isDisplayed());
		System.out.println("NFT More from collection card is====>> " + DiscoverNFTsPage_NFTCardDetailPage_MoreFromCollection_card);
		*/
		
	}
}
