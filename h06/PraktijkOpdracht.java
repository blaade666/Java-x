package h06;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet{
    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double uitkomst;
    double uitkomst2;
    int uitkomst3;
    double uitkomst4;
    double uitkomst5;

    public void init(){
        Cijfer1 = 5.9;
        Cijfer2 = 6.3;
        Cijfer3 = 6.9;
        uitkomst = (Cijfer1 + Cijfer2 + Cijfer3) / 3;
        uitkomst2 = uitkomst * 10;
        uitkomst3 = (int) uitkomst2;
        uitkomst4 = (double) uitkomst3;
        uitkomst5 = uitkomst4 / 10;
    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is " + uitkomst5,20,20);
    }
}
