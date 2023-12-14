package com.java.lessons.annotations.propertsource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration /*It enables a class to be marked as a Spring configuration class and is used to define and configure beans in the application configuration.*/

/*@PropertySource annotation is used to load property files from specified files or file paths. In this example, it allows the inclusion
 of "mail.properties" and "message.properties" files in the class.*/
@PropertySource({
        "classpath:mail.properties",
        "classpath:message.properties"
})
public class SpringConfig
{

}
