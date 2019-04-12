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
import org.openqa.selenium.By;

public class LoginPage extends WebPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static void goToHomePage(WebDriver driver) {
        WebElement homeButton = driver.findElement(By.className("a-link-nav-icon"));
        homeButton.click();

        System.out.println("Attemptoing to return to home page");

        homeButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
    }

    public static void fillLoginForm(WebDriver driver, String username, String password){
        WebElement form = driver.findElement(By.id("ap_email"));
        form.click();
        form.sendKeys(username);

        form = driver.findElement(By.id("ap_password"));
        form.click();
        form.sendKeys(password);

        form = driver.findElement(By.id("signInSubmit"));
        form.click();

        form = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("a-alert-heading")));
    }
}
