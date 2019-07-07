package com.sapient.weatherapi.exception;

import org.slf4j.*;

public class WeatherForecastServiceException extends RuntimeException {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherForecastServiceException.class);

	private static final long serialVersionUID = -8705091956293049330L;

	private String errorCode;
    private String errorMessage;

    public WeatherForecastServiceException(String errorCode, String message) {
        super(message);
        LOGGER.error("Raised Exception - Error Code is : {} with error message as: {}", errorCode, errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorCode;
    }

    public ErrorDetails getErrorDetails() {
    	return new ErrorDetails(errorCode, errorMessage);       
    }

}
