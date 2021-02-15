package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCssSelector {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(9) > div > div > div > button")).click();

        WebElement category = driver.findElement(By.cssSelector("div > select"));
        Select choseCategory = new Select(category);
        choseCategory.selectByIndex(3);
        WebElement inputField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(5) > header > div > div > div:nth-child(1) > div > form > input"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.cssSelector("body > div.main-wrapper > div:nth-child(5) > header > div > div > div:nth-child(1) > div > form > button"));
        inputField.click();

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article:nth-child(1)")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("._9c44d_378hD > section > article"));
        for (WebElement products : productCards) {
            products.getText();
        }
    }
}
