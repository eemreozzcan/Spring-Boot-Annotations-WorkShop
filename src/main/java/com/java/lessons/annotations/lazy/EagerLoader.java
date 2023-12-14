package com.java.lessons.annotations.lazy;


import org.springframework.stereotype.Component;

/*This Java class is marked with the @Component annotation, and it is a class that is automatically loaded when the application starts.
In its constructor method, the text "EagerLoader..." is printed.*/
@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
public class EagerLoader
{
    public EagerLoader()
    {
        System.out.println("EagerLoader...");
    }
}
