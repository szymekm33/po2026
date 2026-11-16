package agh.po.animals;

public abstract class Animal {
    String name;
    int legs;
    public abstract String getDescription();

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }
    public int getLegs() {
        return legs;
    }
    public abstract void makeSound();



}
