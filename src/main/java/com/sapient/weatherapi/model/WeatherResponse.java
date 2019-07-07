package com.sapient.weatherapi.model;

public class WeatherResponse {
	
    private MainDetails main;
    private String alertText;
    private String name;
    
	public MainDetails getMain() {
		return main;
	}
	public void setMain(MainDetails main) {
		this.main = main;
	}
	public String getAlertText() {
		return alertText;
	}
	public void setAlertText(String alertText) {
		this.alertText = alertText;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
