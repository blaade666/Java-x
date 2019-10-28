package h13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd13_2 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;
	
	public void init() {
		setBackground(new Color(21, 121, 10));
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		g.setColor(Color.yellow);
		baksteen(g, 50, 50, 100, 50);
	}
	
	private void baksteen(Graphics g, int x, int y, int w, int h) {
		for(int j = 0; j < 20; j++) {
			for(int i = 0; i < 10; i++) {
				g.drawRect(x + (i * 50) + (j * 100) - 500, y + (i * 50), w, h);
			}
		}
	}
}
