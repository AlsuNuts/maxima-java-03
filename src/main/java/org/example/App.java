package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class App 
{
    public static void main(String[] args) throws IOException {
        StreamTransformer transformer = new StreamTransformer();
        transformer.transform("ListOfCats.csv", "ListOfCatsResult.csv");
        FileInputStream stream = new FileInputStream("ListOfCatsResult.csv");
        StringBuilder result = new StringBuilder();
        int r;
        do{
            r = stream.read();
            result.append((char) r);
        } while(r != -1);
        System.out.println(result.toString());




    }
}
        //Birthday nuts = new Birthday();
        //System.out.println(nuts.getAge(1995, 10, 2));
        //System.out.println(nuts.nextBirthday(1995, 10, 2));
        //Cat cat = new Cat("Пушок", -100, true);
        //try {Cat cat = CatFactory.createCat("Пушок", 10);}
        //catch (IncorrectCatWeightException e){}
