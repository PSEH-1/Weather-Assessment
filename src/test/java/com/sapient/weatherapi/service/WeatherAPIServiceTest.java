package com.sapient.weatherapi.service;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.sapient.weatherapi.model.QueryDetails;
import com.sapient.weatherapi.model.WeatherResponse;

import static org.junit.Assert.*;

public class WeatherAPIServiceTest {

    @Mock
    private WeatherAPIService weatherAPIService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getWeather() {
    }

    @Test
    public void testGetWeather() {

    	QueryDetails qd = constructQueryDetails();
        WeatherResponse weatherResponse = weatherAPIService.fetchWeatherDetails(qd);
        try {
            Assert.assertNotNull(weatherResponse.getMessage());
        } catch (Exception e) {

        }
    }

    private QueryDetails constructQueryDetails() {
		QueryDetails qd = new QueryDetails();
		qd.setCityName("Bengaluru");
		return qd;
	}

	
}
