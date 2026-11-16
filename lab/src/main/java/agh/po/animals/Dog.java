package agh.po.animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, 4);
    }

    @Override
    public String getDescription() {
        return "Jestem psem " + name;
    }

    public static void main(String[] args) {
        Dog burek = new Dog("Burek");
        System.out.println(burek.name + " " + burek.legs + " opis: " + burek.getDescription() + "\n");
        System.out.println(burek.getLegs() + "\n");
        burek.makeSound();

    }
    public void makeSound() {
        System.out.println("hau hau");

    }
}
