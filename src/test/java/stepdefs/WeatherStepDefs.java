package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Minute;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    private long cityId;
    private WeatherResponse response; //null

    @Given("city ID is: {long}")
    public void set_city_id(long cityId ){
        this.cityId = cityId;
    }

    @When("we are requesting weather forecast")
    public void request_weather() throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestWeather(cityId);
    }

    @Then("coordinates are:")
    public void check_coordinates(Map<String, Double> params){
        Assertions.assertEquals(params.get("latitude"), response.getLat(), "Wrong latitude");
        Assertions.assertEquals(params.get("longitude"), response.getLon(), "Wrong longitude");

    }

    @Then("timezone information is:")
    public void check_timezones (Map<String, String> params) {
        Assertions.assertEquals(params.get("timezone"), response.getTimezone(), "Wrong timezone data");
        Assertions.assertEquals(params.get("offset"), response.getTimezoneOffset(), "Wrong timezone offset data");
    }

    @Then("current weather data is:")
    public void check_current_weather (Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response.getCurrent().getDt(), "Wrong current time data");
        Assertions.assertEquals(params.get("sunrise"), response.getCurrent().getSunrise(), "Wrong sunrise data");
        Assertions.assertEquals(params.get("sunset"), response.getCurrent().getSunset(), "Wrong sunset data");
        Assertions.assertEquals(params.get("temperature"), response.getCurrent().getTemp(), "Wrong temperature data");
        Assertions.assertEquals(params.get("feels_like"), response.getCurrent().getFeelsLike(), "Wrong feels_like data");
        Assertions.assertEquals(params.get("pressure"), response.getCurrent().getPressure(), "Wrong pressure data");
        Assertions.assertEquals(params.get("humidity"), response.getCurrent().getHumidity(), "Wrong humidity data");
        Assertions.assertEquals(params.get("dew_point"), response.getCurrent().getDewPoint(), "Wrong dew_point data");
        Assertions.assertEquals(params.get("uvi"), response.getCurrent().getUvi(), "Wrong uvi data");
        Assertions.assertEquals(params.get("clouds"), response.getCurrent().getClouds(), "Wrong clouds data");
        Assertions.assertEquals(params.get("visibility"), response.getCurrent().getVisibility(), "Wrong visibility data");
        Assertions.assertEquals(params.get("wind_speed"), response.getCurrent().getWindSpeed(), "Wrong wind_speed data");
        Assertions.assertEquals(params.get("wind_deg"), response.getCurrent().getWindDeg(), "Wrong wind_deg data");
        Assertions.assertEquals(params.get("wind_gust"), response.getCurrent().getWindGust(), "Wrong wind_gust data");
        Assertions.assertEquals(params.get("id"), response.getCurrent().getWeather().get(0).getId(), "Wrong id data");
        Assertions.assertEquals(params.get("main"), response.getCurrent().getWeather().get(0).getMain(), "Wrong main data");
        Assertions.assertEquals(params.get("description"), response.getCurrent().getWeather().get(0).getDescription(), "Wrong description data");
        Assertions.assertEquals(params.get("icon"), response.getCurrent().getWeather().get(0).getIcon(), "Wrong icon data");
    }

    @Then("minutely weather data is:")
    public void check_minutely_weather (int index, Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response.getMinutely().get(0).getDt(), "Wrong minutely weather time data");
        Assertions.assertEquals(params.get("precipitation"), response.getMinutely().get(0).getPrecipitation(), "Wrong minutely weather precipitation data");
    }

    @Then("hourly weather data is:")
    public void check_hourly_weather (int index, Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response.getHourly().get(0).getDt(), "Wrong time");
        Assertions.assertEquals(params.get("temperature"), response.getHourly().get(0).getTemp(), "Wrong temperature data");
        Assertions.assertEquals(params.get("feels_like"), response.getHourly().get(0).getFeelsLike(), "Wrong feels_like data");
        Assertions.assertEquals(params.get("pressure"), response.getHourly().get(0).getPressure(), "Wrong pressure data");
        Assertions.assertEquals(params.get("humidity"), response.getHourly().get(0).getHumidity(), "Wrong humidity data");
        Assertions.assertEquals(params.get("dew_point"), response.getHourly().get(0).getDewPoint(), "Wrong dew_point data");
        Assertions.assertEquals(params.get("uvi"), response.getHourly().get(0).getUvi(), "Wrong uvi data");
        Assertions.assertEquals(params.get("clouds"), response.getHourly().get(0).getClouds(), "Wrong clouds data");
        Assertions.assertEquals(params.get("visibility"), response.getHourly().get(0).getVisibility(), "Wrong visibility data");
        Assertions.assertEquals(params.get("wind_speed"), response.getHourly().get(0).getWindSpeed(), "Wrong wind_speed data");
        Assertions.assertEquals(params.get("wind_deg"), response.getHourly().get(0).getWindDeg(), "Wrong wind_deg data");
        Assertions.assertEquals(params.get("wind_gust"), response.getHourly().get(0).getWindGust(), "Wrong wind_gust data");
        Assertions.assertEquals(params.get("id"), response.getHourly().get(0).getWeather().get(0).getId(), "Wrong id data");
        Assertions.assertEquals(params.get("main"), response.getHourly().get(0).getWeather().get(0).getMain(), "Wrong main data");
        Assertions.assertEquals(params.get("description"), response.getHourly().get(0).getWeather().get(0).getDescription(), "Wrong description data");
        Assertions.assertEquals(params.get("icon"), response.getHourly().get(0).getWeather().get(0).getIcon(), "Wrong icon data");
        Assertions.assertEquals(params.get("pop"), response.getHourly().get(0).getPop(), "Wrong pop data");
    }

    @Then("daily weather data is:")
    public void check_daily_weather (Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response.getDaily().get(0).getDt(), "Wrong time");
        Assertions.assertEquals(params.get("sunrise"), response.getDaily().get(0).getSunrise(), "Wrong sunrise data");
        Assertions.assertEquals(params.get("sunset"), response.getDaily().get(0).getSunset(), "Wrong sunset data");
        Assertions.assertEquals(params.get("moonrise"), response.getDaily().get(0).getMoonrise(), "Wrong moonrise data");
        Assertions.assertEquals(params.get("moonset"), response.getDaily().get(0).getMoonset(), "Wrong moonset data");
        Assertions.assertEquals(params.get("moon_phase"), response.getDaily().get(0).getMoonPhase(), "Wrong moon_phase data");

        Assertions.assertEquals(params.get("day"), response.getDaily().get(0).getTemp().getDay(), "Wrong day temp data");
        Assertions.assertEquals(params.get("min"), response.getDaily().get(0).getTemp().getMin(), "Wrong min temp data");
        Assertions.assertEquals(params.get("max"), response.getDaily().get(0).getTemp().getMax(), "Wrong max temp data");
        Assertions.assertEquals(params.get("night"), response.getDaily().get(0).getTemp().getNight(), "Wrong night temp data");
        Assertions.assertEquals(params.get("eve"), response.getDaily().get(0).getTemp().getEve(), "Wrong eve temp data");
        Assertions.assertEquals(params.get("morn"), response.getDaily().get(0).getTemp().getMorn(), "Wrong morn temp data");

        Assertions.assertEquals(params.get("day"), response.getDaily().get(0).getFeelsLike().getDay(), "Wrong feels_like day data");
        Assertions.assertEquals(params.get("night"), response.getDaily().get(0).getFeelsLike().getNight(), "Wrong feels_like night data");
        Assertions.assertEquals(params.get("eve"), response.getDaily().get(0).getFeelsLike().getEve(), "Wrong feels_like eve data");
        Assertions.assertEquals(params.get("morn"), response.getDaily().get(0).getFeelsLike().getMorn(), "Wrong feels_like morn data");

        Assertions.assertEquals(params.get("pressure"), response.getDaily().get(0).getPressure(), "Wrong pressure data");
        Assertions.assertEquals(params.get("humidity"), response.getDaily().get(0).getHumidity(), "Wrong humidity data");
        Assertions.assertEquals(params.get("dew_point"), response.getDaily().get(0).getDewPoint(), "Wrong dew_point data");
        Assertions.assertEquals(params.get("wind_speed"), response.getDaily().get(0).getWindSpeed(), "Wrong wind_speed data");
        Assertions.assertEquals(params.get("wind_deg"), response.getDaily().get(0).getWindDeg(), "Wrong wind_deg data");
        Assertions.assertEquals(params.get("wind_gust"), response.getDaily().get(0).getWindGust(), "Wrong wind_gust data");

        Assertions.assertEquals(params.get("id"), response.getDaily().get(0).getWeather().get(0).getId(), "Wrong id data");
        Assertions.assertEquals(params.get("main"), response.getDaily().get(0).getWeather().get(0).getMain(), "Wrong main data");
        Assertions.assertEquals(params.get("description"), response.getDaily().get(0).getWeather().get(0).getDescription(), "Wrong description data");
        Assertions.assertEquals(params.get("icon"), response.getDaily().get(0).getWeather().get(0).getIcon(), "Wrong icon data");

        Assertions.assertEquals(params.get("clouds"), response.getDaily().get(0).getWindGust(), "Wrong clouds data");
        Assertions.assertEquals(params.get("pop"), response.getDaily().get(0).getPop(), "Wrong pop data");
        Assertions.assertEquals(params.get("rain"), response.getDaily().get(0).getRain(), "Wrong rain data");
        Assertions.assertEquals(params.get("uvi"), response.getDaily().get(0).getUvi(), "Wrong uvi data");
    }

    @Then("alert Nr.{int} received:")
    public void check_alert (int index, Map<String, String> params){
        Assertions.assertEquals(params.get("sender"), response.getAlerts().get(0).getSenderName(), "Wrong alert sender name");
        Assertions.assertEquals(params.get("event"), response.getAlerts().get(0).getEvent(), "Wrong alert event");
        Assertions.assertEquals(params.get("start"), response.getAlerts().get(0).getStart(), "Wrong start alert data");
        Assertions.assertEquals(params.get("end"), response.getAlerts().get(0).getEnd(), "Wrong end alert data");
        Assertions.assertEquals(params.get("description"), response.getAlerts().get(0).getDescription(), "Wrong alert description");
    }

    @Then("tags for alert Nr.{int} received:")
    public void check_tags (int index, List<String> tags){
        Assertions.assertEquals(tags.get(0), response.getAlerts().get(0).getTags().get(0), "Wrong alert sender name");
        Assertions.assertEquals(tags.get(0), response.getAlerts().get(0).getTags().get(0), "Wrong alert event");
    }
}