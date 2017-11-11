package com.example.marta.zoo.animals.Zoo;

import com.example.marta.zoo.animals.Animal;
import com.example.marta.zoo.animals.Hippo;
import com.example.marta.zoo.animals.enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;


    public Zoo() {
        this.enclosures = new ArrayList();

    }

    public ArrayList<Enclosure> getEnclosures() {
        return this.enclosures;
    }


    public int enclosuresNumber() {
        return enclosures.size();
    }

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosures.remove(enclosure);
    }



//    public int animalCount() {
////        iterate through enclosures within the enclosures array and get enclosure.size for each, then add
//        // all the sizes
//    }

}
