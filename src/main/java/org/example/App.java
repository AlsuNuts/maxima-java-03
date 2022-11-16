package org.example;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class App 
{
    public static void main(String[] args) throws IncorrectCatWeightException {
        Cat murzik = new Cat("Мурзик", 10, false);
        Cat pushok = new Cat("Пушок", 8, true);
        Cat kusya = new Cat ("Кусец", 5, false);
        Cat barsik = new Cat("Барсик", 12, true);
        Cat matroskin = new Cat("Матроскин", 9, false);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(murzik);
        cats.add(pushok);
        cats.add(kusya);
        cats.add(barsik);
        cats.add(matroskin);
        System.out.println(murzik);
        System.out.println(pushok);
        System.out.println(kusya);

        CatStatistics <Cat> catStatistics = new CatStatistics<>();
        //catStatistics.sortByNameAscending(cats);
        //catStatistics.sortByWeightDescending(cats);
        //System.out.println(catStatistics.findFirstNonAngryCat(cats));
        System.out.println(catStatistics.getCommonWeight(cats, true));
        //catStatistics.removeFirstAndLast(cats);
        //catStatistics.getCommonWeight(cats, false);
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

 */
