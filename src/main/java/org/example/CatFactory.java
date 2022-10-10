package org.example;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException {

        Cat cat;

        try{ cat = new Cat(name, weight, false);
        }
        catch (IncorrectCatWeightException e){
            return new Cat(name, 5, true);
        }
        return cat;
    }
}
