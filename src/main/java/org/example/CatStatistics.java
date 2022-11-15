package org.example;
/*
Описать класс CatStatistics со статическими методами:


int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) — возвращает суммарный вес всех котов (если параметр onlyAngry равен true, то только сердитых котов).

Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats) — возвращает список котов сгруппировав их по первой букве имени
и отсортировав группировку по возрастанию.

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CatStatistics <T> {
    ArrayList <T> cats = new ArrayList<>();

    public ArrayList<T> getCats() {
        return cats;
    }
    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats){
        return cats.stream()
                .sorted((cat1, cat2) -> cat1.getName().compareTo(cat2.getName()))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats){
        return cats.stream()
                .sorted((cat1, cat2) -> cat2.getWeight() - cat1.getWeight())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Cat> removeFirstAndLast (ArrayList<Cat> cats){
        return cats.stream()
                .skip(1)
                .limit(cats.size()-2)
                .collect(Collectors.toCollection(ArrayList::new));
    }
    public static ArrayList<Cat> findFirstNonAngryCat (ArrayList<Cat> cats){
        return cats.stream()
                .filter((cat) -> !cat.isAngry())
                .limit(1)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static  int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry){
        return cats.stream()
                .filter(cat -> !onlyAngry || cat.isAngry())
                .map(Cat::getWeight)
                .reduce(Integer::sum).orElse(0);

    }
    public static Map<String, List<Cat>> groupCatsByFirstLetter (ArrayList<Cat> cats){
        return cats.stream()
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.groupingBy(s -> s.getName().substring(0,1)));
    }

}
/*
Преобразовать в map, сгруппировав по первому символу строки
strings.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)))
 */
