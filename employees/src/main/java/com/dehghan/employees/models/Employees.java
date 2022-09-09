package com.dehghan.employees.models;

public class Employees {

    private String id;

    private String name;

    private String lastName;


    public Employees(){

    }

    public Employees(String Id,String name, String lastName ){

        this.id= Id;
        this.name= name;
        this.lastName= lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
