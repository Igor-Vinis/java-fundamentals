package com.igor.library.core;

import java.time.LocalDate;

public interface Loanable {

    void loan();
    void returnItem();
    boolean isLoaned();
    LocalDate getLoanDate();
}
