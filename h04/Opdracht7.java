package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet{
    public void init(){setBackground(Color.white);}

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRoundRect(25,25,250,250,25,25);
        g.setColor(Color.black);
        g.drawArc(30,30,100,100,360,360);
        g.fillArc(30,30,100,100,360,360);
        g.setColor(Color.black);
        g.drawArc(170,30,100,100,360,360);
        g.fillArc(170,30,100,100,360,360);
        g.setColor(Color.black);
        g.drawArc(30,170,100,100,360,360);
        g.fillArc(30,170,100,100,360,360);
        g.setColor(Color.black);
        g.drawArc(170,170,100,100,360,360);
        g.fillArc(170,170,100,100,360,360);
    }
}