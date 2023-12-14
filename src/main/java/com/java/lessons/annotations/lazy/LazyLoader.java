package com.java.lessons.annotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically
 detected and managed.*/
@Lazy /*The @Lazy annotation is used to ensure that a Spring component is loaded only when it is accessed, preventing the loading of all components
at the application startup.*/

public class LazyLoader
{
    public LazyLoader()
    {
        System.out.println("LazyLoader...");
    }
}
