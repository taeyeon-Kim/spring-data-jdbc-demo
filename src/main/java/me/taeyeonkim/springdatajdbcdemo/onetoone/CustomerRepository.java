package me.taeyeonkim.springdatajdbcdemo.onetoone;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
