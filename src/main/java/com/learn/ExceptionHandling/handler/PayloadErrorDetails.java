package com.learn.ExceptionHandling.handler;

import lombok.Getter;

/**
 * @author vdokku
 */

@Getter
public class PayloadErrorDetails {

    private final String payloadErrorPath;
    private final String requiredTargetType;
    private final String errorMessage;

    PayloadErrorDetails(String payloadErrorPath, String requiredTargetType, String errorMessage) {
        this.payloadErrorPath = payloadErrorPath;
        this.requiredTargetType = requiredTargetType;
        this.errorMessage = errorMessage;
    }
}
