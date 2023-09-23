package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	private WebDriver webDriver;

By signIn = By.partialLinkText("Sign");
By userName = By.xpath("//input[@name=\"username\"]");
By password = By.xpath("//input[@name=\"password\"]");
By loginBtn = By.xpath("//input[@value=\"Login\"]");

public SignIn(WebDriver webDriver) {
	super();
	this.webDriver = webDriver;
}

public void ClickSignIn() {
	webDriver.findElement(signIn).click();
}
public void Username() {
	webDriver.findElement(userName).sendKeys("kanchanbasudkar");
}
public void Password() {
	webDriver.findElement(password).sendKeys("kanbas123$");
}
public HomePage ClickLoginBtn() {
	webDriver.findElement(loginBtn).click();
	return new HomePage(webDriver);

}


}
