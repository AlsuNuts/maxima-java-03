package org.example;

import java.io.FileWriter;

/*
Дан csv-файл с разделителями «;», содержащий данные:

Имя кота, вес кота, сердитость (true или false).

Сформировать текстовый файл каждая строка которого будет соответствовать строке входного файла и иметь вид: <Сердитый (Дружелюбный)> кот <Имя> весом <n>кг.

Для этого описать интерфейс Transformable с методом void transform(String fileIn, String fileOut). Параметрами задается имя входного и имя выходного файла.

Описать класса, реализующий этот интерфейс:

TextTransformer, при помощи классов FileReader / FileWriter
 */
public class TextTransformer implements Transformable{
    @Override
    public void transform(String fileIn, String fileOut) {
        //FileWriter writer = new FileWriter("ListOfCats.csv");
    }
}
