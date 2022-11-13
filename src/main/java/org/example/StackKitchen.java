package org.example;

import java.util.ArrayList;

public class StackKitchen <T> implements AnimalKitchen <T>{
    ArrayList<T> animals = new ArrayList<>();


    public ArrayList<T> getAnimals() {
        return animals;
    }

    @Override
    public void add(T animal) {
        animals.add(animal);
    }

    @Override
    public void feed() {
        getAnimals().remove(animals.size() -1);

    }
}


