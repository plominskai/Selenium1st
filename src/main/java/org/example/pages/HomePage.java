package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    // button declaration
    By loginButton = By.id("login");

    // method to click login button
    public void loginClick() {
        driver.findElement(loginButton).click();
    }
}
