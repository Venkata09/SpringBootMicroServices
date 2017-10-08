package com.learn.springboot.microservices.model;

/**
 * Created by vdokku on 10/8/2017.
 */
public class Employee {


    private String empID;
    private String empFirstName;
    private String empLastName;
    private String empAddress;


    public Employee() {

    }

    public Employee(String empID, String empFirstName, String empLastName, String empAddress) {
        this.empID = empID;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.empAddress = empAddress;
    }


    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
}
