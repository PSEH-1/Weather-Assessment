package com.sapient.weatherapi.model;

import java.util.Date;

public class WeatherDetails {
	
	private Date date;
	private MainDetails mainDetails;
	private Clouds clouds;
	private Wind wind;
	private Weather weather;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public MainDetails getMainDetails() {
		return mainDetails;
	}
	public void setMainDetails(MainDetails mainDetails) {
		this.mainDetails = mainDetails;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	
}
