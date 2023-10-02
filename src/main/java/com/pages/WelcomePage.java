package com.pages;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	private WebDriver webDriver;

	By getstared = By.className("btn");

	By numpyNinjaBrand = By.className("navbar-brand");

	public WelcomePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void clickGetstartedButton() {

		webDriver.findElement(getstared).click();
		///return new HomePage(webDriver);

	}

	public void checkForNumpyNinjaBrand(){
		Assert.isNonEmpty(webDriver.findElement(numpyNinjaBrand));
	}
}
