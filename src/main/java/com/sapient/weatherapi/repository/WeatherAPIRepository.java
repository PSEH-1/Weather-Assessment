package com.sapient.weatherapi.repository;

import com.sapient.weatherapi.exception.WeatherForecastServiceException;
import com.sapient.weatherapi.model.QueryDetails;
import com.sapient.weatherapi.model.WeatherDetails;
import com.sapient.weatherapi.model.WeatherResponse;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class WeatherAPIRepository {
	
    @Autowired
    RestTemplate restTemplate;
    @Value("${weather_fetch_base_url}")
    private String fetchWeatherBaseUrl;
    @Value("${apiKey}")
    private String apiKey;
    @Value("${default_city}")
    private String defaultCity;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherAPIRepository.class);

    public WeatherResponse fetchWeatherDetails(QueryDetails queryDetails) throws WeatherForecastServiceException{
    	LOGGER.info("fetchWeatherDetails() invoked in WeatherQueryRepository with payload = {}", queryDetails);
        try {
            WeatherResponse weatherResponse =
                    restTemplate.getForObject(makeAndReturnUrl(queryDetails).toUriString(), WeatherResponse.class);
            printWeatherOutput(weatherResponse);
            return weatherResponse;
        } catch (Exception ee) {
            throw new WeatherForecastServiceException("WEA_FRS_001", "Error In Fetching Data");
        }
    }

    private void printWeatherOutput(WeatherResponse weatherResponse) {
		List<WeatherDetails> wd = weatherResponse.getWeatherDetailsList();
		for(WeatherDetails wdetails : wd) {
			System.out.println("Weather Prediction for day : " + wdetails.getDate());
			if(wdetails.getWeather().getMain().equals("Rain")) {
				System.out.println("Carry Umbrella");
			} else if(wdetails.getMainDetails().getTemp() > 40.0) {
				System.out.println("Use sunscreenlotion");
			}
		}
		
	}

	public UriComponentsBuilder makeAndReturnUrl(QueryDetails queryDetails) {
        UriComponentsBuilder queryBuilder = UriComponentsBuilder.fromHttpUrl(fetchWeatherBaseUrl)
                .queryParam("appid", apiKey)
                .queryParam("q", queryDetails.getCityName() == null ? defaultCity : queryDetails.getCityName());
        return queryBuilder;
    }
}
