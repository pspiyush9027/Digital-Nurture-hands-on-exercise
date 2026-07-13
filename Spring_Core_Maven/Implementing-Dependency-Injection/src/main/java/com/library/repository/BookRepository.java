package com.library.repository;

public class BookRepository {

    public String getBookById(int bookId) {
        if (bookId == 101) {
            return "Clean Code";
        }

        return "Book not found";
    }
}
