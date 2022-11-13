package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class App 
{
    public static void main(String[] args) throws IOException, IncorrectCatWeightException {
        ArrayList<String> cats = new ArrayList<String>();
        cats.add(0, String.valueOf(new Cat("Мурзик", 10, false)));
        cats.add(0, String.valueOf(new Cat("Пушок", 8, true)));
        cats.add(0, String.valueOf(new Cat("Кусец", 5, false)));

        ArrayList<String> dogs = new ArrayList<String>();
        dogs.add(0, String.valueOf(new Dog("Дружок", 20, false)));
        dogs.add(0, String.valueOf(new Dog("Тузик", 23, true)));
        dogs.add(0, String.valueOf(new Dog("Белка", 12, false)));

        QueueKitchen fifo= new QueueKitchen();
        for (String cat: cats){
            fifo.add(cat);

        }
        System.out.println(fifo.getAnimals());
        fifo.feed();
        System.out.println(fifo.getAnimals());
        StackKitchen lifo = new StackKitchen();
        for (String cat: cats){
            lifo.add(cat);

        }
        System.out.println(lifo.getAnimals());
        lifo.feed();
        System.out.println(lifo.getAnimals());






    }
}
        //Birthday nuts = new Birthday();
        //System.out.println(nuts.getAge(1995, 10, 2));
        //System.out.println(nuts.nextBirthday(1995, 10, 2));
        //Cat cat = new Cat("Пушок", -100, true);
        //try {Cat cat = CatFactory.createCat("Пушок", 10);}
        //catch (IncorrectCatWeightException e){}
/*
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
 */
