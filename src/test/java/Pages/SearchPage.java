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

public class SearchPage extends WebPage {

    public SearchPage(WebDriver driver) {
        super (driver);
    }

    public static void goToHomePage(WebDriver driver) {
        WebElement homeButton = driver.findElement(By.id("nav-logo"));
        homeButton.click();

        homeButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
    }

    public static void clickResult(WebDriver driver, int n){
        System.out.println("Attempting to select a button.");
        int results = driver.findElements(By.className("a-link-normal a-text-normal")).size();
        System.out.println("Found: " + Integer.toString(results) + " results.");
        String index = Integer.toString(n-1);

        WebElement productLink = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@data-index = '" + index + "']//a)[2]")));

        System.out.println("Element found. Attempting to click...");

        productLink.click();
    }
}
