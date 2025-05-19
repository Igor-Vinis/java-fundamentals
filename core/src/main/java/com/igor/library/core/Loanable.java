package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;

import java.time.LocalDate;

public interface Loanable {

    void loan() throws BookNotAvaliableException;
    void returnItem () throws BookNotAvaliableException;
    boolean isLoaned();
    LocalDate getLoanDate();
}
