package pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestsOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";


    private final String FIRST_NAME = "First name";
    private final String LAST_NAME = "Last name";
    private final String DISCOUNT = "Discount code";
    private final String ADULTS = "3";
    private final String CHILDREN = "2";
    private final String BAG = "1";
    private final String FLIGHT = "13";

    private final By BOOK_BTN = By.xpath("book2");

    private final By BOOK_SEATS_BTN = By.id("book3");

        private BaseFunc baseFunc = new BaseFunc();
    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.typePassengerInfo(FIRST_NAME, LAST_NAME, DISCOUNT, ADULTS, CHILDREN, BAG, FLIGHT);


        //... переписать на пейджах
    }
}
