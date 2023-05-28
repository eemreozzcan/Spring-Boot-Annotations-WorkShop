package com.java.lessons.annotations.propertsource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo
{
    @Autowired
    private Environment env;

    //@Value("${gmail.host}")
    private String host;

    //@Value("${gmail.email}")
    private String email;

    //@Value("${gmail.password}")
    private String password;

    //@Value("${app.name}")
    private String appName;

    //@Value("${app.description}")
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
