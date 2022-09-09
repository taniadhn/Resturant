package com.dehghan.employees.models;

import java.util.List;

public class EmployeesList {

    public List<Employees>employees;

    public List<Employees> getEmployees(){
        return  employees;
    }

    public void setEmployees(List<Employees> employees){
        this.employees = employees;
    }
}
