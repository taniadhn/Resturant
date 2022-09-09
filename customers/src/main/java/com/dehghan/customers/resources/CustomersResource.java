package com.dehghan.customers.resources;


import com.dehghan.customers.models.Customers;
import com.dehghan.employees.models.EmployeesList;
import com.dehghan.foods.models.FoodList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersResource {

    @Autowired
    private RestTemplate restTemplate;


    List<Customers> customers = Arrays.asList(
            new Customers("C1", "Tania", "PC1"),
            new Customers("C2", "Patrick", "TD1")
    );

    @RequestMapping("/users")
    public List<Customers> getCustomers(){

        return customers;
    }

    @RequestMapping("/users/{id}")
    public Customers getCustomerById (@PathVariable("Id")String id){

        Customers c = customers.stream()
                .filter(customers -> id.equals(customers.getId()) )
                .findAny()
                .orElse(null);

        return c;

    }

    //We get employee List from Customer servises
    @RequestMapping("/employees")
    public EmployeesList getEmployees(){

        EmployeesList employeesList= restTemplate.getForObject("http://localhost:8086/employees/humans", EmployeesList.class);

        return employeesList;
    }

    @RequestMapping("/order")
    public FoodList getFood(){

        FoodList foodList = restTemplate.getForObject("", FoodList.class);

        return foodList;
    }


}
