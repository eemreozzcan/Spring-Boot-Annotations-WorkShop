package com.java.lessons.annotations.controller;

import com.java.lessons.annotations.service.NonVegPizza;
import com.java.lessons.annotations.service.Pizza;
import com.java.lessons.annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Component Anatosyonu Nedir?
//Component anatosyonu ile bir sınıfı Spring Context'e ekleyebiliriz.
//Bu anatosyonu kullanarak Spring'e bu sınıfın bir Bean olduğunu söylemiş oluruz.
//Spring Context'e eklenen Bean'ler Spring tarafından yönetilir.
//@Component
public class PizzaController
{
    private Pizza pizza;

    //@Qualifier kaldırıktan sonra NonVegPizza sınıfına  @Primary eklendi
    //@Autowired -->Bean anatosyonu eklendiğimizde comment çektik.
    public PizzaController(/*@Qualifier("nonVegPizza")*/ Pizza pizza)
    {
        this.pizza = pizza;
    }

    /*
   public void setVegPizza(VegPizza vegPizza)
    {
        this.vegPizza = vegPizza;
    }
   */
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
