package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GraphPage {

		private WebDriver webDriver;

		By graphGetStared = By.xpath("//h5[contains(text(),'Graph')]/..//a");
		By graphRepLink = By.linkText("Graph Representations");
		By tryHereButton = By.linkText("Try here>>>");
		By write = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		By run = By.xpath("//button[contains(text(),'Run')]");
		By graphLink = By.linkText("Graph");



		public GraphPage(WebDriver webDriver) {
			super();
			this.webDriver = webDriver;
		}

		public void clickGraphGetstarted() {

			webDriver.findElement(graphGetStared).click();
		}
			public void ClickGraphRepLink() {
            webDriver.findElement(graphRepLink).click();
			}
			public void ClickGraphReptry() {
            webDriver.findElement(tryHereButton).click();
			}
			public void PrintGraphRep() {

            webDriver.findElement(write).sendKeys("print 'welcome'");
			}
			public void ClickRunGraphRep() {

            webDriver.findElement(run).click();

	}
			public void ClickGraphLink() {
	            webDriver.findElement(graphLink).click();
			}
			public void ClickGraphTry() {

	            webDriver.findElement(tryHereButton).click();
			}
			public void PrintGraph() {

	            webDriver.findElement(write).sendKeys("print 'welcome'");
			}
			public void ClickRunGraph() {
	            webDriver.findElement(run).click();

		}


}
