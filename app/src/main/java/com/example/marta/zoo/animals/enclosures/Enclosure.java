package com.example.marta.zoo.animals.enclosures;

import com.example.marta.zoo.animals.Animal;
import com.example.marta.zoo.animals.Hippo;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> enclosure;



    public Enclosure() {
        this.enclosure = new ArrayList<T>();

    }


    public int enclosureSize() {
        return enclosure.size();
    }

    public void addToEnclosure(Animal hippo1) {
        enclosure.add((T) hippo1);
    }

    public void removeFromEnclosure(Animal hippo1) {
        enclosure.remove((T) hippo1);
    }


}
