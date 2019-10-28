package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Oefening1GuideFail extends Applet {
    Button knop;
    String schermtekst;

    public void init(){
       schermtekst = "what the frick men";
        knop = new Button("oop");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g){
        g.drawString("what the frick men.",50,60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ){
            schermtekst = "beanheadlookinass";
            repaint();
        }
    }
}
