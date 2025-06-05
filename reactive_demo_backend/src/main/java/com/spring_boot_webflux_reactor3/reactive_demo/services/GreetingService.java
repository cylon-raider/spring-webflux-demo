package com.spring_boot_webflux_reactor3.reactive_demo.services;

import com.spring_boot_webflux_reactor3.reactive_demo.model.Greeting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GreetingService {
    public Mono<Greeting> getGreeting(String name) {
        return Mono.just(new Greeting("Hello, " + name + "!"));
    }
}