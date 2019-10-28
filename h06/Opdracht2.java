package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    int Sec;
    int Uur;
    int Dag;
    int Jaar;
    double uitkomst1;
    double uitkomst2;
    double uitkomst3;

    public void init() {
        Sec = 60;
        Uur = 60;
        Dag = 24;
        Jaar = 365;
        uitkomst1 = Sec * Uur;
        uitkomst2 = uitkomst1 * Dag;
        uitkomst3 = uitkomst2 * Jaar;
    }

    public void paint(Graphics g){
        g.drawString("De aantal seconden in een uur zijn " + uitkomst1,20,20);
        g.drawString("De aantal seconden in een dag zijn " + uitkomst2,20,40);
        g.drawString("De aantal seconden in een jaar zijn " + uitkomst3,20,60);
    }
}
