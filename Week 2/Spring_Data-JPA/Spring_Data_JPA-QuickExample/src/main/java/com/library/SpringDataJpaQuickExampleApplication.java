package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaQuickExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaQuickExampleApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {
                bookRepository.save(new Book("Spring in Action", "Craig Walls"));
                bookRepository.save(new Book("Effective Java", "Joshua Bloch"));
            }

            System.out.println("Spring Data JPA quick example is ready.");
            System.out.println("Books available: " + bookRepository.count());
        };
    }
}
