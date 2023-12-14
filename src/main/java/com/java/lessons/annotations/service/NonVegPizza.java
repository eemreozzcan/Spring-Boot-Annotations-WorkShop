package com.java.lessons.annotations.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
//@Primary /*The @Primary annotation specifies a component as the primary candidate among multiple eligible candidates in the Spring container,
// ensuring that this component is chosen with priority.*/
/*The NonVegPizza class implements the Pizza interface and has a getPizza() method that returns the text "Non Veg Pizza."*/
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
 }

