package com.learn.ExceptionHandling.domain_objs;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author vdokku
 */

@Data
public class Service {

    private String description;
    private String kms;
    private LocalDate date;
    private Motorcycle motorcycle;
    private Owner owner;
}
