package com.learn.ExceptionErrorHandlingCoverage.model;

/**
 * Created by vdokku on 1/31/2018.
 */
public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message) {
        super(message);
    }

}
