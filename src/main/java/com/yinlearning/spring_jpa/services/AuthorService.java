package com.yinlearning.spring_jpa.services;

import com.yinlearning.spring_jpa.entity.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
