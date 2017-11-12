package com.example.marta.zoo.animals.Zoo;

import com.example.marta.zoo.animals.Animal;
import com.example.marta.zoo.animals.enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;
    private int till;


    public Zoo(int till) {
        this.enclosures = new ArrayList();
        this.till = till;

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

    public int animalCount() {
        int total = 0;
        for (Enclosure enclosure : enclosures) {
            total += enclosure.enclosureSize();
        }
        return total;
    }

    public int getTill() {
        return this.till;
    }


    public boolean findAnimal(Animal animal) {
        for (Enclosure enclosure : enclosures) {
            if (enclosures.contains(animal));
                return true;
        }
        return false;
    }

    public void sellAnimal(Animal animal) {
        for (Enclosure enclosure : enclosures) {
            if (findAnimal(animal) == true)
                enclosure.removeFromEnclosure(animal);
        }
    }




}
