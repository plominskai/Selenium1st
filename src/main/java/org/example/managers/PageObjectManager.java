package org.example.managers;

import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.activation.DataHandler;

public class PageObjectManager {
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private WebDriver driver;

    // webdriver

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    // 3 methods - get homepage if homepage is null than(?) create new homepage, if true / else (:) return existing homepage

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public DashboardPage getDashboardPage() {
        return (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage;
    }
}
