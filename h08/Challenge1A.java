package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Button;

public class Challenge1A extends Applet {

    public TextField insertname1;

    Button button1;
    Button button2;
    Button button3;

    int result1;
    int result2;
    int result3;

    public void init(){
        setSize(600, 800);

        button1 = new Button("Monique");
        button1Listener B1 = new button1Listener();
        button1.addActionListener( B1 );
        add(button1);

        button2 = new Button("Max");
        button2Listener B2 = new button2Listener();
        button2.addActionListener( B2 );
        add(button2);

        button3 = new Button("Bob");
        button3Listener B3 = new button3Listener();
        button3.addActionListener( B3 );
        add(button3);

        setBackground(Color.decode("#FFFFFF"));
    }
    public void paint(Graphics g){

        int Weight1 = result1;
        int Weight2 = result2;
        int Weight3 = result3;


        g.setColor(Color.BLACK);
        g.drawLine( 40, 100, 40, 600);
        g.drawLine(40, 600, 400, 600);

        g.drawString("100", 10, 104);
        g.drawString("  80", 10, 204);
        g.drawString("  60", 10, 304);
        g.drawString("  40", 10, 404);
        g.drawString("  20", 10, 504);
        g.drawString("    0", 10, 604);

        g.drawString("Monique", 95, 615);
        g.drawString("Max", 207, 615);
        g.drawString("Bob", 310, 615);

        g.setColor(Color.RED);
        g.fillRect(90, 600-(int)(100*Weight1/20), 50, (int)(100*Weight1/20));

        g.setColor(Color.RED);
        g.fillRect(200, 600-(int)(100*Weight2/20), 50, (int)(100*Weight2/20));

        g.setColor(Color.RED);
        g.fillRect(300, 600-(int)(100*Weight3/20), 50, (int)(100*Weight3/20));

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(40, 100 + 100 * i, 400, 100 + 100 * i);
    }
    class button1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int Weight1 = Integer.parseInt(insertname1.getText());
            result1 = Weight1;
            repaint();
        }
    }

    class button2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int Weight2 = Integer.parseInt(insertname1.getText());
            result2 = Weight2;
            repaint();
        }
    }

    class button3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int Weight3 = Integer.parseInt(insertname1.getText());
            result3 = Weight3;
            repaint();
        }
    }



}