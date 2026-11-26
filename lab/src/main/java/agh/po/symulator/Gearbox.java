package agh.po.symulator;

public class Gearbox extends Component{
    int currentGear;
    int gearCount;
    Clutch clutch;

    public void gearUp(Clutch clutch) {

        if (clutch.press() ) {
            if (currentGear < gearCount && currentGear >= 0) {
                currentGear++;
            }
        }
    }
    public void gearDown() {

        if ( clutch.press() && currentGear > 0) {
            currentGear = currentGear -1;
        }
    }
    public Gearbox(int count) {

        if ( count > 0) {
            gearCount = count;

        }
    }


}
