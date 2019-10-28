package h11;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd11_7 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	
	
	public void init() {
		
	}

	public void paint(Graphics g) {
		resize(1100, 900);
		
		for(int i = 1; i < 51; i++) {
			System.out.println(i);
			g.drawArc(-i * 5 + 500, -i * 5 + 500, i * 10, i * 10, 0, 360);
		}
	}
}
