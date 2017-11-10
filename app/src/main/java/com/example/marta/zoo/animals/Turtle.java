package com.example.marta.zoo.animals;

/**
 * Created by marta on 10/11/2017.
 */

public class Turtle extends Animal {
    private String shellColour;


    public Turtle(int cashValue, String name, int weight, int age, String shellColour) {
        super(cashValue, name, weight, age);
        this.shellColour = shellColour;
    }
}
