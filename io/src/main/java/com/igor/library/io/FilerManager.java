package com.igor.library.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilerManager {

    public void save (List<String> lines) throws IOException{


        try(BufferedWriter writer = new BufferedWriter(new FileWriter("BooksRepository.csv", false))) {
            for(String line : lines){
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
