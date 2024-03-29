Feature: Weather forecast

  Scenario: Weather forecast for specific city
    Given city ID is: 52347
    When we are requesting weather forecast

    Then coordinates are:
      | latitude  | 39.31 |
      | longitude | -74.5 |

    And timezone information is:
      | timezone | America/New_York |
      | offset   | -18000           |

    And current weather data is:
      | time        | 1646318698      |
      | sunrise     | 1646306882      |
      | sunset      | 1646347929      |
      | temperature | 282.21          |
      | feels_like  | 278.41          |
      | pressure    | 1014            |
      | humidity    | 65              |
      | dew_point   | 275.99          |
      | uvi         | 2.55            |
      | clouds      | 40              |
      | visibility  | 10000           |
      | wind_speed  | 8.75            |
      | wind_deg    | 360             |
      | wind_gust   | 13.89           |
      | id          | 802             |
      | main        | Clouds          |
#      | description | scattered clouds | original (U Dimi oshibka)
      | description | scatteredclouds |
      | icon        | 03d             |


    And minutely weather data is:
      | time          | 1646318700 |
      | precipitation | 0          |

    And hourly weather data is:
      | time        | 1646316000   |
      | temperature | 281.94       |
      | feels_like  | 278.49       |
      | pressure    | 1014         |
      | humidity    | 67           |
      | dew_point   | 276.16       |
      | uvi         | 1.49         |
      | clouds      | 52           |
      | visibility  | 10000        |
      | wind_speed  | 7.16         |
      | wind_deg    | 313          |
      | wind_gust   | 10.71        |
      | id          | 803          |
      | main        | Clouds       |
#      | description | broken clouds | original (U Dimi oshibka)
      | description | brokenclouds |
      | icon        | 04d          |
      | pop         | 0.03         |

    And daily weather data is:
      | time        | 1646326800 |
      | sunrise     | 1646306882 |
      | sunset      | 1646347929 |
      | moonrise    | 1646309880 |
      | moonset     | 1646352120 |
      | moon_phase  | 0.03       |
      | temp_day    | 281.63     |
      | temp_min    | 271.72     |
      | temp_max    | 282.21     |
      | temp_night  | 271.72     |
      | temp_eve    | 277.99     |
      | temp_morn   | 280.92     |
      | day         | 277.83     |
      | night       | 264.72     |
      | eve         | 273.35     |
      | morn        | 277.66     |
      | pressure    | 1016       |
      | humidity    | 55         |
      | dew_point   | 273.12     |
      | wind_speed  | 9.29       |
      | wind_deg    | 3          |
      | wind_gust   | 16.48      |
      | id          | 500        |
      | main        | Rain       |
#      | description | light rain | original (U Dimi oshibka)
      | description | lightrain  |
      | icon        | 10d        |
      | clouds      | 49         |
      | pop         | 0.25       |
      | rain        | 0.11       |
      | uvi         | 3.38       |


    And alert Nr.2 received:
#     | sender      | NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)                                                                                                                                                                                                                                                                                                                                                                                                                                             |
      | sender      | NWSPhiladelphia-MountHolly(NewJersey,Delaware,SoutheasternPennsylvania)   |
#      | event       | Small Craft Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | event       | SmallCraftAdvisory                                                        |
      | start       | 1646344800                                                                |
      | end         | 1646380800                                                                |
#      | description | ...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS\nAFTERNOON TO 3 AM EST FRIDAY...\n* WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas\n3 to 5 ft expected.\n* WHERE...Coastal waters from Little Egg Inlet to Great Egg\nInlet NJ out 20 nm, Coastal waters from Great Egg Inlet to\nCape May NJ out 20 nm and Coastal waters from Manasquan Inlet\nto Little Egg Inlet NJ out 20 nm.\n* WHEN...From 5 PM this afternoon to 3 AM EST Friday.\n* IMPACTS...Conditions will be hazardous to small craft. |
      | description | ...SMALLCRAFTADVISORYREMAINSINEFFECTFROM5PMTHIS\nAFTERNOONTO3AMESTFRIDAY...\n*WHAT...Northwinds15to20ktwithgustsupto25ktandseas\n3to5ftexpected.\n*WHERE...CoastalwatersfromLittleEggInlettoGreatEgg\nInletNJout20nm,CoastalwatersfromGreatEggInletto\nCapeMayNJout20nmandCoastalwatersfromManasquanInlet\ntoLittleEggInletNJout20nm.\n*WHEN...From5PMthisafternoonto3AMESTFriday.\n*IMPACTS...Conditionswillbehazardoustosmallcraft.|

    And tags for alert Nr.2 received:
      | Sunny  |
      | Clouds |

#    Then latitude is 39.31
#    And longitude is -74.5
#    And timezone is "America/New_York"
#    And timezone offset is -18000
#    And current time is 1646318698
#    And current sunrise is at 1646306882
#    And current sunset is at 1646347929
#    And current temperature is 282.21 K




