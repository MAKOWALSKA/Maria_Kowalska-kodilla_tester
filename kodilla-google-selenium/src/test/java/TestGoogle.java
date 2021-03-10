import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.Random;

import static org.junit.Assert.assertSame;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dawid\\IdeaProjects\\Maria_Kowalska-kodilla_tester\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.pl");
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/span/div/div/iframe")));
        driver.findElement(By.xpath("//html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span")).click();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void testOneRandomResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.randomResult();
        Random random = new Random(driver);

        WebElement webElementTest = random.clickRandomPage(webElement);

        assertSame(webElement, webElementTest);
    }
}
