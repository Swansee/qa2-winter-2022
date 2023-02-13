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
    public void check_timezones (Map<String, String> params){
        Assertions.assertEquals(params.get("timezone"), response.getTimezone(), "Wrong timezone");
//        Assertions.assertEquals(params.get("offset"), response.getTimezoneOffset(), "Wrong timezone offset");
    }
//
//    @Then("current weather data is:")
//    public void check_current_weather (Map<String, String> params){
//        Assertions.assertEquals(params.get("time"), response.getCurrent().getDt(), "Wrong time");
//        Assertions.assertEquals(params.get("sunrise"), response.getCurrent().getSunrise(), "Wrong sunrise");
//        Assertions.assertEquals(params.get("sunset"), response.getCurrent().getSunset(), "Wrong sunset");
//        Assertions.assertEquals(params.get("temperature"), response.getCurrent().getTemp(), "Wrong temperature");
//        Assertions.assertEquals(params.get("feels_like"), response.getCurrent().getFeelsLike(), "Wrong feels_like");
//        Assertions.assertEquals(params.get("pressure"), response.getCurrent().getPressure(), "Wrong pressure");
//        Assertions.assertEquals(params.get("humidity"), response.getCurrent().getHumidity(), "Wrong humidity");
//        Assertions.assertEquals(params.get("dew_point"), response.getCurrent().getDewPoint(), "Wrong dew_point");
//        Assertions.assertEquals(params.get("uvi"), response.getCurrent().getUvi(), "Wrong uvi");
//        Assertions.assertEquals(params.get("clouds"), response.getCurrent().getClouds(), "Wrong clouds");
//        Assertions.assertEquals(params.get("visibility"), response.getCurrent().getVisibility(), "Wrong visibility");
//        Assertions.assertEquals(params.get("wind_speed"), response.getCurrent().getWindSpeed(), "Wrong wind_speed");
//        Assertions.assertEquals(params.get("wind_deg"), response.getCurrent().getWindDeg(), "Wrong wind_deg");
//        Assertions.assertEquals(params.get("wind_gust"), response.getCurrent().getWindGust(), "Wrong wind_gust");
//    }

    @Then("minutely weather data is:")
    public void check_minutely_weather (Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response., "Wrong minutely weather time");
        Assertions.assertEquals(params.get("precipitation"), response., "Wrong minutely weather precipitation");
    }

    @Then("hourly weather data is:")
    public void check_hourly_weather (Map<String, String> params){
        Assertions.assertEquals(params.get("time"), response.getHourly(), "Wrong time");
    }

    @Then("daily weather data is:")
    public void check_daily_weather (Map<String, String> params){}


//    @Then("alert Nr.{int} received:")
//    public void check_alert (int index, Map<String, String> params){
//        Assertions.assertEquals(params.get("sender"), response.getSenderName(), "Wrong alert sender name");
//        Assertions.assertEquals(params.get("event"), response.getEvent(), "Wrong alert event");
//        Assertions.assertEquals(params.get("start"), response.getStart(), "Wrong start alert data");
//        Assertions.assertEquals(params.get("end"), response.getEnd(), "Wrong end alert data");
//        Assertions.assertEquals(params.get("description"), response.getDescription(), "Wrong alert description");
//    }

    @Then("tags for alert Nr.{int} received:")
    public void check_tags (int index, List<String> tags){}
}

/*
{
  "lat": 39.31,
  "lon": -74.5,
  "timezone": "America/New_York",
  "timezone_offset": -18000,
  "current": {
    "dt": 1646318698,
    "sunrise": 1646306882,
    "sunset": 1646347929,
    "temp": 282.21,
    "feels_like": 278.41,
    "pressure": 1014,
    "humidity": 65,
    "dew_point": 275.99,
    "uvi": 2.55,
    "clouds": 40,
    "visibility": 10000,
    "wind_speed": 8.75,
    "wind_deg": 360,
    "wind_gust": 13.89,
    "weather": [
      {
        "id": 802,
        "main": "Clouds",
        "description": "scattered clouds",
        "icon": "03d"
      }
    ]
  },
  "minutely": [
    {
      "dt": 1646318700,
      "precipitation": 0
    }
  ],
  "hourly": [
    {
      "dt": 1646316000,
      "temp": 281.94,
      "feels_like": 278.49,
      "pressure": 1014,
      "humidity": 67,
      "dew_point": 276.16,
      "uvi": 1.49,
      "clouds": 52,
      "visibility": 10000,
      "wind_speed": 7.16,
      "wind_deg": 313,
      "wind_gust": 10.71,
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04d"
        }
      ],
      "pop": 0.03
    }
  ],
  "daily": [
    {
      "dt": 1646326800,
      "sunrise": 1646306882,
      "sunset": 1646347929,
      "moonrise": 1646309880,
      "moonset": 1646352120,
      "moon_phase": 0.03,
      "temp": {
        "day": 281.63,
        "min": 271.72,
        "max": 282.21,
        "night": 271.72,
        "eve": 277.99,
        "morn": 280.92
      },
      "feels_like": {
        "day": 277.83,
        "night": 264.72,
        "eve": 273.35,
        "morn": 277.66
      },
      "pressure": 1016,
      "humidity": 55,
      "dew_point": 273.12,
      "wind_speed": 9.29,
      "wind_deg": 3,
      "wind_gust": 16.48,
      "weather": [
        {
          "id": 500,
          "main": "Rain",
          "description": "light rain",
          "icon": "10d"
        }
      ],
      "clouds": 49,
      "pop": 0.25,
      "rain": 0.11,
      "uvi": 3.38
    }
  ],
  "alerts": [
    {
      "sender_name": "NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)",
      "event": "Small Craft Advisory",
      "start": 1646344800,
      "end": 1646380800,
      "description": "...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS\nAFTERNOON TO 3 AM EST FRIDAY...\n* WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas\n3 to 5 ft expected.\n* WHERE...Coastal waters from Little Egg Inlet to Great Egg\nInlet NJ out 20 nm, Coastal waters from Great Egg Inlet to\nCape May NJ out 20 nm and Coastal waters from Manasquan Inlet\nto Little Egg Inlet NJ out 20 nm.\n* WHEN...From 5 PM this afternoon to 3 AM EST Friday.\n* IMPACTS...Conditions will be hazardous to small craft.",
      "tags": [
        "Sunny",
        "Clouds"
      ]
    }
  ]
}
 */