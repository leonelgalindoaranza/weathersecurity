package com.weather.sample.security.util.impl;

import com.weather.sample.security.exception.WeatherSecurityException;

public interface DecoderImpl {
    String decodeBase64(String hash) throws WeatherSecurityException;
}
