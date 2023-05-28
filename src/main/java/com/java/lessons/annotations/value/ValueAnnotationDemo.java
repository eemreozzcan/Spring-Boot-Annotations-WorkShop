package com.java.lessons.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo
{

    @Value("Default Name")
    private String defaultName;

    //application.properties
    @Value("${mail.host}")
    private String host;

    //application.properties
    @Value("${mail.email}")
    private String email;

    //application.properties
    @Value("${mail.password}")
    private String password;

    //System environment variable
    @Value("${java.home}")
    public String javaHome;

    @Value("${HOME}")
    public String homeDir;

    public String getJavaHome()
    {
        return javaHome;
    }

    public String getHomeDir()
    {
        return homeDir;
    }

    public String getHost()
    {
        return host;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getDefaultName()
    {
        return defaultName;
    }

}
