package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    int Personen;
    int Karwei;
    double uitkomst;

    public void init(){
        Personen = 4;
        Karwei = 113;
        uitkomst = Karwei / Personen;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal euro per persoon wordt " + uitkomst, 20,20);
        g.drawString("Jan krijgt " + uitkomst, 20,40);
        g.drawString("Ali krijgt " + uitkomst,20,60);
        g.drawString("Jeannette krijgt " + uitkomst, 20, 80);
        g.drawString("Ik krijg " + uitkomst, 20, 100);
    }
}
