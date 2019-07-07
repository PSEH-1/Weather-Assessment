package com.sapient.weatherapi.service;

import com.sapient.weatherapi.exception.WeatherForecastServiceException;
import com.sapient.weatherapi.model.QueryDetails;
import com.sapient.weatherapi.model.WeatherResponse;
import com.sapient.weatherapi.repository.WeatherAPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherAPIService {

    @Autowired
    WeatherAPIRepository weatherAPIRepository;

    public WeatherResponse fetchWeatherDetails(QueryDetails queryDetails)
            throws WeatherForecastServiceException {
        return weatherAPIRepository.fetchWeatherDetails(queryDetails);
    }
}
