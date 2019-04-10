import static org.junit.Assert.*;

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
        String searchTerm = "Computers";
        String productInfo;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Guesto\\Testing\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://amazon.com");
        WebElement element = driver.findElement(By.xpath("//input[contains(@id, 'search')]"));
        element.click();
        element.sendKeys(searchTerm, Keys.ENTER);

        element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class = 'a-link-normal a-text-normal'])[1]")));

        element.click();

        element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id = 'breadcrumb-back-link']")));

        productInfo = driver.findElement(By.id("productTitle")).getText();
        element = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));

        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", "//google.com");

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title = 'Buscar']")));
        element.click();
        element.sendKeys(productInfo, Keys.ENTER);

        element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class = 'g'])[3]//a")));
        element.click();

        element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h1)[1]")));

        assertTrue((element.isDisplayed()));

        driver.switchTo().window(tabs.get(0));
        //driver.close();
    }
}