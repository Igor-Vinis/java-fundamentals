package com.igor.library.io;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public void save (List<String> lines) throws IOException{


        try(BufferedWriter writer = new BufferedWriter(new FileWriter("BooksRepository.csv", false))) {
            for(String line : lines){
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public List<String> load(String path) throws IOException{

        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path, Charset.defaultCharset()))){

            String line;
            while ((line = reader.readLine()) != null ){
               lines.add(line);
            }

        } catch (IOException erro) {
            throw new IOException(erro);
        }
        return lines;
    }
}
