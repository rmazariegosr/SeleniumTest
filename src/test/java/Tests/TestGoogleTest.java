package Tests;

import static org.testng.AssertJUnit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import Pages.HomePage;


public class TestGoogleTest{


    @Test
    public void searchbar_with_XPath() {
        WebDriver driver;
        String searchTerm = "Computers";
        String productInfo;
        WebElement element;

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://amazon.com");
        HomePage home = new HomePage(driver);
        home.waitToLoad();
        home.goToLogin();


    }
}