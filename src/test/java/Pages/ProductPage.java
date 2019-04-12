package Pages;

import static org.testng.AssertJUnit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class ProductPage extends WebPage {

    public ProductPage(WebDriver driver) {
        super (driver);
    }

    public static void goToHomePage(WebDriver driver) {
        WebElement homeButton = driver.findElement(By.id("nav-logo"));
        homeButton.click();

        homeButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
    }

    public static void goToSearchPage(WebDriver driver) {
        WebElement backButton = driver.findElement(By.id("breadcrumb-back-link"));
        backButton.click();

        backButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
    }
}
