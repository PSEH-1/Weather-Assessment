package com.sapient.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MainDetails {
    private double temp;
    @JsonProperty("temp_min")
    private double tempMinimum;
    @JsonProperty("temp_max")
    private double tempMaximum;
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTempMinimum() {
		return tempMinimum;
	}
	public void setTempMinimum(double tempMinimum) {
		this.tempMinimum = tempMinimum;
	}
	public double getTempMaximum() {
		return tempMaximum;
	}
	public void setTempMaximum(double tempMaximum) {
		this.tempMaximum = tempMaximum;
	}
    
}
