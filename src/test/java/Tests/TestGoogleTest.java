package Tests;

import static org.testng.AssertJUnit.*;

import Pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class TestGoogleTest{


    @Test
    public void searchbar_with_XPath() {
        WebDriver driver;
        WebElement element;

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://amazon.com");
        HomePage.waitToLoad(driver);
        System.out.println("Home page loaded.");
        HomePage.goToLogin(driver);

        LoginPage.fillLoginForm(driver, "bender@botmail.com", "immabot");
        LoginPage.goToHomePage(driver);

        HomePage.searchProducts(driver,"battery charger");
        SearchPage.clickResult(driver,3);

        ProductPage.goToSearchPage(driver);
        SearchPage.clickResult(driver,2);
        ProductPage.goToSearchPage(driver);
        SearchPage.clickResult(driver,1);
        ProductPage.goToHomePage(driver);

        element = driver.findElement(By.id("twotabsearchtextbox"));

        assertTrue(element.isDisplayed());
    }
}