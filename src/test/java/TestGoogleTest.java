import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestGoogleTest{

    @Test
    public void searchbar_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.get("http://amazon.com");
        WebElement searchBar = browser.findElement(By.id("twotabsearchtextbox"));
        assertTrue((searchBar.isDisplayed()));

        browser.close();
    }

    @Test
    public void navigation_bar_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.get("http://amazon.com");
        WebElement searchBar = browser.findElement(By.id("nav-search"));
        assertTrue((searchBar.isDisplayed()));

        browser.close();
    }

    public void login_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.get("http://amazon.com");
        WebElement searchBar = browser.findElement(By.id("login"));
        assertTrue((searchBar.isDisplayed()));

        browser.close();
    }

    @Test
    public void searchbar_with_XPath() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://google.com");
        WebElement searchBar = driver.findElement(By.xpath("//input[contains(@name, 'q')]"));
        searchBar.click();
        searchBar.sendKeys("Computers");
        searchBar.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        assertTrue((searchBar.isDisplayed()));

        driver.close();
    }

    @Test
    public void password_with_XPath() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://amazon.com");
        WebElement searchBar = driver.findElement(By.xpath("//form[contains(@name, 'password')]"));
        assertTrue((searchBar.isDisplayed()));

        driver.close();
    }
}