package com.learn.ExceptionHandling.handler;

import lombok.Getter;

/**
 * @author vdokku
 */

@Getter
public class HeaderErrorDetails {

    private final String errorMessage;

    HeaderErrorDetails(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
