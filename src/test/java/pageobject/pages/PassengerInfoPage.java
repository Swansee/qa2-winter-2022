package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BaseFunc;

import java.time.Duration;

public class PassengerInfoPage {

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span [@onclick='setLang();']");
    private final By BOOK_BTN = By.xpath("book2");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void typePassengerInfo (String firstname, String lastname, String discount, String adults, String children, String bag, String flight) {
        baseFunc.type(FIRST_NAME, firstname);
        baseFunc.type(LAST_NAME, lastname);
        baseFunc.type(DISCOUNT, discount);
        baseFunc.type(ADULTS, adults);
        baseFunc.type(CHILDREN, children);
        baseFunc.type(BAG, bag);
        baseFunc.select(FLIGHT, flight);
        baseFunc.click(GET_PRICE_BTN);
        baseFunc.clickOnBookBtn(BOOK_BTN);
    }
}
