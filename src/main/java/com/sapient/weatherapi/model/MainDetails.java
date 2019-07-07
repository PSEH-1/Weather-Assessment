package com.sapient.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainDetails {
    private double temp;
    @JsonProperty("temp_min")
    private double tempMinimum;
}
