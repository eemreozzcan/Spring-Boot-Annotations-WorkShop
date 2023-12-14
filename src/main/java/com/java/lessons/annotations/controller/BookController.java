package com.java.lessons.annotations.controller;

import com.java.lessons.annotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

//@Controller /*The @Controller annotation in the Spring framework indicates that a class will function as a controller within
// the Model-View-Controller (MVC) architecture, handling HTTP requests and interacting with the model to control the application's flow.*/
//@ResponseBody /*The @ResponseBody annotation enables the direct writing of data returned by a Spring MVC controller to the HTTP response body.*/
@RestController /*It is a component of the Spring Boot framework and is used to create RESTful web services.*/
@RequestMapping("/api") /*The @RequestMapping("/api") annotation specifies that the HTTP requests handled by a Spring MVC controller correspond to the "/api" path.*/
public class BookController
{

    /*The @RequestMapping("/hello-world") expression represents the HTTP request at the "/hello-world" path handled by a Spring MVC controller,
    and the hello() method responds to this request with the text "Hello from BookController".*/
    @RequestMapping("/hello-world")
    //@ResponseBody
    public String hello()
    {
        return "Hello from BookController";
    }

    /*he expression @RequestMapping(value={"/book","/java"}) indicates that it represents the HTTP requests at the "/book" or "/java"
    paths handled by a Spring MVC controller. The getBook() method, in response to this request, returns a Book object.*/
    @RequestMapping(value={"/book","/java"})
    //@ResponseBody
    public Book getBook()
    {
        Book book = new Book(1, "Spring in Action", "Spring in Action is awesome");
        return book;
    }

    /*The expression @PostMapping(value="/books/create", consumes = MediaType.APPLICATION_JSON_VALUE) indicates that it represents
    a POST request handled by a Spring MVC controller at the "/books/create" path, specifying that the request contains data in JSON format.
    The createBook() method responds to this request by converting the incoming JSON data into a Book object,
    and it provides an HTTP response within a ResponseEntity with HttpStatus.CREATED.*/
    //http://localhost:8070/api/books/create

    @PostMapping(value="/books/create",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    //@ResponseStatus(value= HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book)
    {
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getDescription());
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    /*The expression @PutMapping(value="/books/update/{id}") indicates that it represents a PUT request handled by a Spring MVC controller
    at the "/books/update/{id}" path. The updateBook() method updates a book object using the id parameter from the request URL
    and the JSON-formatted data, providing an HTTP response within a ResponseEntity with HttpStatus.OK.*/
    //http://localhost:8080/api/books/update/1
    @PutMapping(value="/books/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id,
                                           @RequestBody Book updatedBook)
    {
        System.out.println(id);
        System.out.println(updatedBook.getTitle());
        System.out.println(updatedBook.getDescription());
        updatedBook.setId(id);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    /*The expression @DeleteMapping(value="/books/delete/{id}") indicates that it represents a DELETE request handled by a Spring MVC controller
    at the "/books/delete/{id}" path. The deleteBook() method deletes a book using the id parameter from the request URL and responds
    to the request with an HTTP response within a ResponseEntity containing the text "Book deleted successfully." */
    //http://localhost:8070/api/books/delete/1
    @DeleteMapping(value="/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id)
    {
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    /*The expression @GetMapping(value="/books/{id}/{title}/{description}") indicates that it represents a GET request handled by a Spring
    MVC controller at the "/books/{id}/{title}/{description}" path. The pathVariableDemo() method creates a Book object using the id, title,
    and description parameters from the request URL and responds to the request with an HTTP response within a ResponseEntity containing this object.*/

    //http://localhost:8070/api/books/1/core java /core java description
    @GetMapping(value="/books/{id}/{title}/{description}")
    public ResponseEntity<Book> pathVariableDemo(@PathVariable int id,
                                                 @PathVariable("title") String bookTitle,
                                                 @PathVariable("description") String bookDescription)
    {
        System.out.println(id);
        Book book = new Book();
        book.setId(id);
        book.setTitle(bookTitle);
        book.setDescription(bookDescription);
        return ResponseEntity.ok(book);
    }


    /*The expression @GetMapping("/books/query") indicates that it represents a GET request handled by a Spring MVC controller at the "/books/query"
    path. The requestParamDemo() method creates a Book object using the parameters id and title from the request and responds to the request
    with an HTTP response within a ResponseEntity containing this object.*/
    //http://localhost:8070/api/books/query?id=1&title=core java&description=core java description
    @GetMapping("/books/query")
    public ResponseEntity<Book> requestParamDemo(
            @RequestParam(name="id") int id,
            @RequestParam(name="title") String title,
            @RequestParam(name="description") String description)
    {
        System.out.println(id);
        System.out.println(title);

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);

        return ResponseEntity.ok(book);
    }
}
