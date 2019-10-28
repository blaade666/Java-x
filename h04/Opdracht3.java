package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    public void init() {setBackground(Color.yellow);}

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(30,30,320,70);
        g.fillRect(30,30,320,70);
        g.setColor(Color.white);
        g.drawRect(30,100,320,70);
        g.fillRect(30,100,320,70);
        g.setColor(Color.blue);
        g.drawRect(30,170,320,70);
        g.fillRect(30,170,320,70);
        g.setColor(Color.black);
        g.drawRect(25,30,10,320);
        g.fillRect(25,30,10,320);
    }
}
