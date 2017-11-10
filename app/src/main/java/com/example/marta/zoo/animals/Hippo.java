package com.example.marta.zoo.animals;

/**
 * Created by marta on 10/11/2017.
 */

public class Hippo extends Animal {
    private int teethNumber;


    public Hippo(int cashValue, String name, int weight, int age, int teethNumber) {
        super(cashValue, name, weight, age);
        this.teethNumber = teethNumber;
    }
}
