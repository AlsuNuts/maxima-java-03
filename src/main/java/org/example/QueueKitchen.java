package org.example;



import java.util.ArrayList;

public class QueueKitchen <T> extends StackKitchen <T>{
    @Override
    public void feed() {
        getAnimals().remove(0);
    }
}
