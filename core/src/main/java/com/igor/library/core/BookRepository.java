package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;
import com.igor.library.io.FileManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepository {

    private final HashMap<String, Book> books = new HashMap<>();

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
            FileManager filerManager = new FileManager();
            filerManager.save(books.values().stream().map(Book::toCSV).collect(Collectors.toList()));
        } catch (IOException erro){
            System.out.println(erro.getMessage());
        }

    }

    public void load(String path){
        FileManager filerManager = new FileManager();

        try {
            List<String> lines = filerManager.load(path);

            for(String line: lines){
                Book book = Book.fromCSV(line);
                addBook(book);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
