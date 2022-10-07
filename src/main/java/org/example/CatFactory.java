package org.example;

public class CatFactory {
    public static Cat createCat(String name, int weight) throws Exception {
        return new Cat(name, 5, true);
    }
}
