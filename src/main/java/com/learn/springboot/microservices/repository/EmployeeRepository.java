package com.learn.springboot.microservices.repository;

import com.learn.springboot.microservices.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by vdokku on 10/8/2017.
 */

/*

CrudRepository - will take care of all basic CRUD operations like getall, get one, update, delete and save.
this class is type of Generic, so we have to pass the parameters like
	1 - on which model class you are going to implement CRUD operations (in our example its EMPL class)
	2 - Id data type in the model class (in our example it is String id)


This is the repository interface, this will be automatically implemented by Spring in a bean with the same name with changing case The bean name
will be employeeRepository


@RequestMapping maps all HTTP operations by default.
Use @RequestMapping(method=GET) to narrow this mapping.



What is authentication and authorization? Which must come first?
    Authentication – Checks whether user’s credentials are valid
    Authorization – Checks if the user is allowed to perform an action

    Authentication comes first before Authorization (because authorization process needs princial object)


 */

@RestResource(path = "", rel = "")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
