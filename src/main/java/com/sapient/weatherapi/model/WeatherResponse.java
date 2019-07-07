package com.sapient.weatherapi.model;

import java.util.List;

public class WeatherResponse {
    
    private String cod;
    private String message;
    private String cnt;
    private List<WeatherDetails> weatherDetailsList;
    
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public List<WeatherDetails> getWeatherDetailsList() {
		return weatherDetailsList;
	}
	public void setWeatherDetailsList(List<WeatherDetails> weatherDetailsList) {
		this.weatherDetailsList = weatherDetailsList;
	}

}
