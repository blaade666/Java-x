package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init(){
    }

    public void paint(Graphics i) {
        int[] xPoints = {10, 250, 135};
        int[] yPoints = {250, 250, 60};
        int numPoints = 3;
        i.setColor(Color.black);
        i.fillPolygon(xPoints, yPoints, numPoints);
        i. setColor(Color.black);
        i. drawRect(30,230,200,200);
        i.setColor(Color.black);
        i.drawRect(60,260,40,60);
        i.fillRect(130,350,40,80);

    }
}
