package h02;

import java.awt.*;
import java.applet.*;

public class oefening1 extends Applet {
    public void init() {
        setBackground(new Color(255,248, 220));
    }
    public void paint (Graphics g) {
        g. setColor(new Color(128, 0,0));
        g .drawString("text is mogelijk pog.", 50, 70);

    }
}