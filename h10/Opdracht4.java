package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht4 extends Applet {
    Label labelMonth, labelYear;
    TextField textfield1, textfield2;
    Button okButton;
    String StringMonth, StringYear, StringIntercalary;
    int iMaand, iJaar;

    public void init() {
        setSize(300, 150);
        labelMonth = new Label("Insert a number of a month = ");
        add(labelMonth);
        textfield1 = new TextField("", 5);
        textfield1.addActionListener(new KnopOkListener());
        add(textfield1);
        StringMonth = "";

        labelYear = new Label("Insert a year = ");
        add(labelYear);
        textfield2 = new TextField("", 5);
        textfield2.addActionListener(new KnopOkListener());
        add(textfield2);
        StringYear = "";

        okButton = new Button();
        okButton.setLabel("Ok");
        okButton.addActionListener(new KnopOkListener());
        add(okButton);
    }

    public void paint(Graphics g) {
        g.drawString("Month = " + StringMonth, 15, 125);
        g.drawString(StringIntercalary, 15, 145);
    }

    class KnopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringMonth = textfield1.getText();
            iMaand = Integer.parseInt(StringMonth);
            switch (iMaand) {
                case 1:
                    StringMonth = "January";
                    break;
                case 2:
                    StringMonth = "February";
                    break;
                case 3:
                    StringMonth = "March";
                    break;
                case 4:
                    StringMonth = "April";
                    break;
                case 5:
                    StringMonth = "May";
                    break;
                case 6:
                    StringMonth = "June";
                    break;
                case 7:
                    StringMonth = "July";
                    break;
                case 8:
                    StringMonth = "August";
                    break;
                case 9:
                    StringMonth = "September";
                    break;
                case 10:
                    StringMonth = "October";
                    break;
                case 11:
                    StringMonth = "November";
                    break;
                case 12:
                    StringMonth = "December";
                    break;
                default:
                    StringMonth = "Insert a number between 1 and 12.";
                    break;
            }
            StringIntercalary = textfield2.getText();
            iJaar = Integer.parseInt(StringIntercalary);
            if ((iJaar % 4 == 0 && !(iJaar % 100 == 0)) || iJaar % 400 == 0) {
                StringIntercalary = "" + iJaar + " is a intercalary day.";
            } else {
                StringIntercalary = "" + iJaar + " is not a intercalary day.";
            }

            repaint();
        }
    }
}