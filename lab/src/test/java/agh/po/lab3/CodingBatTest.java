package agh.po.lab3;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

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
    @org.junit.Test
    public void mapB3() {
        Map<String,String>map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("c", "ccc");
        Map<String, String>wynik1 = codingBat.mapAB3(map1);
        assertEquals("aaa", wynik1.get("b"));

        Map<String,String>map2 = new HashMap<>();
        map2.put("b", "blad");
        Map<String,String>wynik2 = codingBat.mapAB3(map2);
        assertEquals("blad", wynik2.get("a"));

        //Map<String, String>map3 = new HashMap<>();
        //map3.put("a", "")



    }
}