package com.weather.sample.security.util;
import com.weather.sample.security.exception.WeatherSecurityException;
import com.weather.sample.security.util.impl.DecoderImpl;
import org.apache.shiro.codec.Base64;

import java.util.logging.Logger;


public class Decoder implements DecoderImpl {
       private final static Logger LOGGER = Logger.getLogger(Decoder.class.getName());

       public String decodeBase64(String hash) throws WeatherSecurityException{
              try{
                     StringBuilder result = new StringBuilder(Base64.decodeToString(hash));
                     return result.toString();
              } catch (Exception e){
                throw new WeatherSecurityException(e.getMessage());
              }
       }
}