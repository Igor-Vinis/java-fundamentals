package com.igor.library.core;

import java.util.HashMap;

public class BookRepository {

    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book){
        books.put(book.getIsbn(), book);
    }

    public Book searchByIsbn(String isbn){

        return books.get(isbn);
    }

}
