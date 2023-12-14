package com.java.lessons.annotations.controller;

import org.springframework.stereotype.Controller;

/*This Java class represents a controller in Spring MVC, and upon calling the "hello()" method, it returns the text "Hello Controller."*/
@Controller
public class MyController
{

    public String hello()
    {
        return "Hello Controller";
    }
}
