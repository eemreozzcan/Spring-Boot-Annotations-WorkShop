package com.java.lessons.annotations.controller;

import com.java.lessons.annotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController
{

    @RequestMapping("/hello-world")
    //@ResponseBody
    public String hello()
    {
        return "Hello from BookController";
    }

    @RequestMapping(value={"/book","/java"})
    //@ResponseBody
    public Book getBook()
    {
        Book book = new Book(1, "Spring in Action", "Spring in Action is awesome");
        return book;
    }

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
    //http://localhost:8070/api/books/delete/1
    @DeleteMapping(value="/books/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id)
    {
        System.out.println(id);
        return ResponseEntity.ok("Book deleted successfully");
    }
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
