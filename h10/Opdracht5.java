package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Opdracht5 extends Applet {
    Label labelHeader;
    TextField TextField1, TextField2, TextField3, TextField4, TextField5;
    Button okButton;
    String stringAverage, string1, string2, string3, string4, string5;
    double doubleAverage, double1, double2, double3, double4, double5;
    DecimalFormat Fmt;


    public void init() {
        setSize(180, 250);
        setLayout(null);

        labelHeader = new Label("Insert the numbers = ");
        labelHeader.setBounds(10, 10, 100, 25);
        add(labelHeader);

        TextField1 = new TextField("", 4);
        TextField1.addActionListener(new ButtonOkListener());
        TextField1.setBounds(10, 60, 40, 20);
        add(TextField1);

        TextField2 = new TextField("", 4);
        TextField2.addActionListener(new ButtonOkListener());
        TextField2.setBounds(10, 85, 40, 20);
        add(TextField2);

        TextField3 = new TextField("", 4);
        TextField3.addActionListener(new ButtonOkListener());
        TextField3.setBounds(10, 110, 40, 20);
        add(TextField3);

        TextField4 = new TextField("", 4);
        TextField4.addActionListener(new ButtonOkListener());
        TextField4.setBounds(10, 135, 40, 20);
        add(TextField4);

        TextField5 = new TextField("", 4);
        TextField5.addActionListener(new ButtonOkListener());
        TextField5.setBounds(10, 160, 40, 20);
        add(TextField5);

        okButton = new Button("Ok");
        okButton.addActionListener(new ButtonOkListener());
        okButton.setBounds(10, 220, 40, 20);
        add(okButton);

        string1 = "";
        string2 = "";
        string3 = "";
        string4 = "";
        string5 = "";
        stringAverage = "";
        Fmt = new DecimalFormat("#.##");
    }


    public void paint(Graphics g) {
        g.drawString("" + string1, 100, 70);
        g.drawString("" + string2, 100, 95);
        g.drawString("" + string3, 100, 120);
        g.drawString("" + string4, 100, 145);
        g.drawString("" + string5, 100, 170);
        g.drawString("Average = " + Fmt.format(doubleAverage) + "   " + stringAverage, 10, 200);
    }


    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double1 = Double.parseDouble(TextField1.getText());
            if (double1 < 5.5) {
                string1 = "Inadequate";
            } else {
                string1 = "Sufficient";
            }

            double2 = Double.parseDouble(TextField2.getText());
            if (double2 < 5.5) {
                string2 = "Inadequate";
            } else {
                string2 = "Sufficient";
            }

            double3 = Double.parseDouble(TextField3.getText());
            if (double3 < 5.5) {
                string3 = "Inadequate";
            } else {
                string3 = "Sufficient";
            }

            double4 = Double.parseDouble(TextField4.getText());
            if (double4 < 5.5) {
                string4 = "Inadequate";
            } else {
                string4 = "Sufficient";
            }

            double5 = Double.parseDouble(TextField5.getText());
            if (double5 < 5.5) {
                string5 = "Inadequate";
            } else {
                string5 = "Sufficient";
            }

            doubleAverage = ((double1 + double2 + double3 + double4 + double5) / 5.0);
            stringAverage = Double.toString(doubleAverage);
            if (doubleAverage < 5.5) {
                stringAverage = "Inadequate";
            } else {
                stringAverage = "Sufficient";
            }
            repaint();
        }
    }
}