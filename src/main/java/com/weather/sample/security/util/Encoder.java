package com.weather.sample.security.util;

import com.weather.sample.security.exception.WeatherSecurityException;
import com.weather.sample.security.util.impl.EncoderImpl;
import org.apache.shiro.codec.Base64;

import java.util.logging.Logger;


public class Encoder implements EncoderImpl {
    private final static Logger LOGGER = Logger.getLogger(Decoder.class.getName());

    public String encodeBase64(String hash) throws WeatherSecurityException {
        StringBuilder result = new StringBuilder(Base64.encodeToString(hash.getBytes()));
        return result.toString();
    }
}
