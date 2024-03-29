package com.nft.home_page;

import java.util.List;
import org.openqa.selenium.WebElement;
import com.nft.qa.base.Locators;
import com.nft.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class homepage extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	
	public void NavigateToNFT() {

		System.out.println("<<<<=====NFT.COM loaded successfully.====>>>>");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}

	public void ValidateNFTLogoImage() {
		Assert.assertTrue(locators.NFTCom_LogoImage.isDisplayed());
		Assert.assertTrue(locators.NFTCom_LogowithName.isDisplayed());
	}

	public void ValidateNFTcomHeaderOptions() {
		String DiscoverheaderOption = locators.NFTCom_Discover_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_Discover_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + DiscoverheaderOption);

		String NFTCom_Gallery_Headeroption = locators.NFTCom_Gallery_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_Gallery_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + NFTCom_Gallery_Headeroption);

		String NFTCom_Learn_Headeroption = locators.NFTCom_Learn_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_Learn_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + NFTCom_Learn_Headeroption);

		String NFTCom_Search_Headeroption = locators.NFTCom_Search_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_Search_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + NFTCom_Search_Headeroption);

		String NFTCom_SignIn_Headeroption = locators.NFTCom_SignIn_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_SignIn_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + NFTCom_SignIn_Headeroption);

		String NFTCom_Cart_Headeroption = locators.NFTCom_Cart_Headeroption.getText();
		Assert.assertTrue(locators.NFTCom_Cart_Headeroption.isDisplayed());
		System.out.println("Displayed header Option is====>> " + NFTCom_Cart_Headeroption);
	}

	public void VerifyDiscoverHeaderDropDownoptions() {
		locators.NFTCom_Discover_Headeroption.click();

		String NFTCom_Discover_NFTs_DropwDownValue = locators.NFTCom_Discover_NFTs_DropwDownValue.getText();
		Assert.assertTrue(locators.NFTCom_Discover_NFTs_DropwDownValue.isDisplayed());
		System.out.println("Discover header dropwdown Option is====>> " + NFTCom_Discover_NFTs_DropwDownValue);

		String NFTCom_Discover_Collections_DropwDownValue = locators.NFTCom_Discover_Collections_DropwDownValue
				.getText();
		Assert.assertTrue(locators.NFTCom_Discover_Collections_DropwDownValue.isDisplayed());
		System.out.println("Discover header dropwdown Option is====>> " + NFTCom_Discover_Collections_DropwDownValue);

		String NFTCom_Discover_Profiles_DropwDownValue = locators.NFTCom_Discover_Profiles_DropwDownValue.getText();
		Assert.assertTrue(locators.NFTCom_Discover_Profiles_DropwDownValue.isDisplayed());
		System.out.println("Discover header dropwdown Option is====>> " + NFTCom_Discover_Profiles_DropwDownValue);

	}

	public void VerifyLearnHeaderDropDownoptions() throws InterruptedException {
		Thread.sleep(1000);
		locators.NFTCom_Learn_Headeroption.click();

		String NFTCom_Learn_Docs_DropwDownValue = locators.NFTCom_Learn_Docs_DropwDownValue.getText();
		Assert.assertTrue(locators.NFTCom_Learn_Docs_DropwDownValue.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + NFTCom_Learn_Docs_DropwDownValue);

		String NFTCom_Learn_Blog_DropwDownValue = locators.NFTCom_Learn_Blog_DropwDownValue.getText();
		Assert.assertTrue(locators.NFTCom_Learn_Blog_DropwDownValue.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + NFTCom_Learn_Blog_DropwDownValue);
	}

	public void VerifySearchFieldResponse() throws InterruptedException {
		locators.NFTCom_Search_Headeroption.click();
		Thread.sleep(1000);
		locators.NFTCom_Search_Headeroption.sendKeys("Doodle");
		Thread.sleep(4000);
		
		String SearchedResult_Suggested_CollectionCount = locators.SearchedResult_Suggested_CollectionCount.getText();
		Assert.assertTrue(locators.SearchedResult_Suggested_CollectionCount.isDisplayed());
		System.out.println("Found Collections count is====>> " + SearchedResult_Suggested_CollectionCount);
	
		Assert.assertTrue(locators.SearchedResult_Suggested_Collection_SellAllButton.isDisplayed());
		
		String SearchedResult_Suggested_NFTsCount = locators.SearchedResult_Suggested_NFTsCount.getText();
		Assert.assertTrue(locators.SearchedResult_Suggested_NFTsCount.isDisplayed());
		System.out.println("Found NFTs count is====>> " + SearchedResult_Suggested_NFTsCount);
	
		Assert.assertTrue(locators.SearchedResult_Suggested_NFTs_SeeAllButton.isDisplayed());
		Assert.assertTrue(locators.SearchedResult_Suggested_Collection.isDisplayed());
		Assert.assertTrue(locators.SearchedResult_Suggested_NFT.isDisplayed());
		
		System.out.println("----------------------Found Collection results----------------------------------------");
		List<WebElement> Collection = locators.SearchedResult_Suggested_Collections;
		System.out.println("No of cols are : " + Collection.size());
		for (int j = 0; j < Collection.size(); j++) {
			System.out.println(Collection.get(j).getText());
			Assert.assertTrue(locators.SearchedResult_Suggested_Collections.contains("Doo".equalsIgnoreCase("doo")));
		}
		
		System.out.println("----------------------Found NFT results----------------------------------------");
		List<WebElement> NFT = locators.SearchedResult_Suggested_NFTs;
		System.out.println("No of cols are : " + NFT.size());
		for (int j = 0; j < NFT.size(); j++) {
			System.out.println(NFT.get(j).getText());
			//Assert.assertTrue(locators.SearchedResult_Suggested_NFTs.contains("Doo".equalsIgnoreCase("doo")));
		}
	
		locators.NFTCom_Search_Headeroption.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String SearchedResultURL = driver.getCurrentUrl();
		Assert.assertEquals(SearchedResultURL, "https://www.nft.com/app/search/Doodle");
		
		locators.NFTCom_LogoImage.click();
		String HomePageURL = driver.getCurrentUrl();
		Assert.assertEquals(HomePageURL, "https://www.nft.com/");
	}

	public void VerifySignInResponse() throws InterruptedException {
		locators.NFTCom_SignIn_Headeroption.click();
		Thread.sleep(1000);
		locators.Close_SignIn_PopUpWindow.click();
		Thread.sleep(1000);
	}

	public void VerifyCartheaderOption() throws InterruptedException {
		locators.NFTCom_Cart_Headeroption.click();
		Thread.sleep(1000);

		String Cart_MyCartWindow = locators.Cart_MyCartWindow.getText();
		Assert.assertTrue(locators.Cart_MyCartWindow.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + Cart_MyCartWindow);

		String Cart_BuySection = locators.Cart_BuySection.getText();
		Assert.assertTrue(locators.Cart_BuySection.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + Cart_BuySection);

		String Cart_SellSection = locators.Cart_SellSection.getText();
		Assert.assertTrue(locators.Cart_SellSection.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + Cart_SellSection);

		String Cart_ItemsCount = locators.Cart_ItemsCount.getText();
		Assert.assertTrue(locators.Cart_ItemsCount.isDisplayed());
		System.out.println("Learn header dropwdown Option is====>> " + Cart_ItemsCount);

		Assert.assertTrue(locators.Cart_WindowCrossIcon.isDisplayed());
		locators.Cart_WindowCrossIcon.click();
		Thread.sleep(1000);
	}

	public void VerifyClickonCreateAProfileButton() throws InterruptedException {

		locators.CreateAProfileButtonOnBannerSection.click();
		Thread.sleep(1000);
		String MintProfileURL = driver.getCurrentUrl();
		System.out.println("Current Redirected URL is ===>> " + MintProfileURL);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		locators.CreateAProfileButtonOnNFTMarketplaceSection.click();
		Thread.sleep(1000);
		String MintProfileURL2 = driver.getCurrentUrl();
		System.out.println("Current Redirected URL is ===>> " + MintProfileURL2);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",locators.CreateAProfileButtonAboveTheFooterSection);
		Thread.sleep(1500);
		executor.executeScript("arguments[0].click();", locators.CreateAProfileButtonAboveTheFooterSection);
		Thread.sleep(1000);
		String MintProfileURL3 = driver.getCurrentUrl();
		System.out.println("Current Redirected URL is ===>> " + MintProfileURL3);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void VerifyHomePageSections() {
		String TheSocialNFTMarketplaceSection = locators.TheSocialNFTMarketplaceSection.getText();
		Assert.assertTrue(locators.TheSocialNFTMarketplaceSection.isDisplayed());
		System.out.println("Displayed Value is====>> " + TheSocialNFTMarketplaceSection);

		String SocialIdentitySection = locators.SocialIdentitySection.getText();
		Assert.assertTrue(locators.SocialIdentitySection.isDisplayed());
		System.out.println("Displayed Value is====>> " + SocialIdentitySection);

		String TheNFTComMarketplaceSection = locators.TheNFTComMarketplaceSection.getText();
		Assert.assertTrue(locators.TheNFTComMarketplaceSection.isDisplayed());
		System.out.println("Displayed Value is====>> " + TheNFTComMarketplaceSection);

		String DiscoverANewWorldSection = locators.DiscoverANewWorldSection.getText();
		Assert.assertTrue(locators.DiscoverANewWorldSection.isDisplayed());
		System.out.println("Displayed Value is====>> " + DiscoverANewWorldSection);

		String GettingStartedSection = locators.GettingStartedSection.getText();
		Assert.assertTrue(locators.GettingStartedSection.isDisplayed());
		System.out.println("Displayed Value is====>> " + GettingStartedSection);

		String GettingStartedSection_CreateYourProfile = locators.GettingStartedSection_CreateYourProfile.getText();
		Assert.assertTrue(locators.GettingStartedSection_CreateYourProfile.isDisplayed());
		System.out.println("Displayed Value is====>> " + GettingStartedSection_CreateYourProfile);

		String GettingStartedSection_PayNoFees = locators.GettingStartedSection_PayNoFees.getText();
		Assert.assertTrue(locators.GettingStartedSection_PayNoFees.isDisplayed());
		System.out.println("Displayed Value is====>> " + GettingStartedSection_PayNoFees);

		String GettingStartedSection_DisplayYourWay = locators.GettingStartedSection_DisplayYourWay.getText();
		Assert.assertTrue(locators.GettingStartedSection_DisplayYourWay.isDisplayed());
		System.out.println("Displayed Value is====>> " + GettingStartedSection_DisplayYourWay);

		String NFTProfileLeaderboardSection = locators.NFTProfileLeaderboardSection.getText();
		Assert.assertTrue(locators.NFTProfileLeaderboardSection.isDisplayed());
		System.out.println("Displayed Value is====>> " + NFTProfileLeaderboardSection);

		String NFTProfileLeaderboardSection_Profile = locators.NFTProfileLeaderboardSection_Profile.getText();
		Assert.assertTrue(locators.NFTProfileLeaderboardSection_Profile.isDisplayed());
		System.out.println("Displayed table header coloumn 1 is====>> " + NFTProfileLeaderboardSection_Profile);

		String NFTProfileLeaderboardSection_NumberOfGK = locators.NFTProfileLeaderboardSection_NumberOfGK.getText();
		Assert.assertTrue(locators.NFTProfileLeaderboardSection_NumberOfGK.isDisplayed());
		System.out.println("Displayed table header coloumn 2 is====>> " + NFTProfileLeaderboardSection_NumberOfGK);

		String NFTProfileLeaderboardSection_NumberOfNFTCollections = locators.NFTProfileLeaderboardSection_NumberOfNFTCollections
				.getText();
		Assert.assertTrue(locators.NFTProfileLeaderboardSection_NumberOfNFTCollections.isDisplayed());
		System.out.println(
				"Displayed table header coloumn 3 is====>> " + NFTProfileLeaderboardSection_NumberOfNFTCollections);

		String NFTProfileLeaderboardSection_ItemsCollected = locators.NFTProfileLeaderboardSection_ItemsCollected
				.getText();
		Assert.assertTrue(locators.NFTProfileLeaderboardSection_ItemsCollected.isDisplayed());
		System.out.println("Displayed table header coloumn 4 is====>> " + NFTProfileLeaderboardSection_ItemsCollected);

		System.out.println("----------------------Headers----------------------------------------");
		List<WebElement> colheader = locators.NFTProfileLeaderboardtable_headers;
		System.out.println("No of cols are : " + colheader.size());
		for (int j = 0; j < colheader.size(); j++) {
			System.out.println(colheader.get(j).getText());
		}

		System.out.println("----------------------Column 1 Value----------------------------------------");
		List<WebElement> col1 = locators.NFTProfileLeaderboardtable_Column1Value;
		System.out.println("No of cols are : " + col1.size());
		for (int j = 0; j < col1.size(); j++) {
			System.out.println(col1.get(j).getText());
		}

		System.out.println("----------------------Column 2 Value----------------------------------------");
		List<WebElement> col2 = locators.NFTProfileLeaderboardtable_Column2Value;
		System.out.println("No of cols are : " + col2.size());
		for (int j = 0; j < col2.size(); j++) {
			System.out.println(col2.get(j).getText());
		}

		System.out.println("----------------------Column 3 Value----------------------------------------");
		List<WebElement> col3 = locators.NFTProfileLeaderboardtable_Column3Value;
		System.out.println("No of cols are : " + col3.size());
		for (int j = 0; j < col3.size(); j++) {
			System.out.println(col3.get(j).getText());
		}

		System.out.println("----------------------Column 4 Value----------------------------------------");
		List<WebElement> col4 = locators.NFTProfileLeaderboardtable_Column4Value;
		System.out.println("No of cols are : " + col4.size());
		for (int j = 0; j < col4.size(); j++) {
			System.out.println(col4.get(j).getText());
		}

		System.out.println("----------------------Column 5 Value----------------------------------------");
		List<WebElement> col5 = locators.NFTProfileLeaderboardtable_Column5Value;
		System.out.println("No of cols are : " + col5.size());
		for (int j = 0; j < col5.size(); j++) {
			System.out.println(col5.get(j).getText());
		}

		System.out.println("----------------------Column 6 Value----------------------------------------");
		List<WebElement> col6 = locators.NFTProfileLeaderboardtable_Column6Value;
		System.out.println("No of cols are : " + col6.size());
		for (int j = 0; j < col6.size(); j++) {
			System.out.println(col6.get(j).getText());
		}

		System.out.println("----------------------Column 7 Value----------------------------------------");
		List<WebElement> col7 = locators.NFTProfileLeaderboardtable_Column7Value;
		System.out.println("No of cols are : " + col7.size());
		for (int j = 0; j < col7.size(); j++) {
			System.out.println(col7.get(j).getText());
		}

		System.out.println("----------------------Column 8 Value----------------------------------------");
		List<WebElement> col8 = locators.NFTProfileLeaderboardtable_Column8Value;
		System.out.println("No of cols are : " + col8.size());
		for (int j = 0; j < col8.size(); j++) {
			System.out.println(col8.get(j).getText());
		}

		System.out.println("----------------------Column 9 Value----------------------------------------");
		List<WebElement> col9 = locators.NFTProfileLeaderboardtable_Column9Value;
		System.out.println("No of cols are : " + col9.size());
		for (int j = 0; j < col9.size(); j++) {
			System.out.println(col9.get(j).getText());
		}

		System.out.println("----------------------Column 10 Value----------------------------------------");
		List<WebElement> col10 = locators.NFTProfileLeaderboardtable_Column10Value;
		System.out.println("No of cols are : " + col10.size());
		for (int j = 0; j < col10.size(); j++) {
			System.out.println(col10.get(j).getText());
		}
		System.out.println("--------------------------------------------------------------");

		String NewsSection = locators.NewsSection.getText();
		Assert.assertTrue(locators.NewsSection.isDisplayed());
		System.out.println("Displayed Section is====>> " + NewsSection);

		String NewsSection_ReadOurBlogs = locators.NewsSection_ReadOurBlogs.getText();
		Assert.assertTrue(locators.NewsSection_ReadOurBlogs.isDisplayed());
		System.out.println("Displayed Section is====>> " + NewsSection_ReadOurBlogs);

		String BuildYourNFTProfileSection = locators.BuildYourNFTProfileSection.getText();
		Assert.assertTrue(locators.BuildYourNFTProfileSection.isDisplayed());
		System.out.println("Displayed Section is====>> " + BuildYourNFTProfileSection);

		String FooterSection_Learn = locators.FooterSection_Learn.getText();
		Assert.assertTrue(locators.FooterSection_Learn.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Learn);

		String FooterSection_Resources = locators.FooterSection_Resources.getText();
		Assert.assertTrue(locators.FooterSection_Resources.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Resources);

		String FooterSection_Policies = locators.FooterSection_Policies.getText();
		Assert.assertTrue(locators.FooterSection_Policies.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Policies);

		String FooterSection_Learn_Gallery = locators.FooterSection_Learn_Gallery.getText();
		Assert.assertTrue(locators.FooterSection_Learn_Gallery.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Learn_Gallery);

		String FooterSection_Learn_Docs = locators.FooterSection_Learn_Docs.getText();
		Assert.assertTrue(locators.FooterSection_Learn_Docs.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Learn_Docs);

		String FooterSection_Learn_Blog = locators.FooterSection_Learn_Blog.getText();
		Assert.assertTrue(locators.FooterSection_Learn_Blog.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Learn_Blog);

		String FooterSection_Learn_WhatIsAnNFT = locators.FooterSection_Learn_WhatIsAnNFT.getText();
		Assert.assertTrue(locators.FooterSection_Learn_WhatIsAnNFT.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Learn_WhatIsAnNFT);

		String FooterSection_Resources_Support = locators.FooterSection_Resources_Support.getText();
		Assert.assertTrue(locators.FooterSection_Resources_Support.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Resources_Support);

		String FooterSection_Resources_Careers = locators.FooterSection_Resources_Careers.getText();
		Assert.assertTrue(locators.FooterSection_Resources_Careers.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Resources_Careers);

		String FooterSection_Resources_BI = locators.FooterSection_Resources_BI.getText();
		Assert.assertTrue(locators.FooterSection_Resources_BI.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Resources_BI);

		String FooterSection_Policies_TOS = locators.FooterSection_Policies_TOS.getText();
		Assert.assertTrue(locators.FooterSection_Policies_TOS.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Policies_TOS);

		String FooterSection_Policies_PP = locators.FooterSection_Policies_PP.getText();
		Assert.assertTrue(locators.FooterSection_Policies_PP.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Policies_PP);

		String FooterSection_Policies_BB = locators.FooterSection_Policies_BB.getText();
		Assert.assertTrue(locators.FooterSection_Policies_BB.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_Policies_BB);

		String FooterSection_SubscribeToOurNotifications = locators.FooterSection_SubscribeToOurNotifications.getText();
		Assert.assertTrue(locators.FooterSection_SubscribeToOurNotifications.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_SubscribeToOurNotifications);

		String FooterSection_SubscribeButton = locators.FooterSection_SubscribeButton.getText();
		Assert.assertTrue(locators.FooterSection_SubscribeButton.isDisplayed());
		System.out.println("Displayed footer Section is====>> " + FooterSection_SubscribeButton);

		Assert.assertTrue(locators.FooterSection_EmailInputField.isDisplayed());

		Assert.assertTrue(locators.FooterSection_Discord.isDisplayed());

		Assert.assertTrue(locators.FooterSection_Twitter.isDisplayed());

		Assert.assertTrue(locators.FooterSection_NFTcom.isDisplayed());

	}
	
	public void VerifyConnectWalletScreen() throws InterruptedException {
		
		locators.NFTCom_SignIn_Headeroption.click();
		Thread.sleep(1000);
		Assert.assertTrue(locators.ConnectWalletPopUpWindow.isDisplayed());
		Assert.assertTrue(locators.ConnectAWalletHeader.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Recommended.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Recommended_MetaMask.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Recommended_Rainbow.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others_Coinbase.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others_WalletConnect.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others_TrustWallet.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others_LedgerLive.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_Others_Argent.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_WhatAWallet.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_HomeForDA.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_NewWayToLogIn.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_GetAWallet.isDisplayed());
		Assert.assertTrue(locators.ConnectAWallet_LearnMore.isDisplayed());
	
		locators.Close_SignIn_PopUpWindow.click();
		Thread.sleep(1000);
	}

}
