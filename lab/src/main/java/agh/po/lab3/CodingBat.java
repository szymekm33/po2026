package agh.po.lab3;

import java.util.Map;
import java.util.HashMap;
public class CodingBat {
    public static void main(String[] args) {
        CodingBat test = new CodingBat();

        Map<String,String>map = new HashMap<>();

        map.put("a", "aaa");
        map.put("c", "cake");
        System.out.println(test.mapAB3(map));
        System.out.println(test.wordMultiple(
                new String[]{"kot", "pies", "kot"}
        ));







        //System.out.print(test.icyHot(200, 200));
        //test.monkeyTrouble(true, true);
        //test.front22("aaa");


    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100) ) {
            return true;

        } else {
            return false;
        }

    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile  == true && bSmile == true) || (aSmile == false && bSmile == false)) {
            return true;
        } else {
            return false;
        }
    }
    public String front22(String str) {

        if (str.length() >= 2) {
            String a = str.substring( 0,2);
            return a + str + a;
        } else if (str.length() == 1) {
            String b = str.substring(0,1);
            return b + b + b;


        } else {
            return "";
        }


    }
    public Map<String, String>mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));

        }
        return map;

    }
    public Map<String, Boolean>wordMultiple(String[] strings) {
       Map<String, Boolean> mapa1 = new HashMap<>();

       for (String i : strings) {
           if (!mapa1.containsKey(i) ){
               mapa1.put(i, false);
           } else {
               mapa1.put(i, true);
           }

       }
       return mapa1;
    }


}
