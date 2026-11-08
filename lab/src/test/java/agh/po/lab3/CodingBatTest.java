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

        Map<String, String>map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        Map<String, String>wynik3 = codingBat.mapAB3(map3);
        assertEquals("aaa", wynik3.get("a"));
        assertEquals("bbb", wynik3.get("b"));
        assertEquals(2, wynik3.size());

    }
    @org.junit.Test
    public void wordMultiple(){
        String[] dane = {"cos", "inne", "cos"};
        Map<String, Boolean> wynik = codingBat.wordMultiple(dane);
        assertEquals(Boolean.TRUE, wynik.get("cos"));

        String[] dane2 = {"kot", "pies", "lis"};
        Map<String, Boolean> wynik2 = codingBat.wordMultiple(dane2);
        assertEquals(Boolean.FALSE, wynik2.get("kot"));
        assertEquals(Boolean.FALSE, wynik2.get("pies"));
        assertEquals(Boolean.FALSE, wynik2.get("lis"));
        assertEquals(3, wynik2.size());

        String[] dane3 = {"kot", "kot", "kot"};
        Map<String, Boolean> wynik3 = codingBat.wordMultiple(dane3);
        assertEquals(Boolean.TRUE, wynik3.get("kot"));
        assertEquals(1, wynik3.size());
    }
}
