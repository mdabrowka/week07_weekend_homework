package com.enclosures;

import com.example.marta.zoo.animals.*;
import com.example.marta.zoo.animals.enclosures.Enclosure;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 10/11/2017.
 */

public class EnclosureTest {

    Enclosure hippoEnclosure;
    Enclosure platypusEnclosure;
    Enclosure turtleEnclosure;
    Animal hippo1;
    Animal hippo2;
    Animal hippo3;
    Animal platypus1;
    Animal platypus2;
    Animal platypus3;
    Animal turtle;

    @Before
    public void before() {
        hippoEnclosure = new Enclosure();
        platypusEnclosure = new Enclosure();
        turtleEnclosure = new Enclosure();
        hippo1 = new Hippo(600, "Ebbie", 400, 3, 15 );
        hippo2 = new Hippo(650, "Cleo", 500, 12, 30 );
        hippo3 = new Hippo(700, "Robert", 700, 7, 12 );
        platypus1 = new Platypus(200, "Flora", 10, 3, 8);
        platypus2 = new Platypus(100, "Ricardo", 12, 6, 4);
        platypus3 = new Platypus(130, "Siobhan", 14, 7, 6);
        turtle = new Turtle(470, "Kanye", 15, 17, "yellow");

    }


    @Test
    public void enclosureStartsEmpty() {
        assertEquals(0, hippoEnclosure.enclosureSize());
    }

}