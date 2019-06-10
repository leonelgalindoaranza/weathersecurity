package com.weather.sample.test;

import com.weather.sample.security.dto.HashDTO;
import com.weather.sample.security.util.Decoder;
import com.weather.sample.security.util.Encoder;
import org.apache.shiro.codec.Base64;
import org.junit.Test;

import java.util.logging.Logger;

import static com.weather.sample.security.constant.WeatherSecurityConstants.HASH;

public class APITest {

    private static final String HASHCODE = HASH;
    private final static Logger LOGGER = Logger.getLogger(Decoder.class.getName());

    @Test
    public void testDecoder() {
        Decoder decoder = new Decoder();
        HashDTO hashDTO = new HashDTO();
        hashDTO.setHashCode(HASH);
        StringBuilder stringEncode = new StringBuilder(Base64.encodeToString(hashDTO.getHashCode().getBytes()));
        try {
            StringBuilder stringBuilder = new StringBuilder(decoder.decodeBase64(stringEncode.toString()));
            LOGGER.log(LOGGER.getLevel().INFO, stringBuilder.toString());
        } catch (Exception e) {
            LOGGER.log(LOGGER.getLevel().SEVERE, e.getMessage());
            LOGGER.log(LOGGER.getLevel().SEVERE, e.getClass().getName());
        }
    }

    @Test
    public void testEncoder(){
        Encoder encoder = new Encoder();
        HashDTO hashDTO = new HashDTO();
        hashDTO.setHashCode(HASH);
        StringBuilder stringEncode = new StringBuilder(Base64.decodeToString(hashDTO.getHashCode().getBytes()));
        try{
            StringBuilder stringBuilder = new StringBuilder(encoder.encodeBase64(stringEncode.toString()));
            LOGGER.log(LOGGER.getLevel().INFO,stringBuilder.toString());
        }catch(Exception e){
            LOGGER.log(LOGGER.getLevel().SEVERE,e.getMessage());
            LOGGER.log(LOGGER.getLevel().SEVERE,e.getClass().getName());
        }
    }
}
