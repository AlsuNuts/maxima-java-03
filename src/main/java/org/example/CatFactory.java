package org.example;
/*

 В фабрике нет попытки создания кота и перехвата исключения.
 */
public class CatFactory {
    public static Cat createCat(String name, int weight) throws IncorrectCatWeightException {

        Cat cat  = null;

        try{ cat = new Cat("Пушок", -100, false);

        }


        catch (IncorrectCatWeightException e){
            return new Cat(name, 5, true);

        }
        return cat;
    }
}
