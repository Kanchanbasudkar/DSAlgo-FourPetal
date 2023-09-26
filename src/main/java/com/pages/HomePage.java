package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver webDriver;

	//Add all By Locators
	By RegisterLink = By.linkText("Register");



	public HomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	//Add all Page Actions
	public void ClickRegisterButton() {

		webDriver.findElement(RegisterLink).click();
	}
}
