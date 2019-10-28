package h11;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd11_1 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;

	int y = 100;
	
	public void init() {
		
	}

	public void paint(Graphics g) {
		resize(800, 700);
		for(int i = 0; i < 10; i++) {
			g.drawLine(100, y, 600, y);
			y += 10;
		}
	}
}
