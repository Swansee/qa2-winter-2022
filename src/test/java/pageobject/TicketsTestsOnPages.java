package pageobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatInfoPage;

import java.util.List;

public class TicketsTestsOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";


//    private final String FIRST_NAME = "First name";
//    private final String LAST_NAME = "Last name";
//    private final String DISCOUNT = "Discount code";
//    private final String ADULTS = "3";
//    private final String CHILDREN = "2";
//    private final String BAG = "1";
//    private final String FLIGHT = "13";

//    private final By GET_PRICE_RESPONSES = By.xpath(".//div [@id = 'response']/span");

    private final String SEAT = "10";


        private BaseFunc baseFunc = new BaseFunc();
    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("TestName", "TestSurname", "CCCCCC", 2,
                1, 4, "16-05-2018");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
//        infoPage.typePassengerInfo(FIRST_NAME, LAST_NAME, DISCOUNT, ADULTS, CHILDREN, BAG, FLIGHT);
        infoPage.typePassengerInfo(passenger);


        Assertions.assertEquals(FROM_AIRPORT,infoPage.getFirstFromAirport(), "Airport from #1 not correct");
        Assertions.assertEquals(TO_AIRPORT,infoPage.getFirstToAirport(), "Airport to #1 not correct");
        Assertions.assertEquals(FROM_AIRPORT,infoPage.getSecondFromAirport(), "Airport from #2 not correct");
        Assertions.assertEquals(TO_AIRPORT,infoPage.getSecondToAirport(), "Airport to #2 not correct");
        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(), "First name not correct");

        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error Message");

//        List<WebElement> responses = baseFunc.browser.findElements(GET_PRICE_RESPONSES);
//        System.out.println(responses.get(0).getText());
//        System.out.println(responses.get(1).getText());
//        System.out.println(responses.get(2).getText());
//
//        String firstNameSelected = responses.get(0).getText();
//        String airportFromSelected = responses.get(1).getText();
//        String airportToSelected = responses.get(2).getText();

//        Assertions.assertEquals(FIRST_NAME, firstNameSelected, "First name not correct");
//        Assertions.assertEquals(FROM_AIRPORT, airportFromSelected, "Airport from not correct");
//



        SeatInfoPage seatInfoPage = new SeatInfoPage(baseFunc);
        seatInfoPage.chooseSeat(SEAT);

        //... переписать на пейджах
    }
}
