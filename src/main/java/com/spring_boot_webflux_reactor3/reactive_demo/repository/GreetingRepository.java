package com.spring_boot_webflux_reactor3.reactive_demo.repository;

import com.spring_boot_webflux_reactor3.reactive_demo.model.Greeting;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends ReactiveCrudRepository<Greeting, Long> {
    // Reactive CRUD operations are provided out of the box
}
