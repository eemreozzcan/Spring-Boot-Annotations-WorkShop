package com.java.lessons.annotations.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) /*The @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON) annotation specifies that
 the associated Spring component is in singleton scope, meaning only one instance is created, and it is shared throughout the application.*/
public class SingletonBean
{
    public SingletonBean()
    {
        System.out.println("SingletonBean instantiated");
    }
}
