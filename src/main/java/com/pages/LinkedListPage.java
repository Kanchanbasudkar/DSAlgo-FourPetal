package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListPage {


    private WebDriver driver;

    //By locators : Object Repository

    private By getStartedBtn = By.xpath(" //a[@href='linked-list']");
    private By Introduction = By.xpath("//a[normalize-space()='Introduction']");
    private By tryHerebtn = By.xpath(" //a[normalize-space()='Try here>>>']");
    private By codeMirror = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
    private By runBtn = By.xpath("//button[@type='button']");
    private By output = By.xpath("//pre[@id='output']");
    private By CreateLinkedList = By.linkText("Creating Linked LIst");
    private By typeOfLinkedList = By.linkText("Types of Linked List");
    private By implementList = By.linkText("Implement Linked List in Python");
    private By traversal = By.xpath("//a[normalize-space()='Traversal']");
    private By insertion = By.linkText("Insertion");
    private By deletion = By.linkText("Deletion");
    private By pracQuestions = By.linkText("Practice Questions");

    //Constructor of the page class

    public LinkedListPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    //  Page Actions

    public void clickLinkedListGetStartedButton() {
        driver.findElement(getStartedBtn).click();
    }

    public void introOfLinkedlist() {
        driver.findElement(Introduction).click();
    }

    public void tryHereLink() {
        driver.findElement(tryHerebtn).click();
    }

    public void codeMirrorText() {
        driver.findElement(codeMirror).sendKeys("print 'Welcome'");
        System.out.println(codeMirror);
    }

    public void codeOutput() {
        driver.findElement(output).getText();
    }

    public void clickRunButton() {
        driver.findElement(runBtn).click();
    }

    // creating Linked List
    public void createLnkList() {
        driver.findElement(CreateLinkedList).click();
    }

    // types of Linked list
    public void typesOfLinkedList() {
        driver.findElement(typeOfLinkedList).click();
    }

    // implement linked list
    public void implementLinkedlist() {
        driver.findElement(implementList).click();
    }

    // Traversal
    public void traversalLink() {
        driver.findElement(traversal).click();
    }

    // Insertion
    public void insertionLink() {
        driver.findElement(insertion).click();
    }

    // Deletion
    public void deletionLink() {
        driver.findElement(deletion).click();
    }

    // Practice questions
    public void practiceQuestionsLink() {
        driver.findElement(pracQuestions).click();
    }
}
	 


