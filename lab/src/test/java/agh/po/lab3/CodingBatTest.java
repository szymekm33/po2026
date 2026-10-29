package agh.po.lab3;

import static org.junit.Assert.*;
public class CodingBatTest {
    CodingBat codingBat = new CodingBat();

    @org.junit.Test
    public void icyHot() {
        assertEquals(true, codingBat.icyHot(-10, 110));
        assertEquals(true, codingBat.icyHot(-100, 200));
        assertEquals(true, codingBat.icyHot(-99, 333));
    }

    @org.junit.Test
    public void monkeyTrouble() {
        assertEquals(false, codingBat.monkeyTrouble(true, false));
        assertEquals(true, codingBat.monkeyTrouble(false, false));
        assertEquals(true, codingBat.monkeyTrouble(true, true));
    }

    @org.junit.Test
    public void front22() {
        assertEquals("aaa", codingBat.front22("a"));
        assertEquals("cccccc", codingBat.front22("cc"));
        assertEquals("", codingBat.front22(""));
    }
}