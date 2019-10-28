package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet{
    public void init(){setBackground(Color.white);}

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(80,10,1,300);
        g.setColor(Color.black);
        g.drawRect(80,310,300,1);
        g.setColor(Color.green);
        g.drawRect(85,190,60,119);
        g.fillRect(85,190,60,119);
        g.setColor(Color.yellow);
        g.drawRect(155,9,60,300);
        g.fillRect(155,9,60,300);
        g.setColor(Color.blue);
        g.drawRect(225,69,60,240);
        g.fillRect(225,69,60,240);

        g.setColor(Color.black);
        g.drawString("100KG",10,19);
        g.setColor(Color.black);
        g.drawString("80KG",10,79);
        g.setColor(Color.black);
        g.drawString("60KG",10,139);
        g.setColor(Color.black);
        g.drawString("40KG",10,199);
        g.setColor(Color.black);
        g.drawString("20KG",10,259);
        g.setColor(Color.black);
        g.drawString("0KG",10,319);

        g.setColor(Color.black);
        g.drawString("Valerie",95,330);
        g.setColor(Color.black);
        g.drawString("Jeroen",165,330);
        g.setColor(Color.black);
        g.drawString("Hans",239,330);
    }
}