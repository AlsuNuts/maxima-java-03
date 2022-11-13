package org.example;



import java.util.ArrayList;

public class QueueKitchen <T> implements  AnimalKitchen <T>{
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

        getAnimals().remove(0);

    }
}
