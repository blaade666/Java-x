package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet{
    TextField textfield;
    Double number;
    Button buttonDad;
    Button buttonMom;
    Button buttonBoy;
    Button buttonGirl;

    int Dad;
    int Mom;
    int Boy;
    int Girl;
    int Total;

    public void init (){
        // textfield = new TextField("",5);
        Dad = 0;
        Mom = 0;
        Boy = 0;
        Girl = 0;
        Total = 0;

        buttonDad = new Button ("Fathers");
        buttonDad.addActionListener(new buttonDadListener());
        buttonMom = new Button ("Mothers");
        buttonMom.addActionListener(new buttonMomListener());
        buttonBoy = new Button ("Boys");
        buttonBoy.addActionListener(new buttonBoyListener());
        buttonGirl = new Button ("Girls");
        buttonGirl.addActionListener(new buttonGirlListener());
        add(buttonDad);
        add(buttonMom);
        add(buttonBoy);
        add(buttonGirl);



    }
    public void paint(Graphics g){
        g.drawString("Fathers: " + Dad,20,50);
        g.drawString("Mothers: "+ Mom, 20,65);
        g.drawString("Boys: " + Boy, 20,80);
        g.drawString("Girls: " + Girl, 20,95);
        g.drawString("Total: " + Total,20,110);

    }
    class buttonDadListener implements ActionListener {
        public void actionPerformed( ActionEvent e){
            Dad++ ;
            Total++;
            repaint();

        }
    }
    class buttonMomListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Mom++;
            Total++;
            repaint();
        }
    }
    class buttonBoyListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Boy++;
            Total++;
            repaint();
        }
    }
    class buttonGirlListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Girl++;
            Total++;
            repaint();
        }
    }
}