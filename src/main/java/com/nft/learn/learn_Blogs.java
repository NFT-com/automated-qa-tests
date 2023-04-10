package com.nft.learn;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import com.nft.broken_links.BrokenLinks;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.Locators;
import com.nft.qa.base.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


@Listeners({AllureListener.class})
public class learn_Blogs extends TestBase {
	Locators locators = new Locators();
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	Actions actions = new Actions(driver);
	BrokenLinks brokenLinks = new BrokenLinks();
	int expectedarticlecount = 12;
	
	public void NavigateToLearn_BlogPage() throws InterruptedException {
		Thread.sleep(2000);
		locators.NFTCom_Learn_Headeroption.click();
		Thread.sleep(2000);
		locators.NFTCom_Learn_Blog_DropwDownValue.click();
		Thread.sleep(3000);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertEquals(currenturl, "https://www.nft.com/articles");
		System.out.println("<<<<=====NFT.COM Blogs Page loaded successfully.====>>>>");
		System.out.println("<<<<=====NFT.COM Blogs Page loaded successfully.====>>>>");
	}

	
	public void ValidateLearn_blogPage() throws InterruptedException {
		
		//brokenLinks.ValidateTheBrokenLinks();
		brokenLinks.ValidateAllBrokenImages();
		System.out.println("<---Displayed Images Validated Successfully--->");
		Thread.sleep(2000);
		
		String Learn_BlogPage_NFTcomBlog = locators.Learn_BlogPage_NFTcomBlog.getText();
		Assert.assertTrue(locators.Learn_BlogPage_NFTcomBlog.isDisplayed());
		System.out.println("Displayed Blog page title is====>> " + Learn_BlogPage_NFTcomBlog);
		
		
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider.isDisplayed());
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//*[@id=\"__next\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div/div/img)[2]")) ));
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider_BlogImage.isDisplayed());
		
		/*String Learn_BlogPage_blogSlider_BlogTitle = locators.Learn_BlogPage_blogSlider_BlogTitle.getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//div[@data-cy='blogSlider']//h2)[2]")) ));
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider_BlogTitle.isDisplayed());
		System.out.println("Displayed Blog slider title is====>> " + Learn_BlogPage_blogSlider_BlogTitle);
		

		String Learn_BlogPage_blogSlider_AuthorName = locators.Learn_BlogPage_blogSlider_AuthorName.getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//*[@id=\\\"__next\\\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div/div/div/div/p)[2]")) ));
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider_AuthorName.isDisplayed());
		System.out.println("Displayed Blog slider Author is====>> " + Learn_BlogPage_blogSlider_AuthorName);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//div[contains(text(),'View Post')])[2]")) ));
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider_ViewPost.isDisplayed());*/
		
		String Learn_BlogPage_Articles = locators.Learn_BlogPage_Articles.getText();
		Assert.assertTrue(locators.Learn_BlogPage_Articles.isDisplayed());
		System.out.println("Displayed title is====>> " + Learn_BlogPage_Articles);
		
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard.isDisplayed());
		
		String Learn_BlogPage_Articles_blogpostcard_Title = locators.Learn_BlogPage_Articles_blogpostcard_Title.getText();
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard_Title.isDisplayed());
		System.out.println("Displayed Value is====>> " + Learn_BlogPage_Articles_blogpostcard_Title);
		
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard_Image.isDisplayed());
		
		String Learn_BlogPage_Articles_blogpostcard_Discription = locators.Learn_BlogPage_Articles_blogpostcard_Discription.getText();
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard_Discription.isDisplayed());
		System.out.println("Displayed Value is====>> " + Learn_BlogPage_Articles_blogpostcard_Discription);
		
		String Learn_BlogPage_Articles_blogpostcard_Author = locators.Learn_BlogPage_Articles_blogpostcard_Author.getText();
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard_Author.isDisplayed());
		System.out.println("Displayed Value is====>> " + Learn_BlogPage_Articles_blogpostcard_Author);
		
		String Learn_BlogPage_Articles_blogpostcard_PostedDate = locators.Learn_BlogPage_Articles_blogpostcard_PostedDate.getText();
		Assert.assertTrue(locators.Learn_BlogPage_Articles_blogpostcard_PostedDate.isDisplayed());
		System.out.println("Displayed Value is====>> " + Learn_BlogPage_Articles_blogpostcard_PostedDate);
		
		Assert.assertTrue(locators.Learn_BlogPage_Articles_LoadMore.isDisplayed());
		Assert.assertTrue(locators.Learn_BlogPage_blogSlider_ViewPost.isDisplayed());
		
		List<WebElement> Learn_BlogPage_Articles_blogPostCard = locators.Learn_BlogPage_Articles_blogPostCard;
		System.out.println("No of article cards are : " + Learn_BlogPage_Articles_blogPostCard.size());
		for (int j = 0; j < Learn_BlogPage_Articles_blogPostCard.size(); j++) {
			int learn_BlogPage_Articles_blogPostCard = Learn_BlogPage_Articles_blogPostCard.size();
			Assert.assertEquals(learn_BlogPage_Articles_blogPostCard, expectedarticlecount);
		}

	}
}
