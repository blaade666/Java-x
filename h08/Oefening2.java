package h08;
import java.awt.*;
import java.applet.*;

public class Oefening2 extends Applet {
    TextField tekstvak;
    Label label;

    public void init(){
        tekstvak = new TextField("clcik dis",20);
        label = new Label("type hier");
        add(label);
        add(tekstvak);
    }
    public void paint(Graphics G){}

}
