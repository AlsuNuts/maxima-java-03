package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class App 
{
    public static void main(String[] args){
        Birthday nuts = new Birthday();
        System.out.println(nuts.getAge(1995, 10, 2));
        System.out.println(nuts.nextBirthday(1995, 10, 2));

    }
}
