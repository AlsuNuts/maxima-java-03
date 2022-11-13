package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*Дан csv-файл с разделителями «;», содержащий данные: Имя кота, вес кота, сердитость (true или false).

Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut). Параметрами задается имя входного и имя выходного файла.

Описать класс StreamTransformer, реализующий этот интерфейс при помощи классов FileInputStream / FileOuputStream
здесь мы читаем посимвольно, вначале собираем строку (один цикл), потом ее сплитуем в массив, и во втором цикле построчно пишем в файл.
проблема в том что line - это один байт из файла. Вот попробуйте прочитать первые 10 байт и вывести их в консоль.
*/
public class StreamTransformer implements Transformable{

    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileInputStream fis = new FileInputStream(fileIn);
        StringBuilder result = new StringBuilder();

        String doc = new String(fis.readAllBytes(), StandardCharsets.UTF_8);
        String [] parameters = doc.trim().split("\n"); // это вообще верно?
        for(String cat:parameters){
            parameters = cat.split(";");

            result.append(String.format("%s кот %s весом %s кг." + "\n",  parameters[2].equals("true") ? "Сердитый" : "Дружелюбный", parameters [0], parameters [1]));
        }
        FileOutputStream fos = new FileOutputStream(fileOut, false);
        fos.write(result.toString().getBytes(StandardCharsets.UTF_8));
        fos.flush();
        fos.close();
    }




}
/*
    replace("\n", "").trim().split(";") //заменяем \n на ничего, убираем пробелы, раздеяем текст
    ("%s кот %s весом %s кг." + "\n",  arr[2].equals("true") ? "Сердитый" : "Дружелюбный", arr [0], arr [1]).getBytes(StandardCharsets.UTF_8)
     String isAngry = arr[2].equals("true") ? "Сердитый" : "Дружелюбный";

     ебать ты говно, конечно
     вся жизнь по пизде пошла
     и где свернула не туда?
 */
