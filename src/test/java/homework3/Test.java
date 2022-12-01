package homework3;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By SORT_BY_PRICE = By.xpath(".//div [@class='dc-ui dropdown inline-block']");

    private WebDriver browser;
    private WebDriverWait wait;

    @org.junit.jupiter.api.Test
    public void openHomePageCheck() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c://System//QA//chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.discovercars.com/en/search/7384b5b3-7e5f-4be0-9643-139ff41939bf");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();
        wait.until(ExpectedConditions.elementToBeClickable(SORT_BY_PRICE));
        browser.findElement(By.xpath(".//label [contains(@for, 'number-of-seats-seats-4')]")).click();




//        browser.findElement(By.linkText("Latvia")).click();
//        browser.findElement(By.className("sb-residence-text")).click();

    }

}
