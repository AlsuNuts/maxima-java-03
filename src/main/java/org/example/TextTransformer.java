package org.example;

import java.io.*;
public class TextTransformer implements Transformable{
    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileWriter writer= new FileWriter(fileOut, false);
        BufferedReader reader = new BufferedReader(new FileReader(fileIn));
        String line;
        while ((line = reader.readLine()) != null){
            String [] arr = line.split(";");
            String isAngry = arr[2].equals("true") ? "Сердитый" : "Дружелюбный";
            writer.write(String.format("%s кот %s весом %s кг." + "\n", isAngry, arr[0], arr[1]));

        }
        writer.flush();
        writer.close();
    }
}
