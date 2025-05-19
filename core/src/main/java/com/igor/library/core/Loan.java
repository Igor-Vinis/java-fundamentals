package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;
import java.time.LocalDate;

public class Loan implements Loanable {

    private final Book book;
    private final Member member;
    private final  LocalDate loanDate;
    private LocalDate dueDate;
    private boolean returned;

    public Loan(Book book, Member member, LocalDate dueDate) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
        this.dueDate = dueDate;
        this.returned = false;
    }

    @Override
    public void loan() throws BookNotAvaliableException {

        if (returned == false && isLoaned()){
            throw new BookNotAvaliableException("O livro: " + book.getTitle() + " não está disponível, pois já foi emprestado");
        }
        returned = false;
    }

    @Override
    public void returnItem() throws BookNotAvaliableException {
        if(!isLoaned()){
            throw new BookNotAvaliableException("O livro " + book.getTitle() + " ainda não foi emprestado.");
        }
        returned = true;
        BookRepository book = new BookRepository();
        book.addBook(this.book);
    }

    @Override
    public boolean isLoaned(){
        return !returned;
    }

    @Override
    public LocalDate getLoanDate() {
        return LocalDate.now();
    }

    @Override
    public String toString() {
        return "Loan{" +
                "dueDate=" + dueDate +
                ", loanDate=" + loanDate +
                ", member=" + member +
                ", book=" + book +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return returned;
    }
}
