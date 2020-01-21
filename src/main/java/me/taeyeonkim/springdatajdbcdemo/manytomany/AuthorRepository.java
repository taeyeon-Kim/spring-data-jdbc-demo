package me.taeyeonkim.springdatajdbcdemo.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
