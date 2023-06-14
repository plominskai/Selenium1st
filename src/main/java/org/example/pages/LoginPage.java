package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // tworzymy zmienne
    @FindBy(id = "userName")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login")
    WebElement login;

    // metody które będa je wykorzystywać, zmienna String która nazywa się user, jeśli chcemy w Main podawać login
    public void enterUserName(String user) {
        userName.sendKeys(user);
    }

    // zmienna password
    public void enterPassword(String userPassword) {
        password.sendKeys(userPassword);
    }

    // method to click login button
    public void loginClick() {
        login.click();
    }
}
