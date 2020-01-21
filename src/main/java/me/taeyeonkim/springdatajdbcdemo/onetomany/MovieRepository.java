package me.taeyeonkim.springdatajdbcdemo.onetomany;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
