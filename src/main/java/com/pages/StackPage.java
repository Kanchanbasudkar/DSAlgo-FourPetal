package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	
	
	private WebDriver driver;
	
	
	 //By locators : Object Repository
	
	private By  Stackele = By.xpath("(//a[@href='stack'])[1]");
	private By OperInStackLink = By.xpath("//a[normalize-space()='Operations in Stack']");
	private By ImplementEle = By.linkText("Implementation");
	private  By AppliElem = By.linkText("Applications");
	private By PracQuesEle = By.linkText("Practice Questions");
	private By tryherebtn = By.linkText("Try here>>>");
	private By textboxelem = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	private By RunBtn = By.xpath("//button[text()='Run']");
	private By OutputElem = By.id("output");
	//private By codeMirror = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	
	 //Constructor of the page class
	 
	 public StackPage(WebDriver driver) {
		 super();
		 this.driver = driver;
	 }
	 
	  //  Page Actions

	 
	 public void selectStack()  {driver.findElement(Stackele).click();}
	 
	 public void clickOperationsLink()  {
		 driver.findElement(OperInStackLink).click();
	 }
	 
	 public void clickTryBtn()  {
		 driver.findElement(tryherebtn).click();
	 }
	 
	 public void enterText()  {

		 driver.findElement(textboxelem).sendKeys("print'Welcome'");

	 }
	 
	 public void clickRunBtn()   {
		 driver.findElement(RunBtn).click();
	 }
	 
	 public void checkOutput() throws InterruptedException {
		 driver.findElement(OutputElem);
	 }

	 public void clickImplementationLink()   {
		 driver.findElement(ImplementEle).click();
	 }
	 
	 public void clickApplicationsLink()   {
		 driver.findElement(AppliElem).click();
	 }
	 
	 public void clickPracticeQuesLink()  {
		 driver.findElement(PracQuesEle).click();
	 }
	
	
	



}
