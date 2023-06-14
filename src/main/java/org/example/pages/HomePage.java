package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(id = "login")
    WebElement login;

    // method to click login button
    public void loginClick() {
        login.click();
    }
}
