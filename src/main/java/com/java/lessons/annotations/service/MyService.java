package com.java.lessons.annotations.service;

import org.springframework.stereotype.Service;

@Service /*It indicates that a class will serve as a component in the service layer of a Spring application, and allows this class to function
as a managed service by Spring.*/
public class MyService
{
    public String hello()
    {
        return "Hello Service";
    }
}
