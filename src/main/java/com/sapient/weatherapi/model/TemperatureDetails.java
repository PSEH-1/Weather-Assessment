package com.sapient.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TemperatureDetails {
    private long dt;
    private MainDetails main;
    private WeatherDetails weather;
    private Clouds clouds;
    private Wind wind;
    @JsonProperty("dt_txt")
    private String dateString;
}
