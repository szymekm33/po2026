package agh.po.symulator;

public class Gearbox extends Component{
    int currentGear;
    int gearCount;
    public void gearUp() {
        if (currentGear < gearCount) {
            currentGear ++;
        }
    }
    public void gearDown() {
        if (currentGear > 0) {
            currentGear = currentGear -1;
        }
    }


}
