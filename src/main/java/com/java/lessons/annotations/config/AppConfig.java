package com.java.lessons.annotations.config;

import com.java.lessons.annotations.controller.PizzaController;
import com.java.lessons.annotations.service.NonVegPizza;
import com.java.lessons.annotations.service.Pizza;
import com.java.lessons.annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration //It is an annotation used in Java to indicate that a class contains one or more @Bean methods.
public class AppConfig
{
    /*The @Bean annotation is used to add the return values of methods inside a configuration class as beans to the Spring Container.
    In this Java configuration method, a @Bean named "vegPizzaBean" is defined, and this bean has the lazy loading feature with the @Lazy annotation.
    The return value of the vegPizza() method is a new instance of VegPizza.*/
    @Bean(name = "vegPizzaBean")
    @Lazy
    public Pizza vegPizza()
    {
        return new VegPizza();
    }

    /*In this Java configuration method, a bean named "nonVegPizza" is defined using the @Bean annotation,
    and this bean includes a new instance of NonVegPizza as the return value of the nonVegPizza() method.*/
    public Pizza nonVegPizza()
    {
        return new NonVegPizza();
    }
    /*In this Java configuration method, a bean named "pizzaController" is defined using the @Bean annotation.
    This bean encapsulates an instance of PizzaController that is initialized with the init method and destroyed with the destroy method.
    The creation of this instance involves the use of the vegPizza() method.*/
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(vegPizza());
    }


}
