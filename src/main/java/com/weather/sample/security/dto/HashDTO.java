package com.weather.sample.security.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class HashDTO implements Serializable {
    private String hashCode;
}
