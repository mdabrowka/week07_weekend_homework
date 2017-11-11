package com.example.marta.zoo.animals.enclosures;

import com.example.marta.zoo.animals.Animal;


import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
     ArrayList<T> enclosure;



    public Enclosure() {
        this.enclosure = new ArrayList();

    }


    public int enclosureSize() {
        return enclosure.size();
    }

    public void addToEnclosure(T animal) {
        enclosure.add(animal);
    }

    public void removeFromEnclosure(T animal) {
        enclosure.remove(animal);
    }


}
