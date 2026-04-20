package com.yinlearning.spring_jpa.services;

import com.yinlearning.spring_jpa.entity.Book;

public interface BookService {

    Iterable<Book> findAll();
}
