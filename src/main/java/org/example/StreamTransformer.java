package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*Дан csv-файл с разделителями «;», содержащий данные: Имя кота, вес кота, сердитость (true или false).

Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut). Параметрами задается имя входного и имя выходного файла.

Описать класс StreamTransformer, реализующий этот интерфейс при помощи классов FileInputStream / FileOuputStream
*/
public class StreamTransformer implements Transformable{




    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileInputStream stream = new FileInputStream(fileIn);
        FileOutputStream outputStream = new FileOutputStream(fileOut, false);
        BufferedInputStream bufStream = new BufferedInputStream(stream);
        StringBuilder result = new StringBuilder();
        int line = bufStream.read() ;
        while (line != -1) {
            line = stream.read();
            String[] arr = result.toString().split(";");
            String isAngry = arr[2].equals("true") ? "Сердитый" : "Дружелюбный";
            outputStream.write(String.format("%s кот %s весом %s кг." + "\n", isAngry, arr[0], arr[1]).getBytes());
        }
        outputStream.write(result.toString().getBytes(StandardCharsets.UTF_8), 0, result.length());
        outputStream.flush();
        outputStream.close();

    }
}
/*
s = bufStream.read()) !=-1)

        String line;
        while ((line = reader.readLine()) != null){
            String [] arr = line.split(";");
            String isAngry = arr[2].equals("true") ? "Сердитый" : "Дружелюбный";
            writer.write(String.format("%s кот %s весом %s кг." + "\n", isAngry, arr[0], arr[1]));

        }
 */