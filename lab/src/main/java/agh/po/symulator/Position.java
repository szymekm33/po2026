package agh.po.symulator;

public class Position {
    double x;
    double y;
    public void updatePosition(double deltaX, double deltaY) {
        x = x + deltaX;
        y = y + deltaY;
    }
    public String getPosition() {
        return "Current position is: (" + x + "," + y + ")";
    }

    public Position(double xx, double yy) {
        x = xx;
        y = yy;
    }
}
