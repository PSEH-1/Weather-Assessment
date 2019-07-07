package com.sapient.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class City {
    private long id;
    @JsonProperty("name")
    private String cityName;
    @JsonProperty("country")
    private String countryCode;
    @JsonProperty("list")
    private List<TemperatureDetails> temperatureDetailsList;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public List<TemperatureDetails> getTemperatureDetailsList() {
		return temperatureDetailsList;
	}
	public void setTemperatureDetailsList(List<TemperatureDetails> temperatureDetailsList) {
		this.temperatureDetailsList = temperatureDetailsList;
	}
    
}
