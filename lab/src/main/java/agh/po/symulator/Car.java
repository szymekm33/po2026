package agh.po.symulator;

public class Car {
    boolean onState;
    String carID;
    String carModel;
    int vMax;




    Engine engine;
    Gearbox gearbox;






    public void turnOn() {
        engine.start();
    }
    public void turnOff() {
        engine.stop();

    }
    public static void main(String[] args) {
        Car car = new Car();

    }
}
