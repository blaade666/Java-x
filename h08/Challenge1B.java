package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.Button;

public class Challenge1xd extends Applet {

    public TextField textMonique;
    public TextField textMax;
    public TextField textBob;

    Button showButton;

    int result1;
    int result2;
    int result3;

    Label MoniqueLabel;
    Label MaxLabel;
    Label BobLabel;

    public void init(){
        setSize(600, 800);

        MoniqueLabel = new Label("Monique ");
        textMonique = new TextField("",10);
        textMonique.addActionListener(new showButtonListener());

        MaxLabel = new Label("Max ");
        textMax = new TextField("",10);
        textMax.addActionListener(new showButtonListener());

        BobLabel = new Label("Bob");
        textBob = new TextField("",10);
        textBob.addActionListener(new showButtonListener());

        showButton = new Button("Show");
        showButton.addActionListener(new showButtonListener());

        add(MoniqueLabel);
        add(textMonique);
        add(MaxLabel);
        add(textMax);
        add(BobLabel);
        add(textBob);
        add(showButton);
    }

    public void paint(Graphics g){
        int MoniqueWeight = result1;
        int MaxWeight = result2;
        int BobWeight = result3;

        g.setColor(Color.black);
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

        g.setColor(Color.red);
        g.fillRect(90, 600-(int)(100*MoniqueWeight/20), 50, (int)(100*MoniqueWeight/20));

        g.setColor(Color.red);
        g.fillRect(200, 600-(int)(100*MaxWeight/20), 50, (int)(100*MaxWeight/20));

        g.setColor(Color.red);
        g.fillRect(300, 600-(int)(100*BobWeight/20), 50, (int)(100*BobWeight/20));

        g.setColor(Color.decode("#BBBBBB"));
        for(int i = 0; i < 5; i++)
            g.drawLine(40, 100 + 100 * i, 400, 100 + 100 * i);
    }
    class showButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            int MoniqueWeight = Integer.parseInt(textMonique.getText());
            result1 = MoniqueWeight;
            int MaxWeight = Integer.parseInt(textMax.getText());
            result2 = MaxWeight;
            int BobWeight = Integer.parseInt(textBob.getText());
            result3 = BobWeight;
            repaint();
        }
    }
}