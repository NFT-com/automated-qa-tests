package com.nft.broken_links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import com.nft.qa.Listeners.AllureListener;
import com.nft.qa.base.TestBase;

@Listeners({AllureListener.class})
public class BrokenLinks extends TestBase {



	public void GetAllURLs() {
		
		String url = "";
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());

		// We will iterate through the list and will check the elements in the list.
		Iterator<WebElement> iterator = allURLs.iterator();
		while (iterator.hasNext()) {
			url = iterator.next().getText();
			System.out.println(url);
		}
	}

	public void ValidateTheBrokenLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// This line will print the number of links and the count of links.
		System.out.println("No of links are " + links.size());

		// checking the links fetched.
		for (int i = 0; i < links.size(); i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}
	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}

	public void ValidateAllBrokenImages() {

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of Images on the Page are " + images.size());

		// checking the links fetched.
		for (int index = 0; index < images.size(); index++) {
			WebElement image = images.get(index);
			String imageURL = image.getAttribute("src");
			System.out.println("URL of Image " + (index + 1) + " is: " + imageURL);
			verifyImageLinks(imageURL);

			// Validate image display using JavaScript executor
			try {
				boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript(
						"return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);",
						image);
				if (imageDisplayed) {
					System.out.println("DISPLAY - OK");
				} else {
					System.out.println("DISPLAY - BROKEN");
				}
			} catch (Exception e) {
				System.out.println("Error Occured");
			}
		}

	}

	public static void verifyImageLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println("HTTP STATUS - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {
		}
	}

}
