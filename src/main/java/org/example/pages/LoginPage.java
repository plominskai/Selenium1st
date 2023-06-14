package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // tworzymy zmienne
    By userName = By.id("userName");
    By password = By.id("password");
    By login = By.id("login");

    // metody które będa je wykorzystywać, zmienna String która nazywa się user, jeśli chcemy w Main podawać login
    public void enterUserName(String user){
        driver.findElement(userName).sendKeys(user);
    }

    // zmienna password
    public void enterPassword(String userPassword){
        driver.findElement(password).sendKeys(userPassword);
    }

    // method to click login button
    public void loginClick() {
        driver.findElement(login).click();
    }
}
