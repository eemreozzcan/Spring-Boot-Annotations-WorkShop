package com.java.lessons.annotations.beans;

/*This Java class represents a data structure for a book, including its identifier (id), title, and description. It also has both parameterized
and parameterless constructor methods, along with methods for accessing and modifying these properties.*/
public class Book
{
    private int id;
    private String title;
    private String description;

    public Book(int id, String title, String description)
    {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
