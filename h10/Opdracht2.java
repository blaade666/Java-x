package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht2 extends Applet {
    Label labelTextField;
    TextField TextField1;
    String NumberString;
    Boolean Boolean1;
    int number1, number2, number3;

    public void init() {
        setSize(350, 150);
        labelTextField = new Label("Add a number and click on enter.");
        add(labelTextField);
        TextField1 = new TextField("", 5);
        TextField1.addActionListener(new TekstVakListener());
        add(TextField1);

        number2 = Integer.MIN_VALUE;
        number3 = Integer.MAX_VALUE;
    }

    class TekstVakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Boolean1 = true;
            NumberString = TextField1.getText();
            number1 = Integer.parseInt(NumberString);
            if (number1 > number2) {
                number2 = number1;
            }
            if (number1 < number3) {
                number3 = number1;
            }

            repaint();
        }
    }

    public void paint(Graphics g) {
        if (Boolean1) {
            g.drawString("Highest number = " + number2, 10, 50);
            g.drawString("Lowest number = " + number3, 10, 75);
        }
    }
}

