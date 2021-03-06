package com.example.marta.zoo.animals.Zoo;

import com.example.marta.zoo.animals.Animal;
import com.example.marta.zoo.animals.enclosures.Enclosure;

import java.util.ArrayList;

/**
 * Created by marta on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Visitor> visitors;
    private int till;
    private Ticket ticket;
    private Visitor visitor;


    public Zoo(int till) {
        this.visitors = new ArrayList();
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
            if (enclosures.contains(animal)) ;
            return true;
        }
        return false;
    }

    public void sellAnimal(Animal animal) {
        for (Enclosure enclosure : enclosures) {
            if (findAnimal(animal) == true)
                enclosure.removeFromEnclosure(animal);
            int cash = animal.getCashValue();
            addToTill(cash);
        }
    }

    public void addToTill(int cash) {
        this.till += cash;
    }


    public int totalAnimalValue() {
        int zooTotal = 0;
        for (Enclosure enclosure : enclosures) {
            zooTotal += enclosure.enclosureCashValue();

        }
        return zooTotal;
    }

    public void sellTicket(Ticket ticket) {
        this.till += ticket.getPrice();
    }


    public int visitorCount() {
        return visitors.size();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

//    public void admitVisitor(Visitor visitor, Ticket ticket) {
//        visitor.payFromBudget(ticket.getPrice());
//        addVisitor(visitor);
//    }





    public void admitVisitor(Visitor visitor, Ticket ticket) {
        int ticketPrice = ticket.getPrice();
        if (visitor.checkFunds(ticketPrice) == true) {
            visitor.payFromBudget(ticketPrice);
            sellTicket(ticket);
            addVisitor(visitor);
        }
    }
}




