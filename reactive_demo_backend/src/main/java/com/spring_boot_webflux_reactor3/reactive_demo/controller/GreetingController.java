package com.spring_boot_webflux_reactor3.reactive_demo.controller;

import com.spring_boot_webflux_reactor3.reactive_demo.repository.GreetingRepository;
import com.spring_boot_webflux_reactor3.reactive_demo.model.Greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    private final GreetingRepository repository;

    public GreetingController(GreetingRepository repository) {
        this.repository = repository;
    }

    // Get all greetings
    @GetMapping
    public Flux<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    // Get greeting by ID
    @GetMapping("/{id}")
    public Mono<ResponseEntity<Greeting>> getGreetingById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    // Create a new greeting
    @PostMapping
    public Mono<Greeting> createGreeting(@RequestBody Greeting greeting) {
        return repository.save(greeting);
    }

    // Update a greeting by ID
    @PutMapping("/{id}")
    public Mono<ResponseEntity<Greeting>> updateGreeting(@PathVariable Long id, @RequestBody Greeting greeting) {
        return repository.findById(id)
                .flatMap(existingGreeting -> {
                    existingGreeting.setMessage(greeting.getMessage());
                    return repository.save(existingGreeting);
                })
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    // Delete greeting by ID
    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> deleteGreeting(@PathVariable Long id) {
        return repository.findById(id)
                .flatMap(existingGreeting ->
                        repository.delete(existingGreeting)
                                  .then(Mono.just(ResponseEntity.noContent().<Void>build()))
                )
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
