package com.dehghan.employees.resources;


import com.dehghan.employees.models.Employees;
import com.dehghan.employees.models.EmployeesList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesServis {


    List<Employees> employees= Arrays.asList(

            new Employees("E1", "Tania", "Dehghan"),
            new Employees("E2","Mohammad", "Dehghan")
    );



    @RequestMapping("/humans")
    public EmployeesList getAllEmployee(){

        return (EmployeesList) employees;

    }

    @RequestMapping("/humans/{id}")
    public Employees getEmployeeById(@PathVariable("Id") String id){

        Employees e = employees.stream()
                .filter(employees -> id.equals(employees.getId()) )
                .findAny()
                .orElse(null);

        return e;
    }
}
