package com.learn.ExceptionErrorHandlingCoverage.Services;

import com.learn.ExceptionErrorHandlingCoverage.model.Employee;
import org.springframework.stereotype.Service;

/**
 * Created by vdokku on 1/31/2018.
 */

@Service
public class EmployeeService {

    //return employee object
    public Employee getEmployee() throws EmployeeServiceException {
        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId("1");
        emp.setSalary(3000);

        return emp;
    }

    //return employee as null
    public Employee getEmployeeNull() throws EmployeeServiceException {

        return null;
    }

    //throw exception
    public Employee getEmployeeException() throws EmployeeServiceException {

        throw new EmployeeServiceException();
    }

}
