package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Collections;

public class DriverFactorys {
	//public WebDriver driver;
	static WebDriver driver=null;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thradlocal driver on the basis of given
	 * browser
	 * 
	 * @param browser
	 * @return this will return tldriver.
	 */
	public WebDriver init_driver(String browser) {

		System.out.println("browser value is: " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			tlDriver.set(new ChromeDriver(option));
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value: " + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	/*
	 * public static void main(String[] args) { // Optional : if not specified
	 * WebDriver will search your system PATH environment variable for locating the
	 * chromedriver System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\admin\\Desktop\\SDET-DS-algo\\src\\main\\resources"); WebDriver
	 * driver = new ChromeDriver(); driver.get("https://www.google.co.in");
	 * System.out.println(driver.getTitle()); driver.quit(); }
	 */
}