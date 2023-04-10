package com.nft.gallery;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.Locators;
import com.nft.qa.base.TestBase;
import org.openqa.selenium.interactions.Actions;

@Listeners({AllureListener.class})
public class gallery extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);
	
	public void NavigateToNFTGalleryPage() throws InterruptedException {

		locators.NFTCom_Gallery_Headeroption.click();
		Thread.sleep(3000);
		System.out.println("<<<<=====NFT.COM Gallery Page loaded successfully.====>>>>");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.nft.com/app/gallery");
	}

	
	public void ValidateGenesisKeyPageAsVisitor() throws InterruptedException {
		
		Assert.assertTrue(locators.GalleryPage_Filter.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_GK.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_Profiles.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_ShowMyAssets.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_FilterByIDNumber.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_GKCount.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_GKImage.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_ToogleButton.isDisplayed());
		Thread.sleep(2000);
		locators.GalleryPage_Filter_ShowMyAssets.click();
		Thread.sleep(2000);
		Assert.assertTrue(locators.GalleryPage_ConnectYourWallet.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_ConnectYourWallet_SignInButton.isDisplayed());
		locators.GalleryPage_Filter_ShowMyAssets.click();
		Thread.sleep(2000);
		locators.GalleryPage_Filter_FilterByIDNumber.sendKeys("1008");
		Thread.sleep(1500);
		Assert.assertTrue(locators.GalleryPage_Filter_FilterByIDNumber_FilteredResult.isDisplayed());
		locators.GalleryPage_Filter_FilterByIDNumber.sendKeys(Keys.BACK_SPACE);
		locators.GalleryPage_Filter_FilterByIDNumber.sendKeys(Keys.BACK_SPACE);
		locators.GalleryPage_Filter_FilterByIDNumber.sendKeys(Keys.BACK_SPACE);
		locators.GalleryPage_Filter_FilterByIDNumber.sendKeys(Keys.BACK_SPACE);
		//locators.GalleryPage_Filter_FilterByIDNumber.clear();
		Thread.sleep(4000);
		Assert.assertTrue(locators.GalleryPage_Filter_GKImage.isDisplayed());
		
		  /*executor.executeScript("window.scrollBy(0,250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,-250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,-250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,-250)");
		  Thread.sleep(1500);
		  executor.executeScript("window.scrollBy(0,-250)");
		  Thread.sleep(1500);*/
		  
		locators.GalleryPage_Filter_ToogleButton.click();
		Thread.sleep(2000);
		Assert.assertTrue(locators.GalleryPage_Profiles.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Profiles_DisplayedProfile.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_Filter_ShowMyAssets.isDisplayed());
		
		locators.GalleryPage_Filter_ShowMyAssets.click();
		Thread.sleep(2000);
	
		Assert.assertTrue(locators.GalleryPage_ConnectYourWallet.isDisplayed());
		Assert.assertTrue(locators.GalleryPage_ConnectYourWallet_SignInButton.isDisplayed());
		locators.GalleryPage_Filter_ShowMyAssets.click();
		Thread.sleep(2000);
		
		
	}

	public void ValidateGenesisKeyPageAsLoggedInUser() throws InterruptedException {
		//TODO
	}
	

}
