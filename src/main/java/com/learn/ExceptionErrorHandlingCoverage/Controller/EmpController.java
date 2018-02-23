package com.learn.ExceptionErrorHandlingCoverage.Controller;

import com.learn.ExceptionErrorHandlingCoverage.Services.EmployeeService;
import com.learn.ExceptionErrorHandlingCoverage.Services.EmployeeServiceException;
import com.learn.ExceptionErrorHandlingCoverage.model.Employee;
import com.learn.ExceptionErrorHandlingCoverage.model.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by vdokku on 1/31/2018.
 */


@RestController
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    //Happy path, an employee is returned as response
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee getEmpl() throws ResourceNotFoundException, EmployeeServiceException {
        try {
            Employee emp = employeeService.getEmployee();

            if (emp == null) {
                throw new ResourceNotFoundException("Employee not found");
            }
            return emp;
        } catch (EmployeeServiceException e) {
            throw new EmployeeServiceException("Internal Server Exception while getting exception");
        }
    }

    //no employee found so ResourceNotFoundException is thrown
    @RequestMapping(value = "/employee2", method = RequestMethod.GET)
    public Employee getEmp2() throws ResourceNotFoundException, EmployeeServiceException {
        try {
            Employee emp = employeeService.getEmployeeNull();
            if (emp == null) {
                throw new ResourceNotFoundException("Employee not found");
            }

            return emp;
        } catch (EmployeeServiceException e) {
            throw new EmployeeServiceException("Internal Server Exception while getting exception");
        }
    }

    //Some exception is thrown by service layer
    @RequestMapping(value = "/employee3", method = RequestMethod.GET)
    public Employee getEmp3() throws ResourceNotFoundException, EmployeeServiceException {
        try {
            Employee emp = employeeService.getEmployeeException();
            if (emp == null) {
                throw new ResourceNotFoundException("Employee not found");
            }
            return emp;
        } catch (EmployeeServiceException e) {
            throw new EmployeeServiceException("Internal Server Exception while getting exception");
        }
    }

}
