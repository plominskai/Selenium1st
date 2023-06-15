package stepDefinitions;

import cucumber.api.java.en.Given;
import org.example.pages.DashboardPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Steps {
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
        System.setProperty("Webdriver.Chrome.Driver", "C:\\Users\\plomi\\Selenium\\chromedriver\\chromedriver.exe");
        // Set up browser
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);

        // Open webpage
        driver.get("https://demoqa.com/books");
        driver.manage().window().maximize();
        // HomePage
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        // LoginPage
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        // DashboardPage
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

        // click on login button in homepage
        homePage.loginClick();

        // enter user name
        loginPage.enterUserName("gunjankaushik");

        //enter password
        loginPage.enterPassword("Password@123");

        //click on login button
        loginPage.loginClick();

        // stop for 5 sec

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // compare logged user with entered user
        dashboardPage.isCurrentUserCorrect("gunjankaushik");
    }
}

