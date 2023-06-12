//package org.example;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\plomi\\Selenium\\ChromeDriver\\chromedriver.exe");
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.get("https://www.google.com");
//    }
//}

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
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Google
        driver.get("https://www.w3schools.com/xml/xpath_syntax.asp");
        driver.manage().window().maximize();

        // Find path do accept cookie files -  //*[@id="accept-choices"]
        driver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();



    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\plomi\\Selenium\\chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//    }
//}