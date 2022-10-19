package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class App 
{
    public static void main(String[] args) throws IOException {
        StringBuilder result = new StringBuilder();
        FileReader reader;
        try {
            reader = new FileReader("ListOfCats.csv");
            int s;
            do {
                s = reader.read();
                result.append((char) s);
            }
            while (s != -1);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
        //Birthday nuts = new Birthday();
        //System.out.println(nuts.getAge(1995, 10, 2));
        //System.out.println(nuts.nextBirthday(1995, 10, 2));
        //Cat cat = new Cat("Пушок", -100, true);
        //try {Cat cat = CatFactory.createCat("Пушок", 10);}
        //catch (IncorrectCatWeightException e){}
