package com.dehghan.customers.models;

import com.dehghan.employees.models.Employees;

import java.util.List;

public class EmployeesList {

    public List<com.dehghan.employees.models.Employees> employees;

    public List<com.dehghan.employees.models.Employees> getEmployees(){
        return  employees;
    }

    public void setEmployees(List<Employees> employees){
        this.employees = employees;
    }
}
