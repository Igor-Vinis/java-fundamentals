package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {


    private final HashMap<String, Book> books = new HashMap<>(); // O Intellij sugere que seja final

    public void addBook(Book book){
        books.put(book.getIsbn(), book);
    }

    public void searchByIsbn(String isbn) throws BookNotAvaliableException {

        if (!books.containsKey(isbn)){
            throw new BookNotAvaliableException("O livro não foi encontrado");
        }
        System.out.println(books.get(isbn));
    }

    public void listAll(){
        for(Map.Entry<String, Book> book: books.entrySet()){
            System.out.println(book.getValue());
        }
    }

}
