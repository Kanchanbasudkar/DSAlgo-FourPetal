package com.pages;

import com.qa.util.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SignInPage {
    private WebDriver webDriver;

    By signIn = By.partialLinkText("Sign");

    By userName = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@name=\"password\"]");
    By loginBtn = By.xpath("//input[@value=\"Login\"]");

    String userNameExcelValue;
    String passwordExcelValue;
    public SignInPage(WebDriver webDriver) {
        super();
        this.webDriver = webDriver;
    }

    public void clickSignIn() {
        webDriver.findElement(signIn).click();
    }

    public void sendUsername() throws IOException {
        webDriver.findElement(userName).sendKeys(userNameExcelValue);
    }

    public void readDataFromSheet(String sheetName, Integer rowNumber) throws IOException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData("./src/test/resources/exceldata/signInTestData.xlsx", sheetName);
        userNameExcelValue = testdata.get(rowNumber).get("userName");
        passwordExcelValue = testdata.get(rowNumber).get("password");
    }

    public void sendPassword() {
        webDriver.findElement(password).sendKeys(passwordExcelValue);
    }

    public HomePage clickLoginBtn() {
        webDriver.findElement(loginBtn).click();
        return new HomePage(webDriver);

    }


}
