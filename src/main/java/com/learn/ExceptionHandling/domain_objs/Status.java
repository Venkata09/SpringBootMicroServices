package com.learn.ExceptionHandling.domain_objs;

import lombok.Data;

/**
 * @author vdokku
 */

@Data
public class Status {

    private String message;

    public Status(String message) {
        this.message = message;
    }
}
