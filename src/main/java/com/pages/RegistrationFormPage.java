package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormPage {
    private WebDriver webDriver;
    By register = By.partialLinkText("Register");
    public RegistrationFormPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void ClickRegister() {
        webDriver.findElement(register).click();
    }
}
