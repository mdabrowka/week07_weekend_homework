package com.example.marta.zoo.animals.enclosures;

import com.example.marta.zoo.animals.Animal;
import com.example.marta.zoo.animals.Hippo;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> enclosure;
    private Animal hippo;


    public Enclosure() {
        this.enclosure = new ArrayList<T>();
        this.hippo = new Hippo(200, "Polly", 3, 4, 26) {
        };
    }


    public int enclosureSize() {
        return enclosure.size();
    }

    public void addToEnclosure() {
        enclosure.add((T) hippo);
    }


}
