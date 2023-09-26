package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DatastructuresIntroPage {

	private WebDriver webDriver;
	
	By getstarted = By.xpath("//h5[contains(text(),'Data')]/..//a");
	By 	timecomplex = By.linkText("Time Complexity");	
	By typeHere = By.linkText("Try here>>>");
	By write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[contains(text(),'Run')]");
	By output = By.xpath("//pre[@id='output']");
	
	public DatastructuresIntroPage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void ClickData_structureGetstarted() {

		webDriver.findElement(getstarted).click();
		
	}
	public void Clicktime_complex() {

		webDriver.findElement(timecomplex).click();
		
	}
	public void Clicktry() {
		webDriver.findElement(typeHere).click();
	}
	public void Clickwrite() {
		webDriver.findElement(write).sendKeys("print 'welcome'");
}
	public void Clickrunbutton() {
		webDriver.findElement(run).click();
	}

	public void invalidtext() {
		webDriver.findElement(write).sendKeys("'welcome'");
}
		
}
