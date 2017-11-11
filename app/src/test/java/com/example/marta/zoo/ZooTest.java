package com.example.marta.zoo;

import com.example.marta.zoo.animals.*;
import com.example.marta.zoo.animals.Zoo.Zoo;
import com.example.marta.zoo.animals.enclosures.*;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 10/11/2017.
 */

public class ZooTest {
    Zoo zoo;
    Enclosure<Hippo> hippoEnclosure;
    Enclosure<Platypus> platypusEnclosure;
    Enclosure<Turtle> turtleEnclosure;
    Hippo hippo1, hippo2, hippo3;
    Platypus platypus1, platypus2, platypus3;
    Turtle turtle;

    @Before
    public void before() {
        zoo = new Zoo();
        hippoEnclosure = new Enclosure<Hippo>();
        platypusEnclosure = new Enclosure<Platypus>();
        turtleEnclosure = new Enclosure<Turtle>();
        hippo1 = new Hippo(600, "Ebenezer", 400, 3, 15 );
        hippo2 = new Hippo(650, "Cleo", 500, 12, 30 );
        hippo3 = new Hippo(700, "Robert", 700, 7, 12 );
        platypus1 = new Platypus(200, "Flora", 10, 3, 8);
        platypus2 = new Platypus(100, "Ricardo", 12, 6, 4);
        platypus3 = new Platypus(130, "Siobhan", 14, 7, 6);
        turtle = new Turtle(470, "Kanye", 15, 17, "yellow");

    }

    @Test
    public void enclosuresStartEmpty() {
        assertEquals(0, zoo.enclosuresNumber());
    }

}
