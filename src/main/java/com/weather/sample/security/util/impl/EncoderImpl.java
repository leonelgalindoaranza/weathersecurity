package com.weather.sample.security.util.impl;

import com.weather.sample.security.exception.WeatherSecurityException;

public interface EncoderImpl {
    String encodeBase64(String hash) throws WeatherSecurityException;
}
