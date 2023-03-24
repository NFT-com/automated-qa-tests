package com.nft.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Admin\\eclipse-workspace\\nft\\src\\main\\java\\com\\nft\\qa\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			// chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
			// WebDriver driver = new ChromeDriver(chromeOptions);
			WebDriverManager.chromedriver().setup();
			// WebDriverManager.chromedriver().driverVersion("111.0.5563.65").setup();

			driver = new ChromeDriver();

			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			chromeOptions.addArguments("start-maximized");
			chromeOptions.addArguments("enable-automation");
			chromeOptions.addArguments("--no-sandbox");
			chromeOptions.addArguments("--disable-infobars");
			chromeOptions.addArguments("--disable-dev-shm-usage");
			chromeOptions.addArguments("--disable-browser-side-navigation");
			chromeOptions.addArguments("--disable-gpu");
			// driver = (WebDriver) new ChromeDriver(chromeOptions);
			//	driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();

		}

		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Ravi Singh\\Geko\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 //get the URL
		driver.get(prop.getProperty("url"));

	}
}
