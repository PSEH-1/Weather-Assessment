package com.sapient.weatherapi.controller;

import com.sapient.weatherapi.exception.WeatherForecastServiceException;
import com.sapient.weatherapi.model.QueryDetails;
import com.sapient.weatherapi.service.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherAPIController {

    @Autowired
    WeatherAPIService weatherAPIService;

    @PostMapping
    public ResponseEntity fetchWeather(@RequestBody QueryDetails queryDetails) {
        try {
            return new ResponseEntity(weatherAPIService.fetchWeatherDetails(queryDetails), HttpStatus.OK);
        } catch (WeatherForecastServiceException wfse) {
            return new ResponseEntity(wfse.getErrorDetails(), HttpStatus.OK);
        }
    }
}
