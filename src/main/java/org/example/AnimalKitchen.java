package org.example;
/*

Описать интерфейс AnimalKitchen — описывает кормление группы любых животных. Методы:

void add ( экземпляр животного) — добавить животное в очередь.

void feed() - покормить очередное животное (исключить его из очереди на кормление).
 */

public interface AnimalKitchen {
    public void add(String Animal);
    public void feed();

}
