package com.learn.springboot.microservices.service;

import com.learn.springboot.microservices.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vdokku on 10/8/2017.
 */

@Service
public class EmployeeService {


    private List<Employee> employeeList = Arrays.asList(new Employee("123", "Venkat", "D", "Virginia"),
            new Employee("125", "Satya", "D", "NC"));


    public List<Employee> getEmpList() {
        return employeeList;
    }

}
