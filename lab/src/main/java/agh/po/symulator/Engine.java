package agh.po.symulator;

public class Engine extends Component{
    int maxengSpeed;
    int engSpeed;
    int defengSpeed;
    public  void start() {
        engSpeed = defengSpeed;
    }

    public void stop() {
        engSpeed = 0;
    }
    public Engine(int speed, String emodel) { //konstruktor silnika
        defengSpeed = speed;
        model = emodel;
    }
}
