package com.java.lessons.annotations.repository;

import org.springframework.stereotype.Repository;

@Repository /*It indicates that a class will function as a repository in the Spring Data Access layer and signals that this class is a
 managed component by Spring.*/

public class MyRepository  //The MyRepository class has a hello() method that returns the text "Hello Repository.
{
    public String hello()
    {
        return "Hello Repository";
    }
}
