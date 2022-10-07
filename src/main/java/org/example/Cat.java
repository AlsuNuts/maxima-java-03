package org.example;
/*
Описать геттеры и сеттеры всех свойств. Описать свой класс исключений — IncorrectCatWeightException и выбрасывать его
при присваивании коту отрицательного веса.

Описать фабрику котов CatFactory со статическим методом Cat createCat(String name, int weight).

Этот метод будет пытаться создать кота, если вес указан корректный, то будет создан дружелюбный кот с указанным именем и весом.

Если вес указан неверно, но будет создан сердитый кот весом 5 кг.
 */

public class Cat {
    private String name;
    private int weight;


    private boolean isAngry;
    public Cat(String name, int weight, boolean isAngry) throws Exception {
        this.name = name;
        setWeight(weight);
        this.isAngry = isAngry;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) throws Exception{
        if (weight < 0){
            throw new IncorrectCatWeightException("Эксперт, закончивший биофак, заявляет, что вес кота не может быть отрицательным");
        }
        this.weight = weight;
    }

    //String.valueOf(new Cat(name, 5, true))
}
