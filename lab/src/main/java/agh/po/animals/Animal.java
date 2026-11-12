package agh.po.animals;

public abstract class Animal {
    String name;
    Integer legs;
    public abstract String getDescription();

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }


}
