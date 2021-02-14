package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        driver.findElement(By.xpath("//button[@data-role=\"accept-consent\"]")).click();

        WebElement inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/div[2]/div/select"));
        inputField.sendKeys("Elektronika");
        inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/input"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.xpath("//*[@data-box-name=\"allegro.metrumHeader.search\"]/div/form/button"));
        inputField.click();
    }
}
