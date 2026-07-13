package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printBookDetails() {
        System.out.println("BookService received BookRepository using Spring DI.");
        System.out.println("Book selected: " + bookRepository.getBookById(101));
    }
}
