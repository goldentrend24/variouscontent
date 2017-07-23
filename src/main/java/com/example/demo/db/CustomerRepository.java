package com.example.demo.db;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by caroline on 18/07/2017.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}