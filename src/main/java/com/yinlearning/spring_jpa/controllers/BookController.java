package com.yinlearning.spring_jpa.controllers;

import com.yinlearning.spring_jpa.entity.Book;
import com.yinlearning.spring_jpa.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public Iterable<Book>  getBooks(Model model) {
        return bookService.findAll();
    }
}
