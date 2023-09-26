package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreePage {

	private WebDriver webDriver;

	By treeGetStared = By.xpath("//h5[contains(text(),'Tree')]/..//a");
	By overviewLink = By.linkText("Overview of Trees");
	By terminologiesLink = By.linkText("Terminologies");
	By typeLink = By.linkText("Types of Trees");
	By treeLink = By.linkText("Tree Traversals");
	By traversalsLink = By.linkText("Traversals-Illustration");
	By binaryLink = By.linkText("Binary Trees");
	By typesOfBinaryLink = By.linkText("Types of Binary Trees");
	By implementationInPythonLink = By.linkText("Implementation in Python");
	By binaryTreeTraversalsLink = By.linkText("Binary Tree Traversals");
	By implementationOfBinaryLink = By.linkText("Implementation of Binary Trees");
	By applicationsLink = By.linkText("Applications of Binary trees");
	By binarySearchLink = By.linkText("Binary Search Trees");
	By implementationOfBstLink = By.linkText("Implementation Of BST");

	By tryHereButton = By.linkText("Try here>>>");
	By write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[contains(text(),'Run')]");

	public TreePage(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}

	public void ClickTreeGetStared() {
		webDriver.findElement(treeGetStared).click();
	}

	public void ClickOverviewLink() {
		webDriver.findElement(overviewLink).click();
	}

	public void ClickTerminologiesLink() {
		webDriver.findElement(terminologiesLink).click();
	}

	public void ClickTypeLink() {
		webDriver.findElement(typeLink).click();
	}

	public void ClickTreeLink() {
		webDriver.findElement(treeLink).click();
	}

	public void ClickTraversalsLink() {
		webDriver.findElement(traversalsLink).click();
	}

	public void ClickBinaryLink() {
		webDriver.findElement(binaryLink).click();
	}

	public void ClickTypesOfBinaryLink() {
		webDriver.findElement(typesOfBinaryLink).click();
	}

	public void ClickImplementationInPythonLink() {
		webDriver.findElement(implementationInPythonLink).click();
	}

	public void ClickBinaryTreeTraversalsLink() {
		webDriver.findElement(binaryTreeTraversalsLink).click();
	}

	public void ClickImplementationOfBinaryLink() {
		webDriver.findElement(implementationOfBinaryLink).click();
	}

	public void ClickApplicationsLink() {
		webDriver.findElement(applicationsLink).click();
	}

	public void ClickBinarySearchLink() {
		webDriver.findElement(binarySearchLink).click();
	}

	public void ClickImplementationOfBstLink() {
		webDriver.findElement(implementationOfBstLink).click();
	}

	public void ClickTryHereButton() {
		webDriver.findElement(tryHereButton).click();
	}

	public void Write() {
		webDriver.findElement(write).sendKeys("print 'welcome'");
	}
	public void Run() {
		webDriver.findElement(run).click();
	}

}
