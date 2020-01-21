package me.taeyeonkim.springdatajdbcdemo.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
