package agh.po.symulator;

public class Clutch extends Component {
    boolean clutchState;
    public boolean press() {
        clutchState = true;
        return true;
    }
    public void release() {
        clutchState = false;

    }
}
