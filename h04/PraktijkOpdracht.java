package h04;
import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {
    public void init(){setBackground(Color.white);}

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawString("Lijn",95,35);
        g.setColor(Color.black);
        g.drawRect(20,20,175,1);

        g.setColor(Color.black);
        g.drawRect(20, 50,175,100);
        g.setColor(Color.black);
        g.drawString("Rechthoek", 77,165);

        g.setColor(Color.black);
        g.drawRoundRect(20,185,175,100,25,25);
        g.drawString("Afgeronde rechthoek", 50, 300);

        g.setColor(Color.magenta);
        g.drawRect(210,50,175,100);
        g.fillRect(210,50,175,100);
        g.setColor(Color.black);
        g.drawArc(210,50,175,100,360,360);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal",216,165);

        g.setColor(Color.magenta);
        g.drawArc(210,185,175,100,360,360);
        g.fillArc(210,185,175,100,360,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",260,300);

        g.setColor(Color.black);
        g.drawArc(400,50,175,100,360,360);
        g.setColor(Color.magenta);
        g.fillArc(400,50,175,100,360,40);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 400,165);

        g.setColor(Color.black);
        g.drawArc(435,185,100,100,360,360);
        g.setColor(Color.black);
    }
}
