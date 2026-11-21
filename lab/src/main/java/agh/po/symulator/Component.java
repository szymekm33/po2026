package agh.po.symulator;

public abstract class Component {
    String producent;
    String model;
    int weight;
    int price;


    public String getProducent() {
        return producent;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }

}
