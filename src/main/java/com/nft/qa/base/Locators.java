package com.nft.qa.base;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.nft.qa.Listeners.AllureListener;

@Listeners({AllureListener.class})
public class Locators extends TestBase{
	
	public Locators() {
	//this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//img[@src='https://cdn.nft.com/client/public/Logo.svg']")
	public  WebElement NFTCom_LogoImage;

	@FindBy(xpath = "//div[@class='flex items-center']")
	public WebElement NFTCom_LogowithName;

	@FindBy(xpath = "//a[contains(text(),'Discover')]")
	public WebElement NFTCom_Discover_Headeroption;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/nav/div[1]/div[2]/div[1]")
	public WebElement NFTCom_Discover_NFTs_DropwDownValue;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/header/div/div/div[1]/nav/div[1]/div[2]/div[2]")
	public WebElement NFTCom_Discover_Collections_DropwDownValue;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/header/div/div/div[1]/nav/div[1]/div[2]/div[3]")
	public WebElement NFTCom_Discover_Profiles_DropwDownValue;

	@FindBy(xpath = "(//a[contains(text(),'Gallery')])[1]")
	public WebElement NFTCom_Gallery_Headeroption;
	
	@FindBy(xpath = "//a[contains(text(),'Learn')]")
	public WebElement NFTCom_Learn_Headeroption;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/nav/div[2]/div[2]/div[1]")
	public WebElement NFTCom_Learn_Docs_DropwDownValue;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/nav/div[2]/div[2]/div[2]")
	public WebElement NFTCom_Learn_Blog_DropwDownValue;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement NFTCom_Search_Headeroption;
	
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	public WebElement NFTCom_SignIn_Headeroption;
	
	@FindBy(xpath = "//button[@aria-label='Close']")
	public WebElement Close_SignIn_PopUpWindow;
	
	@FindBy(xpath = "(//button/img[@alt='public/cart.svg'])[2]")
	public WebElement NFTCom_Cart_Headeroption;

	@FindBy(xpath = "//span[contains(text(),'My Cart')]")
	public WebElement Cart_MyCartWindow;
	
	@FindBy(xpath = "//span[contains(text(),'Buy')]")
	public WebElement Cart_BuySection;
	
	@FindBy(xpath = "//span[contains(text(),'Sell')]")
	public WebElement Cart_SellSection;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[3]")
	public WebElement Cart_ItemsCount;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div")
	public WebElement Cart_WindowCrossIcon;
	
	
	@FindBy(xpath = "(//a[contains(text(),'Create a Profile')])[1]")
	public WebElement CreateAProfileButtonOnBannerSection;
	
	@FindBy(xpath = "(//a[contains(text(),'Create a Profile')])[2]")
	public WebElement CreateAProfileButtonOnNFTMarketplaceSection;

	@FindBy(xpath = "(//a[contains(text(),'Create a Profile')])[3]")
	public WebElement CreateAProfileButtonAboveTheFooterSection;
	
	@FindBy(xpath = "//h2[@id='anim-profile-head']")
	public WebElement TheSocialNFTMarketplaceSection;
	
	@FindBy(xpath = "//h3[contains(text(),'Social Identity')]")
	public WebElement SocialIdentitySection;
	
	@FindBy(xpath = "//h3[contains(text(),'The NFT.com Marketplace')]")
	public WebElement TheNFTComMarketplaceSection;
	
	@FindBy(xpath = "//div[@id='anim-discover-trigger']")
	public WebElement DiscoverANewWorldSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Getting Started')]")
	public WebElement GettingStartedSection;

	@FindBy(xpath = "//h3[contains(text(),'Create Your Profile')]")
	public WebElement GettingStartedSection_CreateYourProfile;

	@FindBy(xpath = "//h3[contains(text(),'Pay No Fees')]")
	public WebElement GettingStartedSection_PayNoFees;

	@FindBy(xpath = "//h3[contains(text(),'Display Your Way')]")
	public WebElement GettingStartedSection_DisplayYourWay;
	
	@FindBy(xpath = "//h2[contains(text(),'NFT Profile Leaderboard')]")
	public WebElement NFTProfileLeaderboardSection;
	
	@FindBy(xpath = "//th[contains(text(),'Profile')]")
	public WebElement NFTProfileLeaderboardSection_Profile;
	
	@FindBy(xpath = "//th[contains(text(),'Number of ')]")
	public WebElement NFTProfileLeaderboardSection_NumberOfGK;
	
	@FindBy(xpath = "//th[contains(text(),'Number of NFT Collections')]")
	public WebElement NFTProfileLeaderboardSection_NumberOfNFTCollections;
	
	@FindBy(xpath = "//th[contains(text(),'Items Collected')]")
	public WebElement NFTProfileLeaderboardSection_ItemsCollected;
	
	@FindBy(xpath = "//tr//th")
	public List <WebElement> NFTProfileLeaderboardtable_headers;
	
	@FindBy(xpath = "//tr[1]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column1Value;
	
	@FindBy(xpath = "//tr[2]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column2Value;	
	
	@FindBy(xpath = "//tr[3]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column3Value;	
	
	@FindBy(xpath = "//tr[4]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column4Value;
	
	@FindBy(xpath = "//tr[5]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column5Value;
	
	@FindBy(xpath = "//tr[6]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column6Value;
	
	@FindBy(xpath = "//tr[7]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column7Value;
	
	@FindBy(xpath = "//tr[8]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column8Value;
	
	@FindBy(xpath = "//tr[9]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column9Value;
	
	@FindBy(xpath = "//tr[10]//td")
	public List <WebElement> NFTProfileLeaderboardtable_Column10Value;
	
	@FindBy(xpath = "//h2[contains(text(),'News')]")
	public WebElement NewsSection;
	
	@FindBy(xpath = "//a[contains(text(),'READ OUR BLOG')]")
	public WebElement NewsSection_ReadOurBlogs;
	
	@FindBy(xpath = "//span[starts-with(@id,'anim-build-profile-ttl-')]")
	public WebElement BuildYourNFTProfileSection;
	
	@FindBy(xpath = "//span[contains(text(),'Learn')]")
	public WebElement FooterSection_Learn;
	
	@FindBy(xpath = "//span[contains(text(),'Resources')]")
	public WebElement FooterSection_Resources;
	
	@FindBy(xpath = "//span[contains(text(),'Policies')]")
	public WebElement FooterSection_Policies;
	
	@FindBy(xpath = "(//a[contains(text(),'Gallery')])[2]")
	public WebElement FooterSection_Learn_Gallery;
	
	@FindBy(xpath = "//a[contains(text(),'Docs')]")
	public WebElement FooterSection_Learn_Docs;
	
	@FindBy(xpath = "//a[contains(text(),'Blog')]")
	public WebElement FooterSection_Learn_Blog;
	
	@FindBy(xpath = "//a[contains(text(),'What is an NFT?')]")
	public WebElement FooterSection_Learn_WhatIsAnNFT;
	
	@FindBy(xpath = "//a[contains(text(),'Support')]")
	public WebElement FooterSection_Resources_Support;
	
	@FindBy(xpath = "//a[contains(text(),'Careers')]")
	public WebElement FooterSection_Resources_Careers;
	
	@FindBy(xpath = "//a[contains(text(),'Business Inquiries')]")
	public WebElement FooterSection_Resources_BI;
	
	@FindBy(xpath = "//a[contains(text(),'Terms of Service')]")
	public WebElement FooterSection_Policies_TOS;
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	public WebElement FooterSection_Policies_PP;
	
	@FindBy(xpath = "//a[contains(text(),'Bug Bounty')]")
	public WebElement FooterSection_Policies_BB;
	
	@FindBy(xpath = "//h4[contains(text(),'Subscribe to our notifications')]")
	public WebElement FooterSection_SubscribeToOurNotifications;
	
	@FindBy(xpath = "//button[contains(text(),'Subscribe')]")
	public WebElement FooterSection_SubscribeButton;
	
	@FindBy(xpath = "//input[@type='email']")
	public WebElement FooterSection_EmailInputField;
	
	@FindBy(xpath = "//a[@href='https://discord.com/invite/nftdotcom']")
	public WebElement FooterSection_Discord;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/NFTcomofficial']")
	public WebElement FooterSection_Twitter;
	
	@FindBy(xpath = "//footer[@id='FooterContainer']//div//a[@href='/']")
	public WebElement FooterSection_NFTcom;
	
	@FindBy(xpath = "//div[@role='document']")
	public WebElement ConnectWalletPopUpWindow;
	
	@FindBy(xpath = "//h1[@id='rk_connect_title']")
	public WebElement ConnectAWalletHeader;
	
	@FindBy(xpath = "//div[contains(text(),'Recommended')]")
	public WebElement ConnectAWallet_Recommended;
	
	@FindBy(xpath = "//div[contains(text(),'MetaMask')]")
	public WebElement ConnectAWallet_Recommended_MetaMask;
	
	@FindBy(xpath = "//div[contains(text(),'Rainbow')]")
	public WebElement ConnectAWallet_Recommended_Rainbow;
	
	@FindBy(xpath = "//div[contains(text(),'Others')]")
	public WebElement ConnectAWallet_Others;
	
	@FindBy(xpath = "//div[contains(text(),'Coinbase Wallet')]")
	public WebElement ConnectAWallet_Others_Coinbase;
	
	@FindBy(xpath = "//div[contains(text(),'WalletConnect')]")
	public WebElement ConnectAWallet_Others_WalletConnect;
	
	@FindBy(xpath = "//div[contains(text(),'Trust Wallet')]")
	public WebElement ConnectAWallet_Others_TrustWallet;
	
	@FindBy(xpath = "//div[contains(text(),'Ledger Live')]")
	public WebElement ConnectAWallet_Others_LedgerLive;
	
	@FindBy(xpath = "//div[contains(text(),'Argent')]")
	public WebElement ConnectAWallet_Others_Argent;
	
	@FindBy(xpath = "//div[contains(text(),'What is a Wallet?')]")
	public WebElement ConnectAWallet_WhatAWallet;
	
	@FindBy(xpath = "//div[contains(text(),'A Home for your Digital Assets')]")
	public WebElement ConnectAWallet_HomeForDA;
	
	@FindBy(xpath = "//div[contains(text(),'A New Way to Log In')]")
	public WebElement ConnectAWallet_NewWayToLogIn;
	
	@FindBy(xpath = "//div[contains(text(),'Get a Wallet')]")
	public WebElement ConnectAWallet_GetAWallet;
	
	@FindBy(xpath = "//div[contains(text(),'Learn More')]")
	public WebElement ConnectAWallet_LearnMore;
	
	@FindBy(xpath = "(//span[starts-with(@class,'text-[#B2B2B2]')])[1]")
	public WebElement SearchedResult_Suggested_CollectionCount;
	
	@FindBy(xpath = "(//span[contains(text(),'See All')])[1]")
	public WebElement SearchedResult_Suggested_Collection_SellAllButton;
	
	@FindBy(xpath = "(//span[starts-with(@class,'text-[#B2B2B2]')])[2]")
	public WebElement SearchedResult_Suggested_NFTsCount;
	
	@FindBy(xpath = "(//span[contains(text(),'See All')])[2]")
	public WebElement SearchedResult_Suggested_NFTs_SeeAllButton;
	
	@FindBy(xpath = "(//div[(@class='flex flex-col items-start')])[1]")
	public WebElement SearchedResult_Suggested_Collection;
	
	@FindBy(xpath = "(//div[(@class='flex flex-col items-start')])[2]")
	public WebElement SearchedResult_Suggested_NFT;
	
	@FindBy(xpath = "(//div[(@class='flex flex-col items-start')])[1]")
	public List <WebElement> SearchedResult_Suggested_Collections;
	
	@FindBy(xpath = "(//div[(@class='flex flex-col items-start')])[2]")
	public List <WebElement> SearchedResult_Suggested_NFTs;
	
	@FindBy(xpath = "(//span[contains(text(),'Genesis Keys')])[1]")
	public WebElement Genesiskeys;
	
	@FindBy(xpath = "//h1[contains(text(),'Introducing NFT.com')]")
	public WebElement IntroToNFTDoc;
	
	@FindBy(xpath = "//div[@class='flex']")
	public WebElement ArticleFlex;
	
	@FindBy(xpath = "(//h1[contains(text(),'What is an NFT?')])[1]")
	public WebElement WhatisanNFT;
	
	@FindBy(xpath = "(//span[contains(text(),'General')])[1]")
	public WebElement Support_general;
	
	@FindBy(xpath = "(//span[contains(text(),'Filter')])[1]")
	public WebElement GalleryPage_Filter;
	
	@FindBy(xpath = "(//span[contains(text(),'Genesis Keys')])[1]")
	public WebElement GalleryPage_Filter_GK;
	
	@FindBy(xpath = "(//span[contains(text(),'Profiles')])[1]")
	public WebElement GalleryPage_Filter_Profiles;
	
	@FindBy(xpath = "(//span[contains(text(),'Show My Assets')])[1]")
	public WebElement GalleryPage_Filter_ShowMyAssets;
	
	@FindBy(xpath = "(//input[@placeholder='Filter by ID number'])[1]")
	public WebElement GalleryPage_Filter_FilterByIDNumber;
	
	@FindBy(xpath = "(//span[contains(text(),'Genesis Keys')])[2]/span[contains(text(),'10000')]")
	public WebElement GalleryPage_Filter_GKCount;
	
	@FindBy(xpath = "//img[@alt='00008']")
	public WebElement GalleryPage_Filter_GKImage;
	
	@FindBy(xpath = "(//button[@role='switch'])[1]")
	public WebElement GalleryPage_Filter_ToogleButton;
	
	@FindBy(xpath = "(//span[contains(text(),'Profiles')])[2]")
	public WebElement GalleryPage_Profiles;
	
	@FindBy(xpath = "(//div[@class='m-4 ProfileGalleryCardContainer']/a/div)[1]")
	public WebElement GalleryPage_Profiles_DisplayedProfile;
	
	@FindBy(xpath = "//div[contains(text(),'CONNECT YOUR WALLET')]")
	public WebElement GalleryPage_ConnectYourWallet;
	
	@FindBy(xpath = "(//button[@type='button'][contains(text(),'Sign In')])[2]")
	public WebElement GalleryPage_ConnectYourWallet_SignInButton;
	
	@FindBy(xpath = "//img[@alt='01008']")
	public WebElement GalleryPage_Filter_FilterByIDNumber_FilteredResult;
	
	@FindBy(xpath = "//div[contains(text(),'Find your next collectible')]")
	public WebElement DiscoverPage_Title;
	
	@FindBy(xpath = "//div[@class='flex items-center justify-center']//input[@placeholder='Search profiles and NFTs by name...']")
	public WebElement DiscoverPage_GlobalSearchField;
	
	@FindBy(xpath = "//li//button[contains(text(),'NFTs')]")
	public WebElement DiscoverNFTsPage_NFTs;
	
	@FindBy(xpath = "//li//button[contains(text(),'Collections')]")
	public WebElement DiscoverNFTsPage_Collections;
	
	@FindBy(xpath = "//li//button[contains(text(),'Profiles')]")
	public WebElement DiscoverNFTsPage_Profiles;
	
	@FindBy(xpath = "//div[@class='flex items-center']//div[contains(text(),'Filters')]")
	public WebElement DiscoverNFTsPage_Filters;
	
	@FindBy(xpath = "//div[contains(text(),'Marketplace')]")
	public WebElement DiscoverNFTsPage_Filters_Marketplace;
	
	@FindBy(xpath = "//div[contains(text(),'Status')]")
	public WebElement DiscoverNFTsPage_Filters_Status;
	
	@FindBy(xpath = "//div[contains(text(),'Price')]")
	public WebElement DiscoverNFTsPage_Filters_Price;
	
	@FindBy(xpath = "//div[contains(text(),'NFT Type')]")
	public WebElement DiscoverNFTsPage_Filters_NFTType;
	
	@FindBy(xpath = "//label[contains(text(),'OpenSea')]")
	public WebElement DiscoverNFTsPage_Filters_Marketplace_OpenSea;
	
	@FindBy(xpath = "//label[contains(text(),'LooksRare')]")
	public WebElement DiscoverNFTsPage_Filters_Marketplace_LooksRare;
	
	@FindBy(xpath = "//label[contains(text(),'X2Y2')]")
	public WebElement DiscoverNFTsPage_Filters_Marketplace_X2Y2;
	
	@FindBy(xpath = "//label[contains(text(),'NFT.com')]")
	public WebElement DiscoverNFTsPage_Filters_Marketplace_NFTcom;
	
	@FindBy(xpath = "//label[contains(text(),'Buy Now')]")
	public WebElement DiscoverNFTsPage_Filters_Status_BuyNow;
	
	@FindBy(xpath = "//label[contains(text(),'New')]")
	public WebElement DiscoverNFTsPage_Filters_Status_New;
	
	@FindBy(xpath = "//input[@type='number'][@placeholder='Min']")
	public WebElement DiscoverNFTsPage_Filters_Price_Min;
	
	@FindBy(xpath = "//input[@type='number'][@placeholder='Max']")
	public WebElement DiscoverNFTsPage_Filters_Price_Max;
	
	@FindBy(xpath = "//div[contains(text(),'ETH')]")
	public WebElement DiscoverNFTsPage_Filters_Price_DefaultETHValue;
	
	@FindBy(xpath = "//li[contains(text(),'ETH')]")
	public WebElement DiscoverNFTsPage_Filters_Price_ETH;
	
	@FindBy(xpath = "//li[contains(text(),'WETH')]")
	public WebElement DiscoverNFTsPage_Filters_Price_WETH;
	
	@FindBy(xpath = "//div[contains(text(),'Apply')]")
	public WebElement DiscoverNFTsPage_Filters_Price_ApplyButton;
	
	@FindBy(xpath = "//label[contains(text(),'ERC721')]")
	public WebElement DiscoverNFTsPage_Filters_NFTType_ERC721;
	
	@FindBy(xpath = "//label[contains(text(),'ERC1155')]")
	public WebElement DiscoverNFTsPage_Filters_NFTType_ERC1155;
	
	@FindBy(xpath = "//label[contains(text(),'CRYPTO_PUNKS')]")
	public WebElement DiscoverNFTsPage_Filters_NFTType_CRYPTO_PUNKS;
	
	@FindBy(xpath = "//div[starts-with(@class,'group/ntfCard transition-all ')]")
	public WebElement DiscoverNFTsPage_DisplayedNFTs;
	
	@FindBy(xpath = "//div[starts-with(@class,'group/ntfCard transition-all ')]")
	public List <WebElement> DiscoverNFTsPage_DisplayedListOfNFTs;
	
	@FindBy(xpath = "//div[contains(text(),'Load More')]")
	public WebElement DiscoverNFTsPage_LoadMoreButton;
	
	@FindBy(xpath = "//span[contains(text(),'Leaderboard')]")
	public WebElement DiscoverCollectionsPage_Leaderboard;
	
	@FindBy(xpath = "//button[contains(text(),'View Collections')]")
	public WebElement DiscoverCollectionsPage_ViewCollections;
	
	@FindBy(xpath = "//div[@class='hidden minmd:flex']//li[contains(text(),'24h')]")
	public WebElement DiscoverCollectionsPage_24hTimeStamp;
	
	@FindBy(xpath = "//div[@class='hidden minmd:flex']//li[contains(text(),'7d')]")
	public WebElement DiscoverCollectionsPage_7dayTimeStamp;
	
	@FindBy(xpath = "//div[@class='hidden minmd:flex']//li[contains(text(),'30d')]")
	public WebElement DiscoverCollectionsPage_30dayTimeStamp;
	
	@FindBy(xpath = "//div[@class='hidden minmd:flex']//li[contains(text(),'all')]")
	public WebElement DiscoverCollectionsPage_AllTimeStamp;
	
	@FindBy(xpath = "//div[contains(text(),'COLLECTION')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_COLLECTION;
	
	@FindBy(xpath = "//div[contains(text(),'VOLUME')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_VOLUME;
	
	@FindBy(xpath = "//div[contains(text(),'% CHANGE')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_CHANGE;
	
	@FindBy(xpath = "//div[contains(text(),'FLOOR PRICE')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_FLOORPRICE;
	
	@FindBy(xpath = "//div[contains(text(),'ITEMS')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_ITEMS;
	
	@FindBy(xpath = "//div[contains(text(),'SALES')]")
	public WebElement DiscoverCollectionsPage_LeaderBoardtableHeaders_SALES;
	
	@FindBy(xpath = "//div[starts-with(@class,'flex justify-start items-center w-')]")
	public List <WebElement> DiscoverCollectionsPage_COLLECTIONList;
	
	@FindBy(xpath = "//button[contains(text(),'Show leaderboard')]")
	public WebElement DiscoverCollectionsPage_Showleaderboard;
	
	@FindBy(xpath = "//p[contains(text(),'Filter')]")
	public WebElement DiscoverCollectionsPage_Filter;
	
	@FindBy(xpath = "//div[@class='flex items-center']//div[contains(text(),'Filters')]")
	public WebElement DiscoverCollectionsPage_Filters;
	
	@FindBy(xpath = "//div[contains(text(),'NFT Type')]")
	public WebElement DiscoverCollectionsPage_Filters_NFTType;
	
	@FindBy(xpath = "//div[contains(text(),'Trading Volume')]")
	public WebElement DiscoverCollectionsPage_Filters_TradingVolume;
	
	@FindBy(xpath = "//div[contains(text(),'Issuance')]")
	public WebElement DiscoverCollectionsPage_Filters_Issuance;
	
	@FindBy(xpath = "//div[contains(text(),'Floor Price')]")
	public WebElement DiscoverCollectionsPage_Filters_FloorPrice;
	
	@FindBy(xpath = "(//input[@type='number'][@placeholder='Min'])[1]")
	public WebElement DiscoverCollectionsPage_Filters_FloorPrice_Min;
	
	@FindBy(xpath = "(//input[@type='number'][@placeholder='Max'])[1]")
	public WebElement DiscoverCollectionsPage_Filters_FloorPrice_Max;
	
	@FindBy(xpath = "(//div[contains(text(),'ETH')])[1]")
	public WebElement DiscoverCollectionsPage_Filters_FloorPrice_DefaultETHValue;
	
	@FindBy(xpath = "(//div[contains(text(),'Apply')])[1]")
	public WebElement DiscoverCollectionsPage_Filters_FloorPrice_ApplyButton;
	
	@FindBy(xpath = "//label[contains(text(),'ERC721')]")
	public WebElement DiscoverCollectionsPage_Filters_NFTType_ERC721;
	
	@FindBy(xpath = "//label[contains(text(),'ERC1155')]")
	public WebElement DiscoverCollectionsPage_Filters_NFTType_ERC1155;
	
	@FindBy(xpath = "(//input[@type='number'][@placeholder='Min'])[2]")
	public WebElement DiscoverCollectionsPage_Filters_TradingVolume_Min;
	
	@FindBy(xpath = "(//input[@type='number'][@placeholder='Max'])[2]")
	public WebElement DiscoverCollectionsPage_Filters_TradingVolume_Max;
	
	@FindBy(xpath = "(//div[contains(text(),'ETH')])[2]")
	public WebElement DiscoverCollectionsPage_Filters_TradingVolume_DefaultETHValue;
	
	@FindBy(xpath = "(//div[contains(text(),'Apply')])[2]")
	public WebElement DiscoverCollectionsPage_Filters_TradingVolume_ApplyButton;
	
	@FindBy(xpath = "//label[contains(text(),'30 Days')]")
	public WebElement DiscoverCollectionsPage_Filters_Issuance_30days;
	
	@FindBy(xpath = "//label[contains(text(),'90 Days')]")
	public WebElement DiscoverCollectionsPage_Filters_Issuance_90days;
	
	@FindBy(xpath = "//label[contains(text(),'180 Days')]")
	public WebElement DiscoverCollectionsPage_Filters_Issuance_180days;
	
	@FindBy(xpath = "//label[contains(text(),'1 Year')]")
	public WebElement DiscoverCollectionsPage_Filters_Issuance_1year;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[4]/div/div/div/div[2]/div/div[1]/div[2]/a[1]")
	public WebElement DiscoverCollectionsPage_DisplayedNFTs;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[4]/div/div/div/div[2]/div/div[1]/div[2]/a")
	public List <WebElement> DiscoverCollectionsPage_DisplayedListOfCollections;

	@FindBy(xpath = "//div[contains(text(),'Load More')]")
	public WebElement DiscoverCollectionsPage_LoadMoreButton;
	
	@FindBy(xpath = "//button[contains(text(),'Show leaderboard')]")
	public WebElement DiscoverProfilesPage_ShowLoaderBoard;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[4]/div/div/div/div[2]/div[1]/a[1]")
	public WebElement DiscoverProfilesPage_DisplayedProfile;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[4]/div/div/div/div[2]/div[1]/a")
	public List <WebElement> DiscoverProfilesPage_DisplayedProfiles;

	@FindBy(xpath = "//div[contains(text(),'Load More')]")
	public WebElement DiscoverProfilesPage_LoadMoreButton;

	@FindBy(xpath = "//span[contains(text(),'Leaderboard')]")
	public WebElement DiscoverProfilesPage_Leaderboard;

	@FindBy(xpath = "//button[contains(text(),'View Profiles')]")
	public WebElement DiscoverProfilesPage_ViewProfiles;

	@FindBy(xpath = "//div[@class='flex justify-center']")
	public List <WebElement> DiscoverProfilesPage_Leaderboard_DisplayedResults;

	@FindBy(xpath = "//div[@class='flex justify-center']/a")
	public List <WebElement> DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults;

	@FindBy(xpath = "//h2[contains(text(),'NFT.com Blog')]")
	public WebElement Learn_BlogPage_NFTcomBlog;
	
	@FindBy(xpath = "//div[@data-cy='blogSlider']")
	public WebElement Learn_BlogPage_blogSlider;
	
	@FindBy(xpath = "(//*[@id=\"__next\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div/div/img)[2]")
	public WebElement Learn_BlogPage_blogSlider_BlogImage;
	
	@FindBy(xpath = "(//div[@data-cy='blogSlider']//h2)[2]")
	public WebElement Learn_BlogPage_blogSlider_BlogTitle;
	
	@FindBy(xpath = "(//*[@id=\"__next\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/p)[2]")
	public WebElement Learn_BlogPage_blogSlider_AuthorName;
	
	@FindBy(xpath = "(//div[contains(text(),'View Post')])[2]")
	public WebElement Learn_BlogPage_blogSlider_ViewPost;
	
	@FindBy(xpath = "//h2[contains(text(),'Articles')]")
	public WebElement Learn_BlogPage_Articles;
	
	@FindBy(xpath = "(//div[@data-cy='blogPostCard'])[1]")
	public WebElement Learn_BlogPage_Articles_blogpostcard;
	
	@FindBy(xpath = "//div[@data-cy='blogPostCard']")
	public List <WebElement> Learn_BlogPage_Articles_blogPostCard;
	
	@FindBy(xpath = "(//div[@data-cy='blogPostCard'])[1]//h3")
	public WebElement Learn_BlogPage_Articles_blogpostcard_Title;
	
	@FindBy(xpath = "((//div[@data-cy='blogPostCard'])[1]//img)[1]")
	public WebElement Learn_BlogPage_Articles_blogpostcard_Image;
	
	@FindBy(xpath = "((//div[@data-cy='blogPostCard'])[1]//p)[1]")
	public WebElement Learn_BlogPage_Articles_blogpostcard_Discription;
	
	@FindBy(xpath = "((//div[@data-cy='blogPostCard'])[1]//p)[2]")
	public WebElement Learn_BlogPage_Articles_blogpostcard_Author;
	
	@FindBy(xpath = "((//div[@data-cy='blogPostCard'])[1]//p)[3]")
	public WebElement Learn_BlogPage_Articles_blogpostcard_PostedDate;
	
	@FindBy(xpath = "//div[contains(text(),'Load More')]")
	public WebElement Learn_BlogPage_Articles_LoadMore;
	
	@FindBy(xpath = "(//div[contains(text(),'Overview')])[1]")
	public WebElement Learn_DocsPage_Overview;
	
	@FindBy(xpath = "(//div[contains(text(),'NFT Profiles')])[1]")
	public WebElement Learn_DocsPage_NFTProfiles;
	
	@FindBy(xpath = "(//div[contains(text(),'NFT Trading')])[1]")
	public WebElement Learn_DocsPage_NFTTrading;
	
	@FindBy(xpath = "(//div[contains(text(),'Genesis Keys')])[1]")
	public WebElement Learn_DocsPage_GenesisKeys;
	
	@FindBy(xpath = "(//div[contains(text(),'Discover')])[1]")
	public WebElement Learn_DocsPage_Discover;
	
	@FindBy(xpath = "(//div[contains(text(),'Pricing')])[1]")
	public WebElement Learn_DocsPage_Pricing;
	
	@FindBy(xpath = "//div[@data-testid='page.contentEditor']")
	public WebElement Learn_DocsPage_DocDescription;
	
	@FindBy(xpath = "(//div[contains(text(),'Profile Creation')])[1]")
	public WebElement Learn_DocsPage_ProfileCreation;
	
	@FindBy(xpath = "//h1[@data-testid='page.title']")
	public WebElement Learn_DocsPage_PageTitle;
}
