package com.yinlearning.spring_jpa.controllers;

import com.yinlearning.spring_jpa.entity.Author;
import com.yinlearning.spring_jpa.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public Iterable<Author> getAuthors() {
        return authorService.findAll();
    }
}
