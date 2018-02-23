package com.learn.ExceptionErrorHandlingCoverage.ThrowExceptions;

import com.learn.ExceptionErrorHandlingCoverage.model.CustomException;

/**
 * Created by vdokku on 1/31/2018.
 */
public class ExceptionThrow {

    public void throwGeneralException() throws Exception {
        Exception ex = new Exception(" I am throwing a general exception:>> ");
        throw ex;
    }


    public void throwCustomException() throws CustomException {
        CustomException custEx = new CustomException();

        custEx.setCode(401);
        custEx.setMessage("not invalid inputs");

        throw custEx;
    }

}
