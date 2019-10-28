package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;



public class Opd12_2 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;

	private Button[] but = new Button[25];
	
	public void init() {
		resize(800, 600);
		setBackground(Color.DARK_GRAY);
		
		for(int i = 0; i < but.length; i++) {
			but[i] = new Button(Integer.toString(i + 1));
		}
		
		int i = 0;
		while(i < but.length) {
			add(but[i]);
			but[i].setForeground(new Color(255 - (i * 10), 0 + (i * 5), 255 - (i * 8)));
			i++;
		}
	}

	public void paint(Graphics g) {
		resize(800, 700);
		
	}
}
