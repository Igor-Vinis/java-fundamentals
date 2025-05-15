package com.igor.library.core;

import java.time.LocalDate;

public interface Loanable {

    void loan(Member member, Book book);
    void returnItem(Member member, Book book);
    boolean isLoaned();
    LocalDate getLoanDate();
}
