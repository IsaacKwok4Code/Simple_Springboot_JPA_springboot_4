package com.yinlearning.spring_jpa.repositories;

import com.yinlearning.spring_jpa.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
