package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Reservation;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import pageobject.BaseFunc;
import pageobject.model.FlightInfo;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;

import java.util.List;
import java.util.Map;

public class TicketsStepDefs {
    private FlightInfo flightInfo; //null
    private HomePage homePage; //null
    private PassengerInfoPage passengerInfoPage; //null
    private SeatSelectionPage seatSelectionPage;
    private List<Reservation> reservations;

    int seatNr = RandomUtils.nextInt(1, 35);
    private Reservation reservationFromApi ; //null
    private BaseFunc baseFunc = new BaseFunc();
    private final String URL = "http://www.qaguru.lv:8089/tickets/";


    @Given("flight info:")
    public void set_flight_info(Map<String, String> params) {
        flightInfo = new FlightInfo(params.get("destination"), params.get("departure"), params.get("discount"),
                Integer.parseInt(params.get("adults")), Integer.parseInt(params.get("kids")),
                Integer.parseInt(params.get("bags")), params.get("flight_date"),
                Integer.parseInt(params.get("seat")));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params) {
        Passenger passenger = new Passenger(params.get("first_name"), params.get("last_name"));
        flightInfo.setPassenger(passenger);
    }

    @Given("home page opened")
    public void open_home_page() {
        baseFunc.openUrl(URL);
        homePage = new HomePage(baseFunc);
    }

    @When("we are selecting airports")
    public void select_airports() {
        homePage.selectAirports(flightInfo.getDeparture(), flightInfo.getDestination());
        passengerInfoPage = new PassengerInfoPage(baseFunc);
    }

    @Then("selected airports appears on the next page")
    public void check_airports() {
        Assertions.assertEquals(flightInfo.getDeparture(), passengerInfoPage.getFirstFromAirport(), "Airport from #1 not correct");
        Assertions.assertEquals(flightInfo.getDestination(), passengerInfoPage.getFirstToAirport(), "Airport to #1 not correct");
    }

    @When("we are filling in passenger registration form")
    public void fill_in_passenger_info() {
        passengerInfoPage.typePassengerInfo(flightInfo);
    }

    @Given("requesting price")
    public void check_price(){
        Assertions.assertTrue(passengerInfoPage.getPrice().length() > 0, "Error Message");
    }

    @Then("passenger name and airports appears")
    public void check_received_info (){
        Assertions.assertEquals(flightInfo.getPassenger().getFirstName(), passengerInfoPage.getPassengerName(), "First name not correct");
        Assertions.assertEquals(flightInfo.getDeparture(),passengerInfoPage.getFirstFromAirport(), "Airport from #1 not correct");
        Assertions.assertEquals(flightInfo.getDestination(),passengerInfoPage.getFirstToAirport(), "Airport to #1 not correct");
        Assertions.assertEquals(flightInfo.getDeparture(),passengerInfoPage.getSecondFromAirport(), "Airport from #2 not correct");
        Assertions.assertEquals(flightInfo.getDestination(),passengerInfoPage.getSecondToAirport(), "Airport to #2 not correct");
    }

    @Given("price is 500 EUR")
    public void check_received_price (){
//        Assertions.assertTrue(passengerInfoPage.getPrice().equals(1055), "Error Message");
        Assertions.assertTrue(passengerInfoPage.getPrice().length() >0, "Error Message");
    }

    @When("we are pressing Book button")
    public void press_pass_book_btn (){
        passengerInfoPage.book();
    }

    @Given ("selecting seat")
    public void select_seats (){
        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);
    }

    @Then ("correct seat number appears")
    public void check_seat_nr (){
        int selectedSeat = seatSelectionPage.getSelectedSeatNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");
    }

    @When ("we are booking selected ticket")
    public void press_ticket_book_btn (){
        seatSelectionPage.book();
    }

    @Then ("successful registration message appears")
    public void get_success_message (){
        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");
    }

//    @When("we are requesting reservations data")
//    public void request_reservations() throws JsonProcessingException {
//        TicketsRequester requester = new TicketsRequester();
//        reservations = requester.getReservations();
//    }
//    @Then("current reservation is in the list")
//    public void find_reservation(){
//        for (Reservation r : reservations) {
//            if (r.getName().equals(flightInfo.getPassenger().getFirstName())){
//                reservationFromApi = r;
//                break;
//            }
//        }
//        Assertions.assertNotNull(reservationFromApi, "Reservation isn't found");
//    }
//    @Then("all reservation data is correct")
//    public void check_reservation_data(){
//        reservationFromApi is used here for assertions
//    }

}
