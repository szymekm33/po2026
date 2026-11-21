package agh.po.symulator;

public class Clutch extends Component {
    boolean clutchState;
    public void press() {
        clutchState = true;
    }
    public void release() {
        clutchState = false;
    }
}
