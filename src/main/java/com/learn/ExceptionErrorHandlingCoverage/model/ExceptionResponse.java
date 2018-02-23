package com.learn.ExceptionErrorHandlingCoverage.model;

import org.springframework.stereotype.Component;

/**
 * Created by vdokku on 1/31/2018.
 */

@Component
public class ExceptionResponse {

    private String errorMessage;
    private String requestedURI;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequestedURI() {
        return requestedURI;
    }

    public void callerURL(final String requestedURI) {
        this.requestedURI = requestedURI;
    }
}
