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
    public void move( double celx, double cely) {
        double deltat = 1;

        double a = (cely - y)/(celx - x);
        double b = (y - a*x);
        if (Math.sqrt(Math.pow(cely - y, 2)) < 0.01 && Math.sqrt(Math.pow(celx - x,2)) < 0.01) {
            if (cely > y) {
                for (double i = 0; i + y <= cely; i ++) {
                    i = i/10;
                    y = y + i;
                    x = (y - b)/a;

                }
            } else if (cely < y) {
                for (double i = 0; cely + i <= y; i ++) {
                    i = i/10;
                    y = y + i;
                    x = (y - b)/a;

                }

            }
        }

    }

    public Position(double xx, double yy) {//
        x = xx;
        y = yy;
    }
}
