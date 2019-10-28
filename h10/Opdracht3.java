package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    Label label1;
    TextField TextField1;
    Button OkButton;
    String StringMonth;
    int Month1;


    public void init() {
        setSize(210, 100);
        label1 = new Label("Insert a number of a month = ");
        add(label1);

        TextField1 = new TextField("", 5);
        TextField1.addActionListener(new KnopOkListener());
        add(TextField1);

        OkButton = new Button();
        OkButton.setLabel("Ok");
        OkButton.addActionListener(new KnopOkListener());
        add(OkButton);

        StringMonth = "";
    }

    public void paint(Graphics g) {
        g.drawString("Month:", 15, 75);
        g.drawString(StringMonth, 15, 95);
    }


    class KnopOkListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StringMonth = TextField1.getText();
            Month1 = Integer.parseInt(StringMonth);
            switch (Month1) {
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
                    StringMonth = "Type a number between 1 and 12.";
                    break;
            }
            repaint();
        }
    }
}
