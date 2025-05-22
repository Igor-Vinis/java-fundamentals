package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;
import com.igor.library.io.FilerManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepository {

    private final HashMap<String, Book> books = new HashMap<>();
    private List<String> lista = books.values().stream().map(Book::toCSV).collect(Collectors.toList());

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }
    public void searchByIsbn(String isbn) throws BookNotAvaliableException{

        if (!books.containsKey(isbn)) {
            throw new BookNotAvaliableException("Livro não encontrado");
        }
        System.out.println(books.get(isbn));
    }

    public void listAll () {
        for (Map.Entry<String, Book> book : books.entrySet()) {
            System.out.println(book.getValue());
        }

    }

    public void save() throws IOException {
        try{
            FilerManager filerManager = new FilerManager();
            filerManager.save(books.values().stream().map(Book::toCSV).collect(Collectors.toList()));
        } catch (IOException erro){
            System.out.println(erro.getMessage());
        }

    }
}
