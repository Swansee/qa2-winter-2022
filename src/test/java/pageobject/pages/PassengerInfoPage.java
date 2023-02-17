package pageobject.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BaseFunc;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;

import java.time.Duration;

public class PassengerInfoPage {

    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_BTN = By.xpath(".//span[@onclick='setLang();']");
    private final By BOOK_BTN = By.id("book2");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE_BLOCK = By.id("response");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

//    public void typePassengerInfo (String firstname, String lastname, String discount, String adults, String children, String bag, String flight) {
//        baseFunc.type(FIRST_NAME, firstname);
//        baseFunc.type(LAST_NAME, lastname);
//        baseFunc.type(DISCOUNT, discount);
//        baseFunc.type(ADULTS, adults);
//        baseFunc.type(CHILDREN, children);
//        baseFunc.type(BAG, bag);
//        baseFunc.select(FLIGHT, flight);
//        baseFunc.click(GET_PRICE_BTN);
//        baseFunc.clickOnBookBtn(BOOK_BTN);
//    }
    public void typePassengerInfo (FlightInfo info) {
        baseFunc.type(FIRST_NAME, info.getPassenger().getFirstName());
        baseFunc.type(LAST_NAME, info.getPassenger().getLastName());
        baseFunc.type(DISCOUNT, info.getDiscount());
        baseFunc.type(ADULTS, info.getAdultsCount());
        baseFunc.type(CHILDREN, info.getChildCount());
        baseFunc.type(BAG, info.getBagsCount());
        baseFunc.selectByText(FLIGHT, info.getFlightDate());

        baseFunc.click(GET_PRICE_BTN);
        baseFunc.waitForElementsCountToBe(RESERVATION_INFO, 5);
//        baseFunc.clickOnBookBtn(BOOK_BTN)
    }

    public String getFirstFromAirport(){
        return baseFunc.findElements(RESERVATION_INFO).get(0).getText();
    }
    public String getFirstToAirport(){
        return baseFunc.findElements(RESERVATION_INFO).get(1).getText();
    }
    public String getSecondFromAirport(){
        return baseFunc.findElements(RESERVATION_INFO).get(3).getText();
    }
    public String getSecondToAirport(){
        return baseFunc.findElements(RESERVATION_INFO).get(4).getText();
    }
    public String getPassengerName(){
        String name = baseFunc.findElements(RESERVATION_INFO).get(2).getText();
        return name.substring(0, name.length() - 1);
    }

    public String getPrice(){
        String text = baseFunc.findElement(RESPONSE_BLOCK).getText();
        return StringUtils.substringBetween(text,"for ", " EUR");
    }

    public void book() {
        baseFunc.click(BOOK_BTN);
    }


}
