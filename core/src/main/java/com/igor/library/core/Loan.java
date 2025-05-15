package com.igor.library.core;

import java.time.LocalDate;

public class Loan implements Loanable {

    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private boolean returned;

    public Loan(Book book, Member member, LocalDate dueDate, LocalDate loanDate) {
        this.book = book;
        this.member = member;
        this.dueDate = dueDate;
        this.loanDate = loanDate;
    }

    @Override
    public void loan(Member member, Book book) {



    }

    @Override
    public void returnItem(Member member, Book book) {



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
