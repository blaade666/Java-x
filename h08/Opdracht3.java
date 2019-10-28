package h08;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet{
    TextField textfield;
    double number;
    double total;
    Button okButton;
    double btw;

    public void init(){
        textfield = new TextField("",20);
        btw = 1.21;
        total = 0.0;
        number = 0.0;

        okButton = new Button("Ok");
        okButton.addActionListener(new okButtonListener());
        textfield.addActionListener(new okButtonListener());
        add(okButton);
        add(textfield);
    }

    public void paint(Graphics g){
        g.drawString("Klik op 'ok' om de BTW prijs te berekenen " + total,20,45);
    }

    class okButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double input = Double.parseDouble(textfield.getText());
            total = input * 1.21;
            repaint();
        }
    }



}
