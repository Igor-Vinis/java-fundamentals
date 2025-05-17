package com.igor.library.core;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Book livro = new Book("123abc", "Kamasutra", "GengisKhan");
        Member membro = new Member("01a", "Rafael");
        Loan loan = new Loan(livro, membro, LocalDate.now().plusDays(1));

        System.out.println(loan.isLoaned());
        System.out.println(loan.isReturned());
        //loan.loan();
        //System.out.println(loan.isLoaned());
        //System.out.println(loan.isReturned());
        loan.returnItem();
        System.out.println(loan.isLoaned());
        System.out.println(loan.isReturned());


    }
}
