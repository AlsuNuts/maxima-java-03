package org.example;

public class Cat {
    private String name;
    private int weight;


    private boolean isAngry;
    public Cat(String name, int weight, boolean isAngry) throws IncorrectCatWeightException {
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
    public void setWeight(int weight) throws IncorrectCatWeightException{
        if (weight < 0){
            throw new IncorrectCatWeightException("Эксперт, закончивший биофак, заявляет, что вес кота не может быть отрицательным");
        }
        this.weight = weight;
    }
}
