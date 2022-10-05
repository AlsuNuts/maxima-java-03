package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
/*
Описать класс Birthday c двумя статическими методами:

int getAge(int year, int month, int date) — вернет возраст в днях

LocalDate nextBirthday(int year, int month, int date) — вернет дату следующего дня рождения в 1000 дней.
 */

public class Birthday {


    public int getAge(int year, int month, int date){
        LocalDate myBirthday = LocalDate.of(year, month, date);
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.DAYS.between(myBirthday, today);

    }
    public LocalDate nextBirthday(int year, int month, int date) {
        LocalDate myBirthday = LocalDate.of(year, month, date);
        int myAge = getAge(year, month, date);
        int counter = 0;
        while (myAge / 1000 > 0) {

            counter += 1;
            myAge -= 1000;
        }
        return myBirthday.plus((counter+1) * 1000, ChronoUnit.DAYS);
    }

} //counter = (counter++)*1000; myBirthday.plus((counter++) * 1000, ChronoUnit.DAYS)

