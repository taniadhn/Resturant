package com.dehghan.foods.models;

public class Food {


    private String id;

    private String name;

    private String spicy;

    public  Food(){

    }

    public Food(String Id, String name, String spicy){

        this.id= Id;
        this.name= name;
        this.spicy= spicy;

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

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }
}
