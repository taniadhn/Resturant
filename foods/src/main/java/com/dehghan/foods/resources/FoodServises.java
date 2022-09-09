package com.dehghan.foods.resources;

import com.dehghan.foods.FoodsApplication;
import com.dehghan.foods.models.Food;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order")
public class FoodServises {


     List<Food> foods= Arrays.asList(
            new Food("F1", "Suchi", "saucy"),
            new Food("F2", "Burger", "withoutsaucy")
    );

     @RequestMapping("/foods")
     public List<Food> getFoods(){

         return foods;
     }

     @RequestMapping("/foods/{id}")
    public Food getFoodById(@PathVariable("Id") String id){

        Food f = foods.stream()
                .filter(foods -> id.equals(foods.getId()))
                .findAny()
                .orElse(null);

         return f;
    }
}
