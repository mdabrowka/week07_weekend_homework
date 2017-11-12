package com.example.marta.zoo.animals.Zoo;

/**
 * Created by marta on 12/11/2017.
 */

public class Visitor {
    private String name;
    private int budget;


    public Visitor(String name, int budget) {
        this.name = name;
        this.budget = budget;

    }

    public String getName() {
        return this.name;
    }

    public int getBudget() {
        return this.budget;
    }

    public void payFromBudget(int cash) {
        this.budget -= cash;
    }

    public boolean checkFunds(int amount) {
        if (this.budget >= amount);
        return true;
    }

}
