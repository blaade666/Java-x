package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{
    public void init(){setBackground(Color.blue);}

    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillArc(40,40,250,100,360,360);
    }
}
