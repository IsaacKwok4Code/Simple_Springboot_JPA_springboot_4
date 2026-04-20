package com.yinlearning.spring_jpa.repositories;

import com.yinlearning.spring_jpa.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
