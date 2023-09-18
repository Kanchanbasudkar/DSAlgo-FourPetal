package com.dsalgo.pages;

import com.dsalgo.factory.BrowserDriver;
import org.openqa.selenium.By;

public class HomePage extends BrowserDriver {
    private static String registerLinkText = "Register";
    private static String signInLinkText = "SignIn";

    public static void clickRegisterLink() {
        By registerLink = By.linkText(registerLinkText);
        BrowserDriver.webDriver.findElement(registerLink).click();
    }

    public void clickSignInLink() {
        By registerLink = By.linkText(registerLinkText);
        BrowserDriver.webDriver.findElement(registerLink).click();
    }
}
