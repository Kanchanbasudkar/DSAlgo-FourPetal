package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	private WebDriver webDriver;

	By getstared = By.className("btn");

	public WelcomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public HomePage clickGetstartedButton() {

		webDriver.findElement(getstared).click();
		return new HomePage(webDriver);

	}
}
