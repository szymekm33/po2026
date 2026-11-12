package agh.po.zadania;

import agh.po.animals.Animal;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    public void fillZoo() {
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int number = random.nextInt(3);

            // Jeśli wylosowano 0, tworzymy psa
            if (number == 0) {
                animals[i] = new Dog("Burek");

                // Jeśli wylosowano 1, tworzymy papugę
            } else if (number == 1) {
                animals[i] = new Parrot("Koko");

                // Jeśli wylosowano 2, tworzymy węża
            } else {
                animals[i] = new Snake("Kaa");
            }


        }
    }
    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.fillZoo();
    }



}
