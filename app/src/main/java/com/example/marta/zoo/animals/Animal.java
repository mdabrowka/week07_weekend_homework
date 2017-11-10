package com.example.marta.zoo.animals;

/**
 * Created by marta on 10/11/2017.
 */

public abstract class Animal {
    private int cashValue;
    private String name;
    private int weight;
    private int age;

    public Animal(int cashValue, String name, int weight, int age) {
        this.cashValue = cashValue;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
}
