package com.yinlearning.spring_jpa.controllers;

import com.yinlearning.spring_jpa.entity.Book;
import com.yinlearning.spring_jpa.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks() {
        return bookService.findAll();
    }
}
