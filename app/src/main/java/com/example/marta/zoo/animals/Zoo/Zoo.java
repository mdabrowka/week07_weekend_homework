package com.example.marta.zoo.animals.Zoo;

import com.example.marta.zoo.animals.enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;



    public void addEnclosure() {
        Enclosure newEnclosure = new Enclosure();
        enclosures.add(newEnclosure);
    }

}
