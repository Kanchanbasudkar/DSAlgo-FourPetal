package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver webDriver;

	//Add all By Locators
	By registerLink=By.linkText("Register");
	By signInLink=By.linkText("Sign in");
	
			
	
	
	public HomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}
	
	//Add all Page Actions
//	public RegisterFormPage clickRegisterLink() {
//		webDriver.findElement(registerLink).click();
//		return new RegisterFormPage(webDriver);
//	}
	
	
	public SignInPage clickSignInLink() {
		webDriver.findElement(signInLink).click();
		return new SignInPage(webDriver);
	}
	
	
	
}
