package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage {
	
	private WebDriver webDriver;
	
	By userName = By.xpath("//input[@id=\"id_username\"]");

	public SignInPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}
	
	public void user_filled_user_id_and_password() throws InterruptedException {
		System.out.println("method daslfkjasl");
//		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(userName));
		Thread.sleep(5000l);
		System.out.println("after waiting 20 seconds");
		webDriver.findElement(userName).sendKeys("kanchanbasudkar");
		System.out.println("calling fill user details");
	}

}
