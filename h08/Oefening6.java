package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OefeningMAXOR6 extends Applet {
    float result;
    TextField field;
    Button button;

    public void init(){
        field = new TextField("Bedrag",30);
        button = new Button("OK");
        ButtonListener k1 = new ButtonListener();
        button.addActionListener(new ButtonListener());
        field.addActionListener(new ButtonListener());
        add(field);
        add(button);
    }

    public  void paint(Graphics g){
        g.drawString("Bedrag inclusief 21% BTW: " + result,65,50);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            float input = Float.parseFloat(field.getText());
            result = input /100*121;
            repaint();
        }
    }
}