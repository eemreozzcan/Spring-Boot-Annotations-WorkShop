package com.java.lessons.annotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
/* "It demonstrates that the VegPizza class implements the Pizza interface. This class overrides the getPizza method and returns the string
"Veg Pizza". This class, in other words, represents a specific type of pizza using the Pizza interface."*/
public class VegPizza implements Pizza
{
    @Override
    public String getPizza()
    {
        return "Veg Pizza";
    }
}
