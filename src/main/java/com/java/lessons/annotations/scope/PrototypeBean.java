package com.java.lessons.annotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) /*The @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) annotation specifies that
the associated Spring component is in prototype scope, meaning a new instance is created every time it is requested.*/

public class PrototypeBean
{
    public PrototypeBean()
    {
        System.out.println("PrototypeBean instantiated");
    }
}
