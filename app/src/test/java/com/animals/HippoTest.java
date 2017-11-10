package com.animals;

import com.example.marta.zoo.animals.*;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by marta on 10/11/2017.
 */

public class HippoTest {
    Hippo hippo;

    @Before
    public void before() {
        hippo = new Hippo(1000, "Harold", 400, 12, 20);
    }


    @Test
    public void checkTeethNumber() {
        assertEquals(20, hippo.getTeethNumber());
    }


    @Test
    public void checkCashValue() {
        assertEquals(1000, hippo.getCashValue());
    }

    @Test
    public void checkName() {
        assertEquals("Harold", hippo.getName());
    }

   @Test
    public void checkWeight() {
        assertEquals(400, hippo.getWeight());
    }

    @Test
    public void checkAge() {
        assertEquals(12, hippo.getAge());
    }


}
