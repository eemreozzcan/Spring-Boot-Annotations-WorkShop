package com.java.lessons.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component /*The @Component annotation is used to mark a Java class as a component in a Spring application, allowing it to be automatically*/
public class ValueAnnotationDemo
{

    @Value("Default Name") /*It demonstrates that the @Value annotation in Spring is used and this annotation returns the string "Default Name".*/
    private String defaultName;

    //application.properties
    @Value("${mail.host}") /*"It demonstrates that the @Value annotation in Spring is used and this annotation returns the value of mail.host defined in the properties file."*/
    private String host;

    //application.properties
    @Value("${mail.email}") /*"It demonstrates that the @Value annotation in Spring is used and this annotation returns the value of mail.email*/
    private String email;

    //application.properties
    @Value("${mail.password}") /*"It demonstrates that the @Value annotation in Spring is used and this annotation returns the value of mail.password*/
    private String password;

    //System environment variable
    @Value("${java.home}") /*"It demonstrates that the @Value annotation in Spring is used and this annotation returns the value of java home*/
    public String javaHome;

    @Value("${HOME}") /*"It demonstrates that the @Value annotation in Spring is used and this annotation returns the value of home directory*/
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
