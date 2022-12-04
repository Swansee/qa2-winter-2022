import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span [@onclick='setLang();']");

    private final By CHECK_RESULTS = By.xpath(".//div [@id='response']/span");

    private final By BOOK_BTN = By.id("book2");

    private final By CHOOSE_SEATS = By.xpath(".//div [contains(@onclick, 'seat')]");

    private final By BOOK_SEATS_BTN = By.id("book3");

    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void reservationCheck() {

        String seat = "10";

        System.setProperty("webdriver.chrome.driver","c://System//QA//chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

//        написали внизу метод   private void select(By locator, String value) {
//        и потому упростили код. строчки захайдил.
//
//        Select airportFrom = new Select(browser.findElement(FROM));
//        airportFrom.selectByValue("RIX");
//
//        Select airportTo = new Select(browser.findElement(TO));
//        airportTo.selectByValue("SFO");

        select(FROM, "RIX");
        select(TO, "SFO");

        browser.findElement(GO_BTN).click();
/*
        WebElement from = browser.findElement(By.xpath(".//span [@class = 'bTxt']"));
        String stFrom = from.getText();
        System.out.println("Airport from is : " + stFrom);
*/
 /*
        if ( stFrom = "FROM" ) {
            System.out.println("Airport from is OK");
        } else {
            System.out.println("Airport from is ne OK");
        }
*/

//        написали внизу метод   private void type(By locator, String text) {
//        и потому упростили код. строчки захайдил.
//        browser.findElement(FIRST_NAME).clear();
//        browser.findElement(FIRST_NAME).sendKeys("First Name");
//
//        browser.findElement(LAST_NAME).clear();
//        browser.findElement(LAST_NAME).sendKeys("Last Name");
//
//        browser.findElement(DISCOUNT).clear();
//        browser.findElement(DISCOUNT).sendKeys("First Name");
//
//        browser.findElement(ADULTS).clear();
//        browser.findElement(ADULTS).sendKeys("First Name");
//
//        browser.findElement(CHILDREN).clear();
//        browser.findElement(CHILDREN).sendKeys("First Name");
//
//        browser.findElement(BAG).clear();
//        browser.findElement(BAG).sendKeys("First Name");
//
//        browser.findElement(FLIGHT).clear();
//        browser.findElement(FLIGHT).sendKeys("First Name");

        type(FIRST_NAME, "First name");
        type(LAST_NAME, "Last name");
        type(DISCOUNT, "Discount code");
        type(ADULTS, "3");
        type(CHILDREN, "2");
        type(BAG, "1");
        select(FLIGHT, "13");

        browser.findElement(GET_PRICE_BTN).click();


        //browser.findElement(BOOK_BTN).click();

        //wait.until(ExpectedConditions.elementToBeClickable(BOOK_SEATS_BTN));

        //clickOnSeat(seat);

        //browser.findElement(BOOK_SEATS_BTN).click();



    }

    private void select(By locator, String value) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(value);
    }

    private void type(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        input.clear();
        input.sendKeys(text);
    }

    private void clickOnSeat(String seat) {
        List<WebElement> seats = browser.findElements(CHOOSE_SEATS);

        boolean isSeatCorrect = false;
        for (WebElement se : seats) {
            if (se.getText().equals(seat)) {
                isSeatCorrect = true;
                wait.until(ExpectedConditions.elementToBeClickable(se));
                se.click();
                break;
            }
        }
        Assertions.assertTrue(isSeatCorrect, "Seat nr. is correct");
    }

}

// домашнее задание - проверить что выбранные аэропорты появились под ПыжAir
// заполняем поля слева, назимает - гет прайс, проверяем что под Пыж появилось Имя, правильные аэропорты и появилась цена.
// после проверки - жмем кнопочку Бук - и выбираем нужное место (работаем с списками) и проверяем что выбрано правилтное место.
// еще раз жмем кнопку Бук - и проверяем что появилась надпись - Резервация завершена
// если не совпадает - то должно быть сообщение об ошибке

//https://community.jaspersoft.com/blog/how-compare-displayed-drop-down-select-valuesactual-values-displayed-are-matching-user-expected
//https://stackoverflow.com/questions/34350615/compare-the-records-in-a-drop-down-list-using-webdriver