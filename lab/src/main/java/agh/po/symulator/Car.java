package agh.po.symulator;

public class Car {
    boolean onState;
    String carID;
    String carModel;
    int vMax;

    Engine engine;
    Gearbox gearbox; //można tworzyć niezależne obiekty z klasy Gearbox w polu o nazwie gearbox
    Clutch clutch;
    Position position;


    public void turnOn() {

        engine.start();
        onState = true;
    }

    public void turnOff() {
        engine.stop();
        gearbox.currentGear = 0;
        onState = false;
    }
    public Car(int speed, String emodel, int count, double xx, double yy) { // konstruktor który tworzy samochód z silnikiem z podaną wartością engdifspeed
        engine = new Engine(speed, emodel);
        gearbox = new Gearbox(count);
        clutch = new Clutch();
        position = new Position(xx, yy);
    }
    public Car(Engine e, Gearbox g, Clutch c, Position p) { // konstruktor który tworzy samochód z podanych komponentów
               engine = e;
               gearbox = g;
               clutch = c;
               position = p;//asdf
    }


    public static void main(String[] args) {
        //tworzenie auta pierwszym konstruktorem
        Car car1 = new Car(800, "silnikbwm", 5, 0, 0); //obiekt klasy Car o nazwie car
        car1.turnOn();
        Car car2 = new Car(1000,"silnik audi", 5, 0, 0);

        //tworze auto drugim konstruktorem
        Position pozycjagolfa = new Position(10, 34);
        Clutch niedzialajacadwumasa = new Clutch();
        Engine tdi = new Engine(900, "1.9 TDI");
        Gearbox skrzynia = new Gearbox(5);
        Car golf = new Car(tdi, skrzynia, niedzialajacadwumasa, pozycjagolfa);
        golf.turnOn();
        golf.gearbox.currentGear = 3;
        golf.gearbox.gearUp();
        golf.gearbox.gearDown();
        golf.clutch.press();

        System.out.println(pozycjagolfa.getPosition());
        pozycjagolfa.updatePosition(90, 66.1);
        golf.displayStatus();



           }

    public void displayStatus() {
        System.out.println(position.getPosition());
        System.out.println("current gear is: " + gearbox.currentGear);
        System.out.println("Engine: " + engine.model);
        System.out.println("Engine speed: " + engine.engSpeed);
        System.out.println("Clutch state: " + clutch.clutchState);


    }


}
