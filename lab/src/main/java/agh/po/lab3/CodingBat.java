package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat test = new CodingBat();
        System.out.print(test.icyHot(200, 200));
        test.monkeyTrouble(true, true);
        test.front22("aaa");


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



}
