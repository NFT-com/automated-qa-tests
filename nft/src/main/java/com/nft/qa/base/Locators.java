package com.nft.qa.base;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/nav/div[1]/div[2]/div[2]")
	public WebElement NFTCom_Discover_Collections_DropwDownValue;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div[1]/nav/div[1]/div[2]/div[3]")
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
	
	
}
