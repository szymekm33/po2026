package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public  static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

      //  String dlugosc = args[0];

        Random losowanie = new Random();

        for (int i = 0; i<6;i ++) {
            int n = losowanie.nextInt(50);
            if (lista.size() == 0) {
                lista.add(n);


            } else {
                int sumadobrych = 0;
                for (int b =0; b<i; b++){
                    int c = lista.get(b);
                    if (n != c) {
                        sumadobrych ++;
                    }



                }
                if (sumadobrych == lista.size()) {
                    lista.add(n);
                }

            }



        }


        System.out.println(lista);

    }
}
