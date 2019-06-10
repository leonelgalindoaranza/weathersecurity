package com.weather.sample.security.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class WeatherSecurityException extends Exception{
    @Getter @Setter
    private Error error;

    public WeatherSecurityException(Error error, Throwable throwable){
        super(error.getErrorType().getValue(), throwable);
        this.error = error;
    }

    public WeatherSecurityException(String value){
        super(value);
    }

}
