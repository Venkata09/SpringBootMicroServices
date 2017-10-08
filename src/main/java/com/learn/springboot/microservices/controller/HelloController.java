package com.learn.springboot.microservices.controller;

import com.learn.springboot.microservices.model.Employee;
import com.learn.springboot.microservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vdokku on 10/8/2017.
 */
@RestController
public class HelloController {

    @Autowired
    EmployeeService empServices;


    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello";
    }


    @RequestMapping("/getEmps")
    public List<Employee> getListOfEmployees() {
        return empServices.getEmpList();
    }
}
