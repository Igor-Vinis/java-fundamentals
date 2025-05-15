package com.igor.library.core;

import java.util.Objects;

public class Book {

    private final String isbn;
    private final String title;
    private final String autor;

    public Book(String isbn, String title, String autor) {
        this.isbn = isbn;
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
