package com.dehghan.foods.models;

import java.util.List;

public class FoodList {

    public List<Food> foods;

    public List<Food> getFoods(){
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
