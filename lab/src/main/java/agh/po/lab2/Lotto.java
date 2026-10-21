package agh.po.lab2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        long poczatek = System.currentTimeMillis();
        ArrayList<Integer> typy = new ArrayList<>();
        for (int a = 0; a < args.length; a++){
            int los = Integer.parseInt(args[a]);
            typy.add(los);
        }

        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random losowanie = new Random();
        int trafienia = 0;
        long liczbalosowan = 0;
        while (trafienia < 6) {
            liczbalosowan++;
            trafienia = 0;
            lista.clear();

            while (lista.size() < 6) {
                int n = losowanie.nextInt(50);

                if (!lista.contains(n)) {
                    lista.add(n);
                }
            }


            for (int i =0; i < typy.size(); i++) {
                if (lista.contains(typy.get(i))) {
                    trafienia++;
                }

            }
        }
        long koniec = System.currentTimeMillis();
        long czas = (koniec - poczatek);
        System.out.println(lista);
        System.out.println(typy);
        System.out.println("liczba trafień:" + trafienia);
        System.out.println("Czas losowania:" + (czas  ) + "msek");
        System.out.println("liczba losowań:" +liczbalosowan);

    }
}
