package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet{
    public void init () {setBackground (Color.white); }

    public void paint (Graphics g) {
        g. setColor(Color.blue);
        g.drawString("Douwe",75, 62);
        g. setColor(Color.blue);
        g.drawString("Duijster", 75, 75);
    }
}
