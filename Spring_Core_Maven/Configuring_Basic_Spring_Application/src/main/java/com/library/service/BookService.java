package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBookDetails() {
        System.out.println("BookService is running.");
        System.out.println("Book found: " + bookRepository.findBookTitle());
    }
}
