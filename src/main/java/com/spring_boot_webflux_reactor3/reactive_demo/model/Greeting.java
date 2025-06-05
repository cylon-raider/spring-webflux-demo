package com.spring_boot_webflux_reactor3.reactive_demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.util.Objects;

@Table("greetings")
public class Greeting {
    @Id
    private Long id;
    private String message;

    // No-argument constructor
    public Greeting() {
    }

    // Constructor with all fields
    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }

    // Constructor without id (useful before persistence)
    public Greeting(String message) {
        this.message = message;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // toString method for easy debugging and logging
    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }

    // equals method to compare Greeting objects based on id and message
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;               // same object
        if (o == null || getClass() != o.getClass()) return false; // null or different class
        Greeting greeting = (Greeting) o;
        return Objects.equals(id, greeting.id) &&
               Objects.equals(message, greeting.message);
    }

    // hashCode method consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }
}
