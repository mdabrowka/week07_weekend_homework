package com.example.marta.zoo;

import com.example.marta.zoo.animals.Zoo.Visitor;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 12/11/2017.
 */

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor("Fran", 60);
    }

    @Test
    public void canGetName() {
        assertEquals("Fran", visitor.getName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(60, visitor.getBudget());
    }

    @Test
    public void canSpendMoneyFromBudget() {
        visitor.payFromBudget(15);
        assertEquals(45, visitor.getBudget());
    }

    @Test
    public void canCheckFunds() {
        visitor.checkFunds(17);
        assertEquals(true, visitor.checkFunds(17));
    }


}
