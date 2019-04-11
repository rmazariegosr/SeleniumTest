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

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitToLoad() {
        final String logoName = "nav-logo";

        WebElement title = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='" + logoName + "']")));
    }

    public void goToLogin() {
        final String headerType = "h1";
        final String titleText = "Iniciar sesión";

        WebElement loginLink = driver.findElement (By.xpath("//a[@id = 'nav-link-accountlist']"));
        loginLink.click();

        loginLink = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text() = 'Iniciar sesión']")));
    }

}
