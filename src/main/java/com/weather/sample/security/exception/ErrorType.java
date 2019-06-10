package com.weather.sample.security.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum ErrorType {
    TECNICAL("T"),BUSINESS("B");
    @Getter @Setter
    private String value = "";
}
