package com.yinlearning.spring_jpa.repositories;

import com.yinlearning.spring_jpa.entity.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
