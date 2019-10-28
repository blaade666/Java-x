package h11;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd11_5 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	
	
	public void init() {
		
	}

	public void paint(Graphics g) {
		resize(800, 700);
		
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
			g.drawRect(i * 50, i * 50, 50, 50);
		}
	}
}
