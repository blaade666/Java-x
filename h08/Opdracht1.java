package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    TextField textfield;
    Button button;
    Button buttonReset;

    public void init(){
        textfield = new TextField("",30);
        button = new Button("oop");
        button.addActionListener(new ButtonListener());
        add(textfield);
        add(button);

        buttonReset = new Button ("Reset");
        buttonReset.addActionListener(new ButtonListener2());
        add(buttonReset);
    }
    public void paint(Graphics g){
        g.drawString("Insert your text here " +
                "in the text bar " +
                "and click on 'oop'",40,70 );

    }
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            textfield.setText("it's a, " +
                    "yung fool boolin.");
        }
    }
    class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            textfield.setText("");
            repaint();
        }
    }
}
