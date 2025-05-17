package com.igor.library.core;

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
    public void loan() {
        if (returned == false && isLoaned()){
            throw new IllegalStateException("O livro já foi emprestado.");
        }
        returned = false;
    }

    @Override
    public void returnItem() {
        if(!isLoaned()){
            throw new IllegalStateException("O livro ainda não foi emprestado.");
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
        return null;
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
