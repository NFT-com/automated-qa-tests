package com.nft.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public WebDriverWait wait;
	public static WebDriver getDriver() {
        return driver;}

	public TestBase() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Admin\\git\\automated-qa-tests\\nft\\src\\main\\java\\com\\nft\\qa\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws InterruptedException {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			// chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
			// WebDriver driver = new ChromeDriver(chromeOptions);
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			chromeOptions.addArguments("start-maximized");
			chromeOptions.addArguments("enable-automation");
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-infobars");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			chromeOptions.addArguments("--disable-browser-side-navigation");
			chromeOptions.addArguments("--disable-gpu");
			//chromeOptions.addExtensions(new File("C:\\Users\\Admin\\git\\automated-qa-tests\\nft\\src\\main\\java\\com\\nft\\qa\\resourceFiles\\extension_metamask.crx"));
		
			
			
			chromeOptions.addExtensions(new File("C:\\Users\\Admin\\git\\automated-qa-tests\\nft\\src\\main\\java\\com\\nft\\qa\\resourceFiles\\metamaskextension.crx"));
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			chromeOptions.merge(capabilities);
			//ChromeDriver driver = new ChromeDriver(capabilities);
			System.out.println("Opening extension");
			/*driver.get("https://chrome.google.com/webstore/detail/link-redirect-trace/nkbihfbeogaeaoehlefnkodbefgpgknn");
			driver.navigate().refresh();
	        System.out.println("Refresh successfully");
			Thread.sleep(5000);*/
			
		}

		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Ravi Singh\\Geko\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();

		//driver.get(prop.getProperty("stagingurl"));
		driver.get(prop.getProperty("url"));
	}
	
	public void click(By by) {
        waitVisibility(by).click();
    }
    //Write Text
    public void writeText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }
    //Read Text
    public String readText(By by) {
        return waitVisibility(by).getText();
    }
    //Wait
    public WebElement waitVisibility(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
