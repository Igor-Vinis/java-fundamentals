package com.igor.library.core;

import com.igor.library.exceptions.BookNotAvaliableException;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Logger;
import java.util.logging.LogManager;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        try {
            LogManager.getLogManager().readConfiguration(
                    Main.class.getResourceAsStream("/logging.properties")
            );
        } catch (IOException e){
            LOGGER.severe("Falha ao carregar configurações de logs: " + e.getMessage());
        }

        Book livro = new Book("123abc", "Kamasutra", "GengisKhan");
        Member membro = new Member("01a", "Rafael");
        Loan loan = new Loan(livro, membro, LocalDate.now().plusDays(1));

//        System.out.println(loan.isLoaned());
//        System.out.println(loan.isReturned());
//        try{
//            loan.loan();
//        } catch (BookNotAvaliableException e) {
//            System.out.println("Erro! " + e.getMessage());
//        }
//
//        try {
//            loan.returnItem();
//        } catch (BookNotAvaliableException e) {
//            System.out.println("Erro! " + e.getMessage());
//        }
//
        BookRepository repo = new BookRepository();

        Book livro2 = new Book("abcde12", "Reiventando a roda", "Manoel");
        Book livro3 = new Book("xyz123", "Jardim dos amassos", "Kakashi");

        repo.addBook(livro);
        repo.addBook(livro2);
        repo.addBook(livro3);

        String pesquisa = "e17b11";

        try {
            repo.searchByIsbn(pesquisa);
            LOGGER.info("Livro pesquisado: " + pesquisa);
        } catch (BookNotAvaliableException e) {
//            System.out.println("Erro! " + e.getMessage());
            LOGGER.warning("Falha ao pesquisar livro: " + e.getMessage());
        }

        repo.listAll();



    }
}
