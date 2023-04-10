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
public class discover_Profiles extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	BrokenLinks brokenLinks = new BrokenLinks();
	int expectedprofilecount = 10;
	
	public void NavigateToDiscover_ProfilesPage() throws InterruptedException {
		Thread.sleep(2000);
		locators.NFTCom_Discover_Headeroption.click();
		Thread.sleep(2000);
		locators.NFTCom_Discover_Profiles_DropwDownValue.click();
		Thread.sleep(3000);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.nft.com/app/discover/profiles");
		System.out.println("<<<<=====NFT.COM Discover Profiles Page loaded successfully.====>>>>");
	}

	
	public void ValidateDiscoverProfilesPage() throws InterruptedException {
		
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
		Assert.assertTrue(locators.DiscoverProfilesPage_ShowLoaderBoard.isDisplayed());
		Assert.assertTrue(locators.DiscoverProfilesPage_DisplayedProfile.isDisplayed());
		
		List<WebElement> DiscoverProfilesPage_DisplayedProfiles = locators.DiscoverProfilesPage_DisplayedProfiles;
		System.out.println("No of profile cards are : " + DiscoverProfilesPage_DisplayedProfiles.size());
		
		Assert.assertTrue(locators.DiscoverProfilesPage_LoadMoreButton.isDisplayed());
		
		locators.DiscoverProfilesPage_ShowLoaderBoard.click();
		Thread.sleep(2000);
		Assert.assertTrue(locators.DiscoverProfilesPage_Leaderboard.isDisplayed());
		Assert.assertTrue(locators.DiscoverProfilesPage_ViewProfiles.isDisplayed());
		
		
		List<WebElement> DiscoverProfilesPage_Leaderboard_DisplayedResults = locators.DiscoverProfilesPage_Leaderboard_DisplayedResults;
		System.out.println("No of cols are : " + DiscoverProfilesPage_Leaderboard_DisplayedResults.size());
		for (int j = 0; j < DiscoverProfilesPage_Leaderboard_DisplayedResults.size(); j++) {
			int ProfilesPage_Leaderboard_DisplayedResults = DiscoverProfilesPage_Leaderboard_DisplayedResults.size();
			//System.out.println("Profile card count is ==> " +ProfilesPage_Leaderboard_DisplayedResults);
			Assert.assertEquals(ProfilesPage_Leaderboard_DisplayedResults, expectedprofilecount);
		}
		
		
		List<WebElement> DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults = locators.DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults;
		System.out.println("No of cols are : " + DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults.size());
		for (int j = 0; j < DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults.size(); j++) {
			//String collection = Collection.get(j).getText();
			System.out.println(DiscoverProfilesPage_Leaderboard_VerifyDisplayedResults.get(j).getText());
			
		}

	}
}
