package com.java.lessons.annotations.controller;

import com.java.lessons.annotations.service.NonVegPizza;
import com.java.lessons.annotations.service.Pizza;
import com.java.lessons.annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
public class PizzaController
{
    private Pizza pizza;

    //After removing @Qualifier, @Primary was added to the NonVegPizza class.
    //@Autowired -->When we added the @Autowired annotation, we commented out the code.

    public PizzaController(/*@Qualifier("nonVegPizza")*/ Pizza pizza)
    {
        this.pizza = pizza;
    }


    public String getPizza()
    {
        return pizza.getPizza();
    }

    public void init()
    {
        System.out.println("Init Logic");
    }

    public void destroy()
    {
        System.out.println("Destroy Logic.");
    }

}
