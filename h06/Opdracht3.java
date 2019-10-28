package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet{
    int Grootgetal;
    int Kleingetal;
    int uitkomst;

    public void init(){
        Grootgetal = 666;
        Kleingetal = 1;
        uitkomst = Grootgetal + Kleingetal;
    }
    public void paint(Graphics g){
        g.drawString("uitkomst = " + uitkomst,20,20);
    }
}
