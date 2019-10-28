package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class PraktijkOpdracht extends Applet {
    Label label1;
    TextField TextField1;
    Button okButton;
    String string1;
    double double1;
    boolean clicked;
    DecimalFormat fmt1;


    public void init() {
        setLayout(null);

        label1 = new Label("Insert a number = ");
        label1.setBounds(10, 10, 75, 25);
        add(label1);

        TextField1 = new TextField("", 4);
        TextField1.addActionListener(new ButtonOkListener());
        TextField1.setBounds(95, 10, 40, 20);
        add(TextField1);

        okButton = new Button("Calculate");
        okButton.addActionListener(new ButtonOkListener());
        okButton.setBounds(150, 10, 75, 20);
        add(okButton);

        string1 = "";
        fmt1 = new DecimalFormat("#.#");
    }


    public void paint(Graphics g) {
        if (clicked) {
            g.drawString("Number " + fmt1.format(double1) + " is " + string1, 10, 50);
        }
    }


    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clicked = true;
            double1 = Double.parseDouble(TextField1.getText());

            if (double1 > 0.0) {
                string1 = "bad.";
            }
            if (double1 > 3.999) {
                string1 = "inadequate.";
            }
            if (double1 > 4.999) {
                string1 = "average.";
            }
            if (double1 > 5.999) {
                string1 = "sufficient";
            }
            if (double1 > 7.999) {
                string1 = "good";
            }
            if (double1 > 10.0) {
                string1 = "not possible";
            }
            if (double1 < 0.0) {
                string1 = "not possible";
            }
            repaint();
        }
    }

}


