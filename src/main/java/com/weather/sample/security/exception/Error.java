package com.weather.sample.security.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@AllArgsConstructor
public class Error implements Serializable {
    private static final long serialVersionUID = 1L;
    @Getter
    private ErrorType errorType;
}
