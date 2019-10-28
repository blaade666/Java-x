package h08;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Challenge1 extends Applet{
    Color yellow;
    Color black;
    Color green;
    Color blue;
    Color red;

    String textV;
    String textJ;
    String textH;

    int tV;
    int tJ;
    int tH;
    int yMonique;
    int hMonique;
    int yMax;
    int hMax;
    int yBob;
    int hBob;

    int YAsHeight;
    int XAsLength;

    Button showButton;

    TextField textMonique;
    TextField textMax;
    TextField textBob;

    Label MoniqueLabel;
    Label MaxLabel;
    Label BobLabel;

    public void init(){
        setBackground(Color.white);

        yellow = Color.yellow;
        black = Color.black;
        green = Color.green;
        blue = Color.blue;
        red = Color.red;

        YAsHeight = 399;
        XAsLength = 310;

        hMonique = 120;
        yMonique = YAsHeight - hMonique;
        hMax = 0;
        yMax = YAsHeight - hMax;
        hBob = 0;
        yBob = YAsHeight - hBob;

        textMonique = new TextField("0",10);
        textMonique.addActionListener(new show1ButtonListener());
        MoniqueLabel = new Label("Monique ");

        textMax = new TextField("0",10);
        textMax.addActionListener(new show1ButtonListener());
        MaxLabel = new Label("Max ");

        textBob = new TextField("0",10);
        textBob.addActionListener(new show1ButtonListener());
        BobLabel = new Label("Bob ");

        showButton = new Button("Toon");
        showButton.addActionListener(new show1ButtonListener());

        add(MoniqueLabel);
        add(textMonique);
        add(MaxLabel);
        add(textMax);
        add(BobLabel);
        add(textBob);
        add(showButton);
    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.drawLine(100,40,100,YAsHeight);

        g.setColor(Color.black);
        g.drawLine(100,YAsHeight,XAsLength,YAsHeight);

        g.setColor(red);
        g.drawRect(105,yMonique,60,hMonique);
        g.fillRect(105,yMonique,60,hMonique);

        g.setColor(red);
        g.drawRect(175,yMax,60,hMax);
        g.fillRect(175,yMax,60,hMax);

        g.setColor(red);
        g.drawRect(245,yBob,60,hBob);
        g.fillRect(245,yBob,60,hBob);

        g.setColor(black);
        g.drawString("0KG",49,399);
        g.drawString("20KG       ___",49,339);
        g.drawString("40KG       ___",49,279);
        g.drawString("60KG       ___",49,219);
        g.drawString("80KG       ___",49,159);
        g.drawString("100KG     ___",48,99);
        g.drawString("120KG     ___",48,39);
    }

    class show1ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            textV = textMonique.getText();
            tV = Integer.parseInt(textV);

            textJ = textMonique.getText();
            tJ = Integer.parseInt(textJ);

            textH = textMonique.getText();
            tH = Integer.parseInt(textH);

            yMonique = YAsHeight - hMonique;
            yMax = YAsHeight - hMax;
            yBob = YAsHeight - hBob;

            hMonique = tV;
            hMax = tJ;
            hBob = tH;

            repaint();
        }
    }
}
