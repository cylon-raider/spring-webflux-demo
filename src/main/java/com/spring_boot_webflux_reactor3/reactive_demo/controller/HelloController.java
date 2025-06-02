package com.spring_boot_webflux_reactor3.reactive_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<String> sayHello() {
        return Mono.just("Hello from WebFlux!");
    }

    @GetMapping("/stream")
    public Flux<String> streamData() {
        return Flux.interval(Duration.ofSeconds(1))
                   .map(i -> "Message " + i)
                   .take(10);
    }

    @GetMapping("/time")
    public Mono<String> time() {
        return Mono.just("Server time: " + LocalDateTime.now());
    }

    

}

