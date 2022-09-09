package com.dehghan.customers.models;

public class Customers {

    private String id;
    private String name;
    private String orderNo;

    public Customers(){

    }

    public Customers(String Id, String name, String orderNo){

        this.id= Id;
        this.name= name;
        this.orderNo= orderNo;
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
