package agh.po.symulator;

public class Gearbox extends Component{
    int currentGear;
    int gearCount;
    public void gearUp() {
        if (currentGear < gearCount && currentGear >= 0) {
            currentGear ++;
        }
    }
    public void gearDown() {
        if (currentGear > 0) {
            currentGear = currentGear -1;
        }
    }
    public Gearbox(int count) {
        if ( count > 0) {
            gearCount = count;

        }
    }


}
