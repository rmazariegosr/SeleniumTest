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

public class HomePage extends WebPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static void waitToLoad(WebDriver driver) {
        final String logoName = "nav-logo";

        WebElement title = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='" + logoName + "']")));
    }

    public static void goToLogin(WebDriver driver) {

        WebElement loginLink = driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']"));

        loginLink.click();

        loginLink = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
    }

    public static void searchProducts(WebDriver driver, String s) {
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        searchBar.sendKeys(s, Keys.ENTER);
        searchBar = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
    }
}
