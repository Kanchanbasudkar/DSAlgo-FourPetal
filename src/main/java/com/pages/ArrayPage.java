package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ArrayPage {
    private WebDriver webDriver;
    By getstarted = By.xpath("//h5[contains(text(),'Array')]/..//a");
    By arraysinPython = By.linkText("Arrays in Python");
    By arraysusingList = By.partialLinkText("Arrays Using List");
    By basicoperation = By.linkText("Basic Operations in Lists");
    By applicationsofarray = By.linkText("Applications of Array");
    By typehere = By.linkText("Try here>>>");
    By writeintexbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
    By runbutton = By.xpath("//button[contains(text(),'Run')]");

    public ArrayPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    public void getStarted() {
        webDriver.findElement(getstarted).click();
    }

    public void ClickonArrayinPython() {
        webDriver.findElement(arraysinPython).click();
    }

    public void ClickonArrayusingList() throws InterruptedException {
        webDriver.findElement(arraysusingList).click();
    }

    public void ClickonBasicOperation() {
        webDriver.findElement(basicoperation).click();
    }

    public void ClickonApplication() {
        webDriver.findElement(applicationsofarray).click();
    }

    public void tryhere() {
        webDriver.findElement(typehere).click();
    }

    public void Txtarea() throws InterruptedException {
        webDriver.findElement(writeintexbox).sendKeys("print 'welcome'");
        System.out.println("enter here");

    }

    public void runButtton() {
        webDriver.findElement(runbutton).click();
    }

    public void Geterrormessage() throws InterruptedException {

        webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
        webDriver.findElement(writeintexbox).sendKeys("'welcome'");
        webDriver.findElement(writeintexbox).sendKeys(Keys.ENTER);
        System.out.println("check this step");
    }

    public String getErrorText() {
        Alert alert = webDriver.switchTo().alert();
        String message = alert.getText();
        System.out.println(message);
        alert.accept();
        return message;
    }


}