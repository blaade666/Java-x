package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics i) {
        int[] xPoints = {10, 250, 135};
        int[] yPoints = {250, 250, 60};
        int numPoints = 3;
        i.setColor(Color.black);
        i.fillPolygon(xPoints, yPoints, numPoints);
    }
}