package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class App 
{
    public static void main(String[] args) throws Exception{

        try {
            Cat cat = new Cat("Пушок", -100, false);
        }
        catch (IncorrectCatWeightException e){
            System.out.println("Error, brain not found");
        }

        //Birthday nuts = new Birthday();
        //System.out.println(nuts.getAge(1995, 10, 2));
        //System.out.println(nuts.nextBirthday(1995, 10, 2));
        //Cat cat = new Cat("Пушок", -100, true);

    }
}
