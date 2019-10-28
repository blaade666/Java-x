package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtWIP extends Applet{
    TextField textfield2;
    TextField textfield1;
    Button button1;
    Button button2;
    Button button3;
    Button button4;


    public void init(){
        textfield1 = new TextField("",20);
        textfield2 = new TextField("",20);
        textfield1.addActionListener(new tf1Listener());
        textfield2.addActionListener(new tf2Listener());
        add(textfield1);
        add(textfield2);

        button1 = new Button("*");
        button1.addActionListener(new button1Listener);
        button2 = new Button("/");
        button2.addActionListener(new button2Listener);
        button3 = new Button("+");
        button3.addActionListener(new button3Listener);
        button4 = new Button("-");
        button4.addActionListener(new button4Listener);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
    public void paint(Graphics g){
        g.drawString("",20,40);
    }

}

