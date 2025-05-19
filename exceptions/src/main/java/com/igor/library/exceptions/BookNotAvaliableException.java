package com.igor.library.exceptions;

public class BookNotAvaliableException extends Exception{

    public BookNotAvaliableException(String message){
        super(message);
    }

    public BookNotAvaliableException(String message, Throwable cause){
        super(message, cause);
    }
}
