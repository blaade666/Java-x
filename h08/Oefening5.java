package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Oefening5 extends Applet {
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een nummer");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();
        }
    }
}