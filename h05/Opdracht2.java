package h05;
import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet {

    Color yellow;
    Color black;
    Color green;
    Color blue;
    int YAsHeight;
    int XAsLength;
    int yMonique;
    int hMonique;
    int yMax;
    int hMax;
    int yBob;
    int hBob;

    public void init() {
        yellow = Color.yellow;
        black = Color.black;
        green = Color.green;
        blue = Color.blue;
        YAsHeight = 300;
        XAsLength = 205;
        hMonique = 30;
        yMonique = YAsHeight - hMonique + 9;
        hMax = 200;
        yMax = YAsHeight - hMax + 9;
        hBob = 120;
        yBob = YAsHeight - hBob + 9;
    }


    public void paint(Graphics g) {
        g.setColor(black);
        g.drawRect(80, 10, 1, YAsHeight);

        g.setColor(black);
        g.drawRect(80, 310, XAsLength, 1);

        g.setColor(green);
        g.drawRect(85, yMonique, 60, hMonique);
        g.fillRect(85, yMonique, 60, hMonique);
        g.setColor(yellow);
        g.drawRect(155, yMax, 60, hMax);
        g.fillRect(155, yMax, 60, hMax);
        g.setColor(blue);
        g.drawRect(225, yBob, 60, hBob);
        g.fillRect(225, yBob, 60, hBob);

        g.setColor(black);
        g.drawString("100KG", 10, 19);
        g.setColor(black);
        g.drawString("80KG", 10, 79);
        g.setColor(black);
        g.drawString("60KG", 10, 139);
        g.setColor(black);
        g.drawString("40KG", 10, 199);
        g.setColor(black);
        g.drawString("20KG", 10, 259);
        g.setColor(black);
        g.drawString("0KG", 10, 319);

        g.setColor(black);
        g.drawString("Monique", 95, 330);
        g.setColor(black);
        g.drawString("Max", 165, 330);
        g.setColor(black);
        g.drawString("Bob", 239, 330);
    }
}