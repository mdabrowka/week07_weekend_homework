package com.example.marta.zoo.animals;

/**
 * Created by marta on 10/11/2017.
 */

public class Platypus extends Animal {
    private int venomLevel;



    public Platypus(int cashValue, String name, int weight, int age, int venomLevel) {
        super(cashValue, name, weight, age);
        this.venomLevel = venomLevel;
    }
}
