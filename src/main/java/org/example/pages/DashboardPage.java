package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.TreeMap;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//label[@id=\"userName-value\"]")
    WebElement currentUser;

    public void isCurrentUserCorrect(String user1) {

        if (currentUser.getText().equalsIgnoreCase(user1)) {
            System.out.println("Correct user is logged" + ("\n") +
                    "Entered user: " + user1 + ("\n") + "Logged user: " + currentUser.getText());
        } else {
            System.out.println("Incorrect user is logged" + ("\n") +
                    "Entered user: " + user1 + ("\n") + "Logged user: " + currentUser.getText());
        }
    }
}



