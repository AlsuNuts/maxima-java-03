package org.example;

import java.io.*;

/*
Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut). Параметрами задается имя входного и имя выходного файла.

Описать класс, реализующий этот интерфейс: TextTransformer, при помощи классов FileReader / FileWriter

 */

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
