package org.example.test_case;//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class org.example.test_case.Main {
//    public static void main(String[] args) {
//        System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\plomi\\Selenium\\ChromeDriver\\chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://www.google.com");
//    }
//}

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Set up browser
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open webpage
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();

        // HomePage
        HomePage homePage = new HomePage(driver);
        // LoginPage
        LoginPage loginPage = new LoginPage(driver);

        // click on login button in homepage
        homePage.loginClick();

        // enter user name
        loginPage.enterUserName("gunjankaushik");

        //enter password
        loginPage.enterPassword("Password@123");

        //click on login button
        loginPage.loginClick();
    }
}


//
//        // click on the Login button
//        driver.findElement(By.id("login")).click();
//
//        // user name, password, click and log in
//        driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
//        driver.findElement(By.id("password")).sendKeys("Password@123");
//        driver.findElement(By.id("login")).click();
//
//
//        // wait for 5 sek before move on
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        // show the place where you are in Intelij terminal
//        System.out.println("Jesteś na stronie: " + driver.getCurrentUrl());
//
//        // close Chrome
//        driver.quit();
//

