package com.java.lessons.annotations.propertsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component/*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically
 detected and managed.*/
public class PropertySourceDemo
{
    /*The @Autowired annotation enables the automatic injection of a component of type Environment in a Spring application.*/
    @Autowired
    private Environment env;

    //@Value("${gmail.host}") /*It is used to inject the value of the 'host' property in a Spring application.*/
    private String host;

    //@Value("${gmail.email}") /*It is used to inject the value of the 'email' property in a Spring application.*/
    private String email;

    //@Value("${gmail.password}") /*It is used to inject the value of the 'password' property in a Spring application.*/
    private String password;

    //@Value("${app.name}") /*It is used to inject the value of the 'name' property in a Spring application.*/
    private String appName;

    //@Value("${app.description}") /*It is used to inject the value of the 'description' property in a Spring application.*/
    private String appDescription;


    public String getHost() {
        return env.getProperty("gmail.host");
    }

    public String getEmail() {
        return env.getProperty("gmail.email");
    }

    public String getPassword() {
        return env.getProperty("gmail.password");
    }

    public String getAppName() {
        return env.getProperty("app.name");
    }

    public String getAppDescription() {
        return env.getProperty("app.description");
    }
}
