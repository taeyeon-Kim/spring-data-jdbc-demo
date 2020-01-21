package me.taeyeonkim.springdatajdbcdemo.single;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
