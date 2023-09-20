package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Collections;

public class DriverFactorys {
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<WebDriver>();
	
	public WebDriver init_driver(String Browser) {
		System.out.println("browser value is :" +Browser);
		
		if(Browser.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		   }
		else if(Browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		   }
		else if(Browser.equals("safari")) {

			WebDriverManager.safaridriver().setup();
			tlDriver.set(new SafariDriver());
			}
		else {
			System.out.println("Please pass the correct browser value :" + Browser);
		}
		return getDriver();
		
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
	
	
	
	
}