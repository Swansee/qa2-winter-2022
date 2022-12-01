package homework3;

// 3*. Задача - выбрать Латвию, кликнуть на нее, перегрузится страничка и проверить, что появилось название - Car Rental in Latvia.

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomeWorkSeleniumTestHard {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By TOP_LOCATION_LINK = By.xpath(".//div [@class = 'tl-box']/a");

    private WebDriver browser;

    private WebDriverWait wait;

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver","c://System//QA//chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        List<WebElement> links = browser.findElements(TOP_LOCATION_LINK);

        boolean isCountryFound = false;
//        for (WebElement location : topLocations) {
        for (WebElement link : links) {
            if (link.getText().equals("Latvia")) {
                isCountryFound = true;
//                By location;
//                wait.until(ExpectedConditions.elementToBeClickable(location.findElement(By.tagName("a"))));
//                location.findElement(By.tagName("a")).click();
//                wait.until(ExpectedConditions.elementToBeClickable(link.findElement(By.tagName("a"))));
                link.click();
                break;
            }
            Assertions.assertTrue(isCountryFound, "Country not found");
        }


//        browser.findElement(By.linkText("Latvia")).click();
//        browser.findElement(By.className("sb-residence-text")).click();
//        By span;
//       browser.findElement(By.xpath(/span[text()='Latvia']));


//        if ( browser.findElement(By.id("sb-country")) = "Latvia" ) {
//            System.out.println("TEST OK");
//        } else {
//            System.out.println("TEST ne OK");
//        }


    }
}
