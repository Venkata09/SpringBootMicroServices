package com.learn.ExceptionErrorHandlingCoverage.Services;

/**
 * Created by vdokku on 1/31/2018.
 */
public class EmployeeServiceException extends Exception {


    public EmployeeServiceException() {
        super();
    }

    public EmployeeServiceException(final String message) {
        super(message);
    }
}