package com.example.marta.zoo;

import com.example.marta.zoo.animals.*;
import com.example.marta.zoo.animals.Zoo.Ticket;
import com.example.marta.zoo.animals.Zoo.Visitor;
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
    Ticket fullPriceTicket;
    Visitor visitor1, visitor2;
    Enclosure<Hippo> hippoEnclosure;
    Enclosure<Platypus> platypusEnclosure;
    Enclosure<Turtle> turtleEnclosure;
    Hippo hippo1, hippo2, hippo3;
    Platypus platypus1, platypus2, platypus3;
    Turtle turtle;

    @Before
    public void before() {
        zoo = new Zoo(0);
        fullPriceTicket = new Ticket(12);
        visitor1 = new Visitor("Andy", 15);
        visitor2 = new Visitor("Will", 25);
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

    @Test
    public void canAddEnclosures() {
        zoo.addEnclosure(hippoEnclosure);
        assertEquals(1, zoo.enclosuresNumber());
   }

    @Test
    public void canRemoveEnclosures() {
        zoo.addEnclosure(platypusEnclosure);
        zoo.addEnclosure(hippoEnclosure);
        zoo.removeEnclosure(hippoEnclosure);
        assertEquals(1, zoo.enclosuresNumber());
    }

    @Test
    public void canCalculateNumberOfAnimalsInZoo() {
        hippoEnclosure.addToEnclosure(hippo1);
        hippoEnclosure.addToEnclosure(hippo2);
        hippoEnclosure.addToEnclosure(hippo3);
        platypusEnclosure.addToEnclosure(platypus1);
        platypusEnclosure.addToEnclosure(platypus2);
        platypusEnclosure.addToEnclosure(platypus3);
        turtleEnclosure.addToEnclosure(turtle);
        zoo.addEnclosure(hippoEnclosure);
        zoo.addEnclosure(platypusEnclosure);
        zoo.addEnclosure(turtleEnclosure);
        assertEquals(7, zoo.animalCount());
    }


    @Test
    public void zooCanFindAnimal() {
        hippoEnclosure.addToEnclosure(hippo1);
        hippoEnclosure.addToEnclosure(hippo2);
        platypusEnclosure.addToEnclosure(platypus1);
        zoo.addEnclosure(hippoEnclosure);
        zoo.addEnclosure(platypusEnclosure);
        zoo.findAnimal(hippo1);
        assertEquals(true, zoo.findAnimal(hippo1));
    }

    @Test
    public void zooCanRemoveAnimalFromAnEnclosure() {
        hippoEnclosure.addToEnclosure(hippo1);
        hippoEnclosure.addToEnclosure(hippo2);
        hippoEnclosure.addToEnclosure(hippo3);
        platypusEnclosure.addToEnclosure(platypus1);
        platypusEnclosure.addToEnclosure(platypus2);
        platypusEnclosure.addToEnclosure(platypus3);
        turtleEnclosure.addToEnclosure(turtle);
        zoo.addEnclosure(hippoEnclosure);
        zoo.addEnclosure(platypusEnclosure);
        zoo.addEnclosure(turtleEnclosure);
        zoo.sellAnimal(hippo1);
        assertEquals(6, zoo.animalCount());
    }

    @Test
    public void canAddToTheTill() {
        zoo.addToTill(3);
        assertEquals(3, zoo.getTill());
    }

    @Test
    public void canSellAnimalAndReceiveCash() {
        hippoEnclosure.addToEnclosure(hippo1);
        hippoEnclosure.addToEnclosure(hippo2);
        zoo.addEnclosure(hippoEnclosure);
        zoo.sellAnimal(hippo1);
        assertEquals(600, zoo.getTill());
    }

    @Test
    public void canCalculateValueOfAllAnimals() {
        hippoEnclosure.addToEnclosure(hippo1);
        hippoEnclosure.addToEnclosure(hippo2);
        zoo.addEnclosure(hippoEnclosure);
        assertEquals(1250, zoo.totalAnimalValue());
    }

    @Test
    public void zooCanSellTicket() {
        zoo.sellTicket(fullPriceTicket);
        assertEquals(12, zoo.getTill());
    }

    @Test
    public void zooStartsWithNoVisitors() {
        assertEquals(0, zoo.visitorCount());
    }

    @Test
    public void canAddVisitors() {
        zoo.addVisitor(visitor1);
        assertEquals(1, zoo.visitorCount());
    }

    @Test
    public void checkIfVisitorHasSufficientFunds() {
        visitor1.checkFunds(fullPriceTicket.getPrice());
        assertEquals(true, visitor1.checkFunds(fullPriceTicket.getPrice()));
    }

    @Test
    public void canAdmitVisitorAndAcceptPayment() {
        zoo.admitVisitor(visitor1, fullPriceTicket);
        assertEquals(12, zoo.getTill());
        assertEquals(3, visitor1.getBudget());
        assertEquals(1, zoo.visitorCount());
    }

}
